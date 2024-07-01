package com.coreis.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float x;
	float y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			y = y+4;
		}else if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			y = y-4;
		}
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			x = x-4;
		}else if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			x = x+4;
		}
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
