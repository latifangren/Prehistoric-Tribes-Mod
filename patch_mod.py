import os

f_class_path = 'mod/Prehistoric_Tribes_Mod/f.class'
with open(f_class_path, 'rb') as f:
    data = bytearray(f.read())

# 1. Patch bipush 100 to sipush 9999 (+9999 resources)
# Offsets: 0x1864b, 0x18659, 0x18667, 0x18675, 0x18683
offsets_res = [0x1864b, 0x18659, 0x18667, 0x18675, 0x18683]
for off in offsets_res:
    # 0x10 0x64 (bipush 100) -> 0x11 0x27 0x0f (sipush 9999)
    # Note: original is 2 bytes (10 64). We can use sipush (11 27 0f) if space allows or bipush 127 (10 7f).
    # Let's check 10 7f (+127 each press) or patch instructions.
    # 10 64 -> 10 7f (+127) or sipush.
    data[off] = 0x10
    data[off+1] = 0x7f

# 2. Patch m(int) at 0x18566 so single key press (1, 3, 7, 9) immediately triggers cheat switch
# Replace check sequence from 0x18566 to 0x185fb with direct jump to switch
# 0x18566: 1b (iload_1), 2a (aload_0), ...
# We want: 0x18566 -> 1b (iload_1), a7 0x00 0x8f (goto 0x185f8 -> switch table)
patch_code = bytes([0x1b, 0xa7, 0x00, 0x8f])
data[0x18566:0x18566+len(patch_code)] = patch_code

with open(f_class_path, 'wb') as f:
    f.write(data)

print("Successfully patched f.class!")
