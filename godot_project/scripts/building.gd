class_name Building
extends StaticBody2D

# Building Instance (Hut, Armoury, Kitchen, Tower, etc.)

@export var building_type: String = "hut"
var hp: int = 100
var max_hp: int = 200
var is_constructed: bool = false

@onready var sprite: Sprite2D = $Sprite2D

func _ready() -> void:
	add_to_group("buildings")
	var stats = GameData.BUILDINGS.get(building_type, {})
	max_hp = stats.get("hp", 200)

func build_progress(amount: int) -> void:
	hp = min(max_hp, hp + amount)
	if hp >= max_hp:
		is_constructed = true
		print("Building ", building_type, " fully constructed!")
