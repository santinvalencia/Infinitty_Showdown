package entities;

public enum EntityType {
	PLAYER("player", 14, 32, 45);
	
	private String id;
	private int witdh, height;
	private float weight;
	private EntityType(String id, int witdh, int height, float weight) {
		this.id = id;
		this.witdh = witdh;
		this.height = height;
		this.weight = weight;
	}
	public String getId() {
		return id;
	}
	public int getWitdh() {
		return witdh;
	}
	public int getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}
	
	
}
