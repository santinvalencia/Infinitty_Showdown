package mundo;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import entities.Entity;
import entities.Player;


public abstract class GameMap {
	
	protected ArrayList<Entity> entities;
	
	
	
	
	public void dispose () {}
	
	public GameMap() {
		entities = new ArrayList<Entity>();
		entities.add(new Player(40, 300, this));
	}
	
	public void render (OrthographicCamera camera, SpriteBatch batch) {
		for(Entity entity : entities) {
			entity.render(batch);
		}
	}
	
	
	public void update (float delta) {
		for(Entity entity : entities) {
			entity.update(delta, -9.8f);;
		}
	}
	/**
	 * Get tile by pixel position within world at a specified layer.
	 * @param layer
	 * @param x
	 * @param y
	 * @return
	 */
	public abstract TileType getTileTypeByLocation(int layer, float x, float y);
<<<<<<< HEAD
	
	public boolean doesRectCollideWithMap(float x, float y, int width, int height) {
		if (x < 0 || y < 0 || x + width > getPixelWidth() || y + height > getPixelHeight())
			return true;  
		for (int row = (int) y / TileType.TILE_SIZE; row < Math.ceil((y + height)  / TileType.TILE_SIZE); row++) {
			for (int col = (int) y / TileType.TILE_SIZE; col < Math.ceil((y + height)  / TileType.TILE_SIZE); col++) {
				for(int layer=0; layer < getLayers(); layer++) {
					TileType type = getTileTypeByCoordinate(layer, col, row);
					if(type != null && type.isColisionable()) {
						return true;
					}
				}
			}
		}
		return false;
	}
=======
	/**
	 * 
	 * @param layer
	 * @param col
	 * @param row
	 * @return
	 */
	public abstract TileType getTileTypeByCoordinate(int layer, float col, float row);
	
>>>>>>> parent of 7b4f3a4 (commit)
	
	public abstract int getWidth(); 
	public abstract int getHeight();
	public abstract int getLayers();
<<<<<<< HEAD
	
	public abstract TileType getTileTypeByCoordinate(int layer, int col, int row) ;
	
	public int getPixelWidth() {
		return this.getWidth() * TileType.TILE_SIZE;
	}
	
	public int getPixelHeight() {
		return this.getHeight() * TileType.TILE_SIZE;
	}
=======

>>>>>>> parent of 7b4f3a4 (commit)
}
