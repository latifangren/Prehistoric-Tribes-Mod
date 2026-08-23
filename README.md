# Prehistoric Tribes - J2ME Mod & Reverse Engineering

Project reverse engineering, ekstraksi aset, dekompilasi, dan modding Android DEX untuk game J2ME RTS klasik **Prehistoric Tribes** (resolusi asli 240x320).

---

## 📁 Struktur Repositori

```
Prehistoric-Tribes-Mod/
├── original/                       # File JAR J2ME asli (unmodded)
│   ├── Prehistoric_Tribes_240x320.jar
│   └── Prehistoric_Tribes_240x320/ # Ekstraksi class & game data asli
├── mod/                            # File modding & konversi Android
│   ├── Prehistoric_Tribes_Mod.jar  # JAR ter-modifikasi (Cheat & Direct Shortcut)
│   ├── Prehistoric_Tribes_Mod/     # Folder aset & class byte-patched
│   ├── converted.dex               # Dalvik Executable hasil konversi bytecode
│   ├── converted.dex.conf          # Konfigurasi konversi DEX (Cheat-Support: on)
│   ├── res.jar                     # Resource archive terkompilasi
│   └── icon.png                    # Ikon aplikasi mod
├── decompiled/                     # Kode sumber Java terdekompilasi (CFR)
├── patch_mod.py                    # Script bytecode patcher (Single-Key Cheat)
├── cfr.jar                         # CFR Java Decompiler tool
├── .gitignore
└── README.md                       # Dokumentasi proyek
```

---

## 🎮 Fitur Mod & Shortcut Tombol Cheat (In-Game)

Dukungan **Cheat-Support** dan **Direct Single-Key Shortcut** telah diaktifkan secara native di `mod/Prehistoric_Tribes_Mod/f.class`.

### Tombol Cheat Praktis (1-Klik Langsung Aktif):
Cukup tekan **satu tombol angka** saat permainan berlangsung (tidak perlu mengetik kombinasi rumit):

* **`1`**: **Unlock All Levels** & God mode / Map reveal.
* **`3`**: **Speedup / Instant Kill** mode.
* **`7`**: **Instant Resource Boost** (+127 Makanan, Kayu, Batu, Emas, Besi, serta +3 Senjata per tekan).
* **`9`**: **Instant Win** (Langsung selesaikan misi/level saat ini).

---

## 🛠️ Alur Kerja & Dekompilasi

Gunakan `cfr.jar` untuk mendekomposisi file `.class` dari direktori `original/`:

```bash
java -jar cfr.jar original/Prehistoric_Tribes_240x320/*.class --outputdir decompiled/
```

Gunakan script `patch_mod.py` untuk mengaplikasikan patch bytecode langsung pada file `mod/Prehistoric_Tribes_Mod/f.class`.

---

## 📄 Lisensi & Disclaimer
Proyek ini dibuat untuk tujuan edukasi, preservasi game retro, dan penelitian reverse engineering. Hak cipta game asli milik pengembang/penerbit *Prehistoric Tribes*.
