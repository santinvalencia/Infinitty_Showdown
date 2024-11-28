package entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import mundo.GameMap;

public class Player extends Entity{
	
	private static final int SPEED = 120;
	private static final int JUMP_VELOCITY = 5;
	private Texture image;
	
	
	public Player(float x, float y, GameMap map) {
		super(x, y, EntityType.PLAYER, map);
		image = new Texture ("echeverri.png");
	}
	
	@Override
	public void render(SpriteBatch batch) {
		batch.draw(image, pos.x, pos.y, getWidth(), getHeight());
		
	}

	@Override
	public void update(float deltaTime, float gravity) {
		if (Gdx.input.isKeyPressed(Keys.SPACE) && grounded) {
			this.velocityY += JUMP_VELOCITY * getWeight();
		}else if (Gdx.input.isKeyPressed(Keys.SPACE) && !grounded && this.velocityY >  0)
			this.velocityY += JUMP_VELOCITY * getWeight()* deltaTime;
			
		super.update(deltaTime, gravity); // aplicar gravedad
		
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			moveX(-SPEED * deltaTime);
			
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			moveX(SPEED * deltaTime);
			
		}
	}

}









