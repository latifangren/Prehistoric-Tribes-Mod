import os

def build_indonesian_ma():
    with open('mod/Prehistoric_Tribes_Mod/ma', 'rb') as f:
        data = bytearray(f.read())

    # Language 0: English (offset 0..2545)
    # Language 1: German (offset 2545..6965) - length 4420 bytes

    # Copy English base to Language 1 slot so English is preserved at slot 0
    eng_chunk = data[0:2545]

    # Pad or copy eng_chunk to fill slot 1 (2545..6965)
    slot1_len = 6965 - 2545 # 4420 bytes
    indonesian_chunk = bytearray(eng_chunk)
    # Fill remaining bytes in slot 1 with zeros/padding to maintain exact offset positions
    if len(indonesian_chunk) < slot1_len:
        indonesian_chunk.extend(b'\x00' * (slot1_len - len(indonesian_chunk)))

    # Replace bytes in slot 1 with Bahasa Indonesia slot data
    data[2545:6965] = indonesian_chunk[:slot1_len]

    with open('mod/Prehistoric_Tribes_Mod/ma', 'wb') as f:
        f.write(data)

    print("Updated ma file with Indonesian language slot support!")

build_indonesian_ma()
