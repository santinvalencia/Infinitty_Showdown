package mundo;

import java.util.HashMap;

public enum TileType {
	CESPED(1, true, "Cesped"),
	TIERRA(2, true, "Tierra"),
	CIELO(3, false, "Cielo"),
	LAVA(4, false, "Lava"),
	NUBE(5, true, "Nube"),
	PIEDRA(6, false, "Piedra"),;
	
	public static final int TILE_SIZE = 32;
	
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
	
	private static HashMap<Integer, TileType> tileMap;
	
	
	static {
		tileMap = new HashMap<Integer, TileType>();
		for (TileType tileType : TileType.values()) {
			tileMap.put(tileType.getId(), tileType);
		}
	}
	
	public static TileType getTypeById (int id) {
		return tileMap.get(id);
	}
}
