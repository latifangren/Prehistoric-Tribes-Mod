extends Node2D

# Isometric Map Renderer for Prehistoric Tribes HD

@export var map_width: int = 30
@export var map_height: int = 30
@export var tile_width: int = 96  # 24x4 (4x upscale)
@export var tile_height: int = 52 # 13x4 (4x upscale)

var tile_textures = []

func _ready() -> void:
	load_tile_textures()
	generate_demo_map()

func load_tile_textures() -> void:
	for i in range(100):
		var path = "res://assets/sprites/tiles/tile_%02d_4x.png" % i
		if ResourceLoader.exists(path):
			tile_textures.append(load(path))

func grid_to_iso(grid_x: float, grid_y: float) -> Vector2:
	var iso_x = (grid_x - grid_y) * (tile_width / 2.0)
	var iso_y = (grid_x + grid_y) * (tile_height / 2.0)
	return Vector2(iso_x, iso_y)

func generate_demo_map() -> void:
	if tile_textures.size() == 0:
		return

	for x in range(map_width):
		for y in range(map_height):
			var sprite = Sprite2D.new()
			# Default ground tile pattern
			var tile_idx = (x + y) % min(10, tile_textures.size())
			sprite.texture = tile_textures[tile_idx]
			sprite.position = grid_to_iso(x, y)
			# Render order sorting for isometric depth
			sprite.z_index = int(x + y)
			add_child(sprite)
