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
│   ├── converted.dex.conf      # Konfigurasi konversi DEX
│   ├── res.jar                 # Resource archive terkompilasi
│   └── icon.png                # Ikon aplikasi mod
├── cfr.jar                     # CFR Java Decompiler (tool dekompilasi .class)
├── .gitignore
└── README.md                   # Dokumentasi proyek
```

---

## 🛠️ Alur Kerja & Penggunaan

### 1. Dekompilasi Bytecode Java (J2ME)
Gunakan `cfr.jar` untuk mendekomposisi file `.class` dari direktori `original/`:

```bash
java -jar cfr.jar original/Prehistoric_Tribes_240x320/tribes.class --outputdir decompiled_src/
```

### 2. Struktur Modding Android (`mod/`)
* **`converted.dex`**: Bytecode yang telah dikonversi untuk berjalan di lingkungan Android Runtime (ART/Dalvik).
* **`res.jar`**: Resource bundle pendukung untuk eksekusi mod.

---

## 📄 Lisensi & Disclaimer
Proyek ini dibuat untuk tujuan edukasi, preservasi game retro, dan penelitian reverse engineering. Hak cipta game asli milik pengembang/penerbit *Prehistoric Tribes*.
