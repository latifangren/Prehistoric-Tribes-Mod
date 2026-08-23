class_name Unit
extends CharacterBody2D

# Unit Controller (Villager, Chief, Warrior, Enemy)

@export var unit_name: String = "Villager"
@export var is_enemy: bool = false
@export var speed: float = 120.0

var hp: int = 100
var max_hp: int = 100
var role: String = "unassigned"
var equipped_weapon: String = ""

var target_position: Vector2 = Vector2.ZERO
var is_moving: bool = false

@onready var sprite: Sprite2D = $Sprite2D

func _ready() -> void:
	add_to_group("units")
	target_position = position

func _physics_process(delta: float) -> void:
	if is_moving:
		var dir = (target_position - position).normalized()
		var dist = position.distance_to(target_position)
		if dist > 5.0:
			velocity = dir * speed
			move_and_slide()
		else:
			position = target_position
			velocity = Vector2.ZERO
			is_moving = false

func move_to(destination: Vector2) -> void:
	target_position = destination
	is_moving = true

func take_damage(amount: int) -> void:
	hp = max(0, hp - amount)
	if hp == 0:
		die()

func die() -> void:
	queue_free()
