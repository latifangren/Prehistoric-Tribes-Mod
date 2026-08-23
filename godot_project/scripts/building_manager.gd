extends Node2D

# Building Placement Manager for Prehistoric Tribes

var is_placing: bool = false
var current_building_type: String = ""
var placement_preview: Sprite2D = null

func start_placement(building_type: String) -> void:
	is_placing = true
	current_building_type = building_type
	if not placement_preview:
		placement_preview = Sprite2D.new()
		placement_preview.modulate = Color(0.2, 1.0, 0.2, 0.6) # Green semi-transparent preview
		add_child(placement_preview)

func _unhandled_input(event: InputEvent) -> void:
	if not is_placing:
		return

	if event is InputEventScreenDrag or event is InputEventMouseMotion:
		var world_pos = get_canvas_transform().affine_inverse() * event.position
		if placement_preview:
			placement_preview.position = world_pos

	elif event is InputEventSingleScreenTap:
		var world_pos = get_canvas_transform().affine_inverse() * event.position
		place_building(world_pos)

func place_building(pos: Vector2) -> void:
	if not is_placing:
		return

	var b_scene = Building.new()
	b_scene.building_type = current_building_type
	b_scene.position = pos
	get_parent().add_child(b_scene)

	print("Placed building ", current_building_type, " at ", pos)
	cancel_placement()

func cancel_placement() -> void:
	is_placing = false
	current_building_type = ""
	if placement_preview:
		placement_preview.queue_free()
		placement_preview = null
