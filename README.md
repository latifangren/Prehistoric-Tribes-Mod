# Prehistoric Tribes - J2ME Mod & Reverse Engineering

Project reverse engineering, ekstraksi aset, dekompilasi, dan modding Android DEX untuk game J2ME RTS klasik **Prehistoric Tribes** (resolusi asli 240x320).

---

## 📁 Struktur Repositori

```
Prehistoric-Tribes-Mod/
├── original/                   # File JAR J2ME asli dan aset terpartisi
│   ├── Prehistoric_Tribes_240x320.jar
│   ├── Prehistoric_Tribes_240x320/ # Ekstraksi class & game data (sprites, maps, sound)
│   └── ...
├── mod/                        # File modding & konversi Android
│   ├── converted.dex           # Dalvik Executable hasil konversi bytecode
│   ├── converted.dex.conf      # Konfigurasi konversi DEX (Cheat-Support: on)
│   ├── res.jar                 # Resource archive terkompilasi
│   └── icon.png                # Ikon aplikasi mod
├── decompiled/                 # Kode sumber Java terdekompilasi (CFR)
├── cfr.jar                     # CFR Java Decompiler tool
├── .gitignore
└── README.md                   # Dokumentasi proyek
```

---

## 🎮 Fitur Mod & Cheat Code

Dukungan **Cheat-Support** telah diaktifkan secara native di `MANIFEST.MF` dan `converted.dex.conf`.

### Kombinasi Tombol Cheat (In-Game)
Tekan urutan tombol angka berikut saat permainan berlangsung:
1. Masukkan kode aktivasi: **`8` `7` `3` `9` `1`**
2. Lalu tekan salah satu tombol berikut untuk mengaktifkan efek:
   * **`1`**: **Unlock All Levels** & God mode / Map reveal.
   * **`3`**: **Speedup / Instant Kill** mode.
   * **`7`**: **Resource Boost** (+100 Makanan, Kayu, Batu, Emas, Besi, serta +3 Senjata & Jebakan).
   * **`9`**: **Instant Win** (Langsung selesaikan misi/level saat ini).

---

## 🛠️ Alur Kerja & Dekompilasi

Gunakan `cfr.jar` untuk mendekomposisi file `.class` dari direktori `original/`:

```bash
java -jar cfr.jar original/Prehistoric_Tribes_240x320/*.class --outputdir decompiled/
```

---

## 📄 Lisensi & Disclaimer
Proyek ini dibuat untuk tujuan edukasi, preservasi game retro, dan penelitian reverse engineering. Hak cipta game asli milik pengembang/penerbit *Prehistoric Tribes*.
