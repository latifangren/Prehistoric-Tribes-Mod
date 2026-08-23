extends Node2D

# Touch Selection & Command Manager for Mobile RTS

var selected_unit: Unit = null
@onready var camera: Camera2D = get_viewport().get_camera_2d()

func _unhandled_input(event: InputEvent) -> void:
	if event is InputEventSingleScreenTap:
		handle_tap(event.position)

func handle_tap(screen_pos: Vector2) -> void:
	var world_pos = get_canvas_transform().affine_inverse() * screen_pos

	# Raycast or distance check for Unit tap
	var clicked_unit = find_unit_at(world_pos)
	if clicked_unit:
		select_unit(clicked_unit)
		return

	# Check for Resource Node tap (Tree/Stone)
	var resource = find_resource_at(world_pos)
	if selected_unit and resource:
		order_harvest(selected_unit, resource)
		return

	# Tap ground -> move unit
	if selected_unit:
		selected_unit.move_to(world_pos)

func select_unit(unit: Unit) -> void:
	selected_unit = unit
	print("Selected unit: ", unit.unit_name)

func find_unit_at(pos: Vector2) -> Unit:
	for node in get_tree().get_nodes_in_group("units"):
		if node is Unit and node.position.distance_to(pos) < 30.0:
			return node
	return null

func find_resource_at(pos: Vector2) -> ResourceNode:
	for node in get_tree().get_nodes_in_group("resources"):
		if node is ResourceNode and node.position.distance_to(pos) < 35.0:
			return node
	return null

func order_harvest(unit: Unit, resource: ResourceNode) -> void:
	unit.move_to(resource.position)
	print("Unit ", unit.unit_name, " harvesting resource!")
