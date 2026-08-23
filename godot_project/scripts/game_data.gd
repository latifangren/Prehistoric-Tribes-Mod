class_name GameData
extends Node

# Prehistoric Tribes Game Database (Buildings, Units, Weapons, Upgrades)

const BUILDINGS = {
	"hut": {
		"name": "Hut",
		"hp": 200,
		"cost_wood": 50,
		"cost_stone": 0,
		"max_occupants": 4,
		"description": "Increases max population capacity."
	},
	"chief_hut": {
		"name": "Chief's Hut",
		"hp": 500,
		"cost_wood": 100,
		"cost_stone": 50,
		"max_occupants": 1,
		"description": "Headquarters of your tribe."
	},
	"kitchen": {
		"name": "Kitchen",
		"hp": 250,
		"cost_wood": 60,
		"cost_stone": 20,
		"role_needed": "cook",
		"description": "Feeds villagers and recovers stamina."
	},
	"armoury": {
		"name": "Armoury",
		"hp": 300,
		"cost_wood": 80,
		"cost_stone": 40,
		"role_needed": "armourer",
		"description": "Crafts weapons and traps."
	},
	"gym": {
		"name": "Gym",
		"hp": 300,
		"cost_wood": 70,
		"cost_stone": 30,
		"description": "Trains villagers into strong warriors."
	},
	"sanctuary": {
		"name": "Sanctuary",
		"hp": 350,
		"cost_wood": 100,
		"cost_stone": 80,
		"role_needed": "shaman",
		"description": "Casts tribal spells, heals, and cures diseases."
	},
	"disco": {
		"name": "Disco",
		"hp": 400,
		"cost_wood": 120,
		"cost_stone": 60,
		"role_needed": "dj",
		"description": "Increases morale and happiness."
	},
	"tower": {
		"name": "Tower",
		"hp": 350,
		"cost_wood": 90,
		"cost_stone": 60,
		"description": "Defensive tower with range attack."
	}
}

const WEAPONS = {
	"club": {"name": "Club", "damage": 5, "range": 1, "cost_wood": 10},
	"spear": {"name": "Spear", "damage": 10, "range": 2, "cost_wood": 20},
	"stone_axe": {"name": "Stone Axe", "damage": 15, "range": 1, "cost_wood": 15, "cost_stone": 15},
	"bone_mace": {"name": "Bone Mace", "damage": 20, "range": 1, "cost_wood": 10, "cost_stone": 30},
	"tomahawk": {"name": "Tomahawk", "damage": 18, "range": 3, "cost_wood": 25, "cost_stone": 20}
}

const TRAPS = {
	"net_trap": {"name": "Net Trap", "effect": "root", "duration": 5.0, "cost_wood": 15},
	"spring_trap": {"name": "Spring Trap", "effect": "knockback", "damage": 25, "cost_wood": 20},
	"pit_trap": {"name": "Pit Trap", "effect": "damage", "damage": 60, "cost_wood": 30, "cost_stone": 20}
}

const ROLES = ["unassigned", "builder", "gatherer", "cook", "shaman", "armourer", "dj", "warrior"]
