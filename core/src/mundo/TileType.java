package mundo;

import java.util.HashMap;

public enum TileType {
	TIERRA(1, true, "Tierra"),
	PIEDRA(1, true, "Piedra"),
	CIELO(1, false, "Cielo"),
	NUBE(1, false, "Nube"),;
	
	public static final int TILE_SIZE = 16;
	
	private int id;
	private boolean colisionable;
	private String name;
	private float damage;
	
	private TileType (int id, boolean colisionable, String name) {
		this(id, colisionable, name, 0);
	}

	private TileType(int id, boolean colisionable, String name, float damage) {
		this.id = id;
		this.colisionable = colisionable;
		this.name = name;
		this.damage = damage;
	}

	public int getId() {
		return id;
	}

	public boolean isColisionable() {
		return colisionable;
	}

	public String getName() {
		return name;
	}

	public float getDamage() {
		return damage;
	}
	
	private static HashMap<Integer, TileType> tilesMap;
	
	
	static {
		for (TileType tileType : TileType.values()) {
			tilesMap.put(tileType.getId(), tileType);
		}
	}
	
	public static TileType getTypeById (int id) {
		return tilesMap.get(id);
	}
}
