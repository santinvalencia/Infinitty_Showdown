package com.coreis.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.coreis.game.pantallas.Splash_Screen;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	public static final float SPEED = 120;
	Texture img;
	Texture img1;
	float x;
	float x1= 300;
	float y1;
	float y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();

		this.setScreen(new Splash_Screen());
		img = new Texture("logoJ.png");
		img1 = new Texture("carlitos.png");
		img = new Texture("jairo.png");

	}
	private void setScreen(Splash_Screen splash_Screen) {
		
	}


	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
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
		batch.begin();
		batch.draw(img, x, y);
		batch.draw(img1, x1, y1);
		batch.end();
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
