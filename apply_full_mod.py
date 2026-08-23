import os
import subprocess

# 1. Update MANIFEST.MF & converted.dex.conf
manifest_path = 'mod/Prehistoric_Tribes_Mod/META-INF/MANIFEST.MF'
with open(manifest_path, 'r', encoding='utf-8') as f:
    m_content = f.read()

m_content = m_content.replace('Cheat-Support: off', 'Cheat-Support: on')
with open(manifest_path, 'w', encoding='utf-8') as f:
    f.write(m_content)

conf_path = 'mod/converted.dex.conf'
with open(conf_path, 'r', encoding='utf-8') as f:
    c_content = f.read()

c_content = c_content.replace('Cheat-Support: off', 'Cheat-Support: on')
with open(conf_path, 'w', encoding='utf-8') as f:
    f.write(c_content)

# 2. Patch b.class for Pop Cap (50 -> 127)
b_class_path = 'mod/Prehistoric_Tribes_Mod/b.class'
with open(b_class_path, 'rb') as f:
    b_data = bytearray(f.read())

# Patch bipush 50 (0x10 0x32) at offset 0x1b55 to bipush 127 (0x10 0x7f)
if b_data[0x1b55] == 0x10 and b_data[0x1b56] == 0x32:
    b_data[0x1b56] = 0x7f
    print("Patched pop cap 50 -> 127 in b.class!")

with open(b_class_path, 'wb') as f:
    f.write(b_data)

# 3. Repack mod JAR
print("Repacking mod JAR...")
subprocess.run(['jar', 'cfm', '../Prehistoric_Tribes_Mod.jar', 'META-INF/MANIFEST.MF', '*'], cwd='mod/Prehistoric_Tribes_Mod', check=True)

# 4. Generate clean DEX using d8
print("Running Android SDK d8...")
d8_path = r"C:\Users\latif\Android\Sdk\build-tools\35.0.0\d8.bat"
os.makedirs('mod/build_dex_out', exist_ok=True)
res = subprocess.run([d8_path, '--output', 'mod/build_dex_out/', 'mod/Prehistoric_Tribes_Mod.jar'], capture_output=True, text=True)

if res.returncode == 0 or 'Warning' in res.stderr:
    dex_src = 'mod/build_dex_out/classes.dex'
    if os.path.exists(dex_src):
        os.replace(dex_src, 'mod/converted.dex')
        print("Successfully generated mod/converted.dex!")
else:
    print("d8 Error:", res.stderr)

print("Full Modding Suite Complete!")
