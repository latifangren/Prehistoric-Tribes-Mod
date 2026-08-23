extends CanvasLayer

# Touch UI HUD Controller for Mobile RTS

var wood: int = 150
var stone: int = 50
var food: int = 100
var population: int = 4
var max_population: int = 10

@onready var wood_label: Label = $TopBar/HBox/WoodLabel
@onready var stone_label: Label = $TopBar/HBox/StoneLabel
@onready var food_label: Label = $TopBar/HBox/FoodLabel
@onready var pop_label: Label = $TopBar/HBox/PopLabel

func _ready() -> void:
	update_ui()

func update_ui() -> void:
	if wood_label: wood_label.text = "Wood: %d" % wood
	if stone_label: stone_label.text = "Stone: %d" % stone
	if food_label: food_label.text = "Food: %d" % food
	if pop_label: pop_label.text = "Pop: %d/%d" % [population, max_population]

func add_resource(type: String, amount: int) -> void:
	match type.lower():
		"wood": wood += amount
		"stone": stone += amount
		"food": food += amount
	update_ui()
