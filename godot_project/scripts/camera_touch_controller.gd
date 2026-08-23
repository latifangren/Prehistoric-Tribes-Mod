extends Camera2D

# Touch Camera Controller for Android (Smooth 120Hz Pan & Pinch-Zoom)

@export var min_zoom: float = 0.5
@export var max_zoom: float = 4.0
@export var pan_speed: float = 1.0

var touch_events = {}
var start_zoom: Vector2 = Vector2.ONE
var start_distance: float = 0.0

func _unhandled_input(event: InputEvent) -> void:
	if event is InputEventScreenTouch:
		if event.pressed:
			touch_events[event.index] = event.position
		else:
			touch_events.erase(event.index)

		if touch_events.size() == 2:
			var points = touch_events.values()
			start_distance = points[0].distance_to(points[1])
			start_zoom = zoom

	elif event is InputEventScreenDrag:
		touch_events[event.index] = event.position

		if touch_events.size() == 1:
			# Single finger pan
			position -= event.relative * pan_speed / zoom.x

		elif touch_events.size() == 2:
			# Pinch zoom
			var points = touch_events.values()
			var current_distance = points[0].distance_to(points[1])
			if start_distance > 0:
				var scale_factor = current_distance / start_distance
				var target_zoom = clampf(start_zoom.x * scale_factor, min_zoom, max_zoom)
				zoom = Vector2(target_zoom, target_zoom)
