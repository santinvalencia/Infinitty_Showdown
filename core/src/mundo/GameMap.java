package mundo;

import com.badlogic.gdx.graphics.OrthographicCamera;

public abstract class GameMap {
	public abstract void render (OrthographicCamera camera);
	public abstract void update (float delta);
	public abstract void dispose ();
	
	/**
	 * Get tile by pixel position within world at a specified layer.
	 * @param layer
	 * @param x
	 * @param y
	 * @return
	 */
	public abstract TileType getTileTypeByLocation(int layer, float x, float y);
	/**
	 * 
	 * @param layer
	 * @param col
	 * @param row
	 * @return
	 */
	public abstract TileType getTileTypeByCoordinate(int layer, float col, float row);
	
	
	public abstract int getWidth(); 
	public abstract int getHeight();
	public abstract int getLayers();

}