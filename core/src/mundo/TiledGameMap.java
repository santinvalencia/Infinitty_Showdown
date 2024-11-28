package mundo;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import mundo.TileType;

public class TiledGameMap extends GameMap{	
	
	TiledMap tiledMap;
	OrthogonalTiledMapRenderer tiledMapRenderer;
	
	
	
	
	public TiledGameMap() {
		tiledMap = new TmxMapLoader().load("mapa/mapa.tmx");
		tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
	}

	@Override
	public void render(OrthographicCamera camera, SpriteBatch batch) {
		tiledMapRenderer.setView(camera);
		tiledMapRenderer.render();
		
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
//		super.render(camera, batch);
		batch.end();
		
		
	}

	@Override
	public void update(float delta) {
<<<<<<< HEAD
//		super.update(delta);
=======
		// TODO Auto-generated method stub
		
>>>>>>> parent of 7b4f3a4 (commit)
	}

	@Override
	public void dispose() {
		tiledMap.dispose();
	}
	public TiledMap getTiledMap() {
		return tiledMap;
	}

	@Override
	public TileType getTileTypeByLocation(int layer, float x, float y) {
		return this.getTileTypeByCoordinate(layer, (int) (x / TileType.TILE_SIZE), (int) (y / TileType.TILE_SIZE));
	}

	@Override
<<<<<<< HEAD
	public TileType getTileTypeByCoordinate(int layer, int col, int row) {
		Cell cell = ((TiledMapTileLayer) tiledMap.getLayers().get(layer)).getCell(col, row);
    	
    	if (cell != null) {
    		TiledMapTile tile = cell.getTile();
    		
    		if (tile != null) {
    			int id = tile.getId();
    			TileType type = TileType.getTypeById(id);
    			return type;
    		}
    	}
=======
	public TileType getTileTypeByCoordinate(int layer, float col, float row) {
>>>>>>> parent of 7b4f3a4 (commit)
		return null;
	}
	
	public boolean doesRectCollideWithMap(float x, float y, int width, int height) {
		if (x<0 || y<0 || x + width > getPixelWidth() || y + height > getPixelHeight()) {
			return true;
		}
		
		for (int row = (int) (y / TileType.TILE_SIZE); row < Math.ceil((y+height)) / TileType.TILE_SIZE; row++) {
			for (int col = (int) (x / TileType.TILE_SIZE); col < Math.ceil((x+width)) / TileType.TILE_SIZE; col++) {
				for (int layer = 0; layer < getLayers(); layer++) {
					TileType type = getTileTypeByCoordinate(layer, col, row);
					if (type != null && type.isColisionable()) {
						return true;
					}
				}
			}
		}
		
		return false;
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLayers() {
		// TODO Auto-generated method stub
		return 0;
	}

}
