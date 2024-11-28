package mundo;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer.Cell;
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
//		super.update(delta);
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
		return ((TiledMapTileLayer) tiledMap.getLayers().get(0)).getWidth();
	}
	@Override
	public int getHeight() {
		return ((TiledMapTileLayer) tiledMap.getLayers().get(0)).getHeight();
	}

	@Override
	public int getLayers() {
		return tiledMap.getLayers().getCount();
	}


}
