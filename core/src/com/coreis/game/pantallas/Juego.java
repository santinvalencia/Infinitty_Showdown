package com.coreis.game.pantallas;
import com.badlogic.gdx.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.coreis.game.utiles.Render;

public class Juego implements Screen{
	SpriteBatch batch;
	public static final float SPEED = 120;
	Texture img;
	Texture img1;
	Texture img2;
	float x;
	float x1= 300;
	float y1;
	float y;
	float z;
	float z1;
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		batch = Render.batch;
		img1 = new Texture("carlitos.png");
		img = new Texture("jairo.png");
		img2= new Texture ("echeverri.png");
	}
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
		//Jairo
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			y += +SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			y += -SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			x += -SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			x += + SPEED * Gdx.graphics.getDeltaTime();
		}
		//Carlitos
		if(Gdx.input.isKeyPressed(Keys.W)) {
			y1 += +SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.S)) {
			y1 += -SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.A)) {
			x1 += -SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.D)) {
			x1 += + SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.J)) {
			z += +SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.H)) {
			z += -SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.K)) {
			z1 += -SPEED * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.L)) {
			z1 += + SPEED * Gdx.graphics.getDeltaTime();
		}

		batch.begin();
		batch.draw(img, x, y);
		batch.draw(img1, x1, y1);
		//batch.draw(img2, z, z1);
		// batch.draw(img2, z, z1);
		batch.end();
	}
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
}
