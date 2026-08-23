import os
import shutil
import subprocess

src_dir = 'mod_indo_extracted'
dst_dir = 'mod/Prehistoric_Tribes_Mod'

# 1. Copy all files from mod_indo_extracted to mod/Prehistoric_Tribes_Mod
print("Copying Indonesian Mod files...")
for root, dirs, files in os.walk(src_dir):
    rel_path = os.path.relpath(root, src_dir)
    target_path = dst_dir if rel_path == '.' else os.path.join(dst_dir, rel_path)
    os.makedirs(target_path, exist_ok=True)
    for file in files:
        s_file = os.path.join(root, file)
        t_file = os.path.join(target_path, file)
        shutil.copy2(s_file, t_file)

# Copy icon.png to mod/icon.png
if os.path.exists('mod_indo_temp/Prehistoric Tribes Bahasa Indonesia/icon.png'):
    shutil.copy2('mod_indo_temp/Prehistoric Tribes Bahasa Indonesia/icon.png', 'mod/icon.png')

# 2. Update MANIFEST.MF & converted.dex.conf for Cheat-Support: on
manifest_path = os.path.join(dst_dir, 'META-INF/MANIFEST.MF')
if os.path.exists(manifest_path):
    with open(manifest_path, 'r', encoding='utf-8') as f:
        mf = f.read()
    if 'Cheat-Support' not in mf:
        mf += '\nCheat-Support: on\n'
    else:
        mf = mf.replace('Cheat-Support: off', 'Cheat-Support: on')
    with open(manifest_path, 'w', encoding='utf-8') as f:
        f.write(mf)

conf_path = 'mod/converted.dex.conf'
with open(conf_path, 'r', encoding='utf-8') as f:
    conf = f.read()
conf = conf.replace('Cheat-Support: off', 'Cheat-Support: on')
with open(conf_path, 'w', encoding='utf-8') as f:
    f.write(conf)

# 3. Apply Pop Limit 127 in b.class
b_class_path = os.path.join(dst_dir, 'b.class')
with open(b_class_path, 'rb') as f:
    b_data = bytearray(f.read())

if b_data[0x1b55] == 0x10 and b_data[0x1b56] == 0x32:
    b_data[0x1b56] = 0x7f
    print("Patched pop cap 50 -> 127 in b.class!")

with open(b_class_path, 'wb') as f:
    f.write(b_data)

# 4. Pack res.jar into mod/res.jar
print("Packing mod/res.jar...")
subprocess.run(['jar', 'cf', '../res.jar', '*'], cwd=dst_dir, check=True)

# 5. Pack Prehistoric_Tribes_Mod.jar
print("Packing mod/Prehistoric_Tribes_Mod.jar...")
subprocess.run(['jar', 'cfm', '../Prehistoric_Tribes_Mod.jar', 'META-INF/MANIFEST.MF', '*'], cwd=dst_dir, check=True)

# 6. Generate DEX using d8
print("Generating DEX via d8...")
d8_path = r"C:\Users\latif\Android\Sdk\build-tools\35.0.0\d8.bat"
os.makedirs('mod/build_dex_out', exist_ok=True)
res = subprocess.run([d8_path, '--output', 'mod/build_dex_out/', 'mod/Prehistoric_Tribes_Mod.jar'], capture_output=True, text=True)

if res.returncode == 0 or 'Warning' in res.stderr:
    dex_src = 'mod/build_dex_out/classes.dex'
    if os.path.exists(dex_src):
        os.replace(dex_src, 'mod/converted.dex')
        print("Generated valid mod/converted.dex!")

# Clean temporary folders
shutil.rmtree('mod_indo_temp', ignore_errors=True)
shutil.rmtree('mod_indo_extracted', ignore_errors=True)

print("Indonesian Mod Integration Complete!")
