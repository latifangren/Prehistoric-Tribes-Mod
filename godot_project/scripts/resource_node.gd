class_name ResourceNode
extends StaticBody2D

# Resource Node (Tree / Stone Rock)

enum ResourceType { WOOD, STONE, FOOD }

@export var resource_type: ResourceType = ResourceType.WOOD
@export var amount: int = 500

@onready var sprite: Sprite2D = $Sprite2D

func _ready() -> void:
	add_to_group("resources")

func harvest(harvest_amount: int) -> int:
	var gathered = min(harvest_amount, amount)
	amount -= gathered
	if amount <= 0:
		deplete()
	return gathered

func deplete() -> void:
	queue_free()
