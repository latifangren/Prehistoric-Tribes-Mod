import os
import zipfile

# 1. Read clean English ma from original
with open('original/Prehistoric_Tribes_240x320/ma', 'rb') as f:
    orig_ma = bytearray(f.read())

# 2. Extract original Indonesian ma from Downloads ZIP
zip_path = r'C:/Users/latif/Downloads/Prehistoric Tribes Bahasa Indonesia (SFILE.MOBI).zip'
os.makedirs('temp_indo_extract', exist_ok=True)
with zipfile.ZipFile(zip_path, 'r') as z:
    z.extractall('temp_indo_extract')

res_jar = 'temp_indo_extract/Prehistoric Tribes Bahasa Indonesia/res.jar'
with zipfile.ZipFile(res_jar, 'r') as r:
    indo_ma = r.read('ma')

# 3. Create dual-language ma:
# Slot 0 (0..2545): Clean English from orig_ma[0:2545]
# Slot 1 (2545..6965): Indonesian translated slot from indo_ma[0:4420]
combined_ma = bytearray(orig_ma)

# Replace Slot 1 (2545..6965) with Indonesian text bytes
indo_chunk = indo_ma[0:4420]
combined_ma[2545:2545+len(indo_chunk)] = indo_chunk

# Save to mod/Prehistoric_Tribes_Mod/ma
with open('mod/Prehistoric_Tribes_Mod/ma', 'wb') as f:
    f.write(combined_ma)

print("Dual-language ma generated successfully!")
print("Slot 0 (0..2545): English")
print("Slot 1 (2545..6965): Bahasa Indonesia")
