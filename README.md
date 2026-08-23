# Prehistoric Tribes HD Remake (Godot 4)

Modern HD Android & Cross-Platform Remake of the classic J2ME RTS game **Prehistoric Tribes**.

Built with **Godot Engine 4.3** (Mobile / Forward+ Renderer), optimized for high-refresh-rate displays (120Hz+), crisp pixel-art scaling, and touch-screen RTS controls.

---

## 🌟 Key Features

* **High-Refresh-Rate Performance**: Smooth 120 FPS camera panning & rendering.
* **4x Pixel-Art Upscaling**: Crisp HD pixel graphics for 1080p / 1440p AMOLED displays.
* **Touch RTS Controls**: Multi-touch camera (pan & pinch-to-zoom), single-tap unit selection, and touch command system.
* **Isometric Tile Renderer**: Custom 2D Isometric map renderer using upscaled original assets.
* **Building Construction System**: Placement preview (green/red validation) & villager building tasks.
* **Original Game Logic & Database**: Complete stats for buildings, weapons, traps, and villager roles.

---

## 📁 Repository Structure

```
Prehistoric-Tribes-Mod/
├── godot_project/          # Godot 4 Game Project Source
│   ├── assets/             # 4x HD Upscaled Sprites, Tiles & Backgrounds
│   ├── scenes/             # Game Scenes (main.tscn, hud_ui.tscn)
│   ├── scripts/            # GDScript Controllers & Managers
│   └── project.godot       # Godot 4 Configuration
├── original_j2me/          # Original J2ME MIDlet (.jar & unpacked assets)
├── .gitignore              # Git Ignore configuration
└── README.md               # Documentation
```

---

## 🛠️ How to Build & Run

### Prerequisites
* [Godot Engine 4.3](https://godotengine.org/download/) (Mobile / Standard edition)
* Android SDK & NDK (if exporting APK to Android)

### Running in Godot Editor
1. Launch **Godot Engine 4.3**.
2. Click **Import**, navigate to `godot_project/` and select `project.godot`.
3. Press **F5** to run the main scene (`scenes/main.tscn`).

### Exporting APK for Android
1. Open the project in Godot Engine.
2. Go to **Project -> Export...**
3. Select **Android APK** preset.
4. Click **Export Project...** to generate `PrehistoricTribes_HD.apk`.

---

## 📄 Credits & Disclaimer

* Original J2ME Game: *Prehistoric Tribes*
* Port & Remake: Modernized for Android using Godot Engine 4.3.
