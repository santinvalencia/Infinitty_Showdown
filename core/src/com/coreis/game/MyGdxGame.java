package com.coreis.game;
import com.badlogic.gdx.*;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.coreis.game.pantallas.PantallaMenu;
import com.coreis.game.pantallas.Splash_Screen;
import com.coreis.game.utiles.Render;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.utils.Timer; 	

public class MyGdxGame extends Game {
	
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
	public MyGdxGame() { super(); }
	
	@Override
	public void create () {
		Render.batch = new SpriteBatch();
		batch = new SpriteBatch();
		this.setScreen(new Splash_Screen());
		img1 = new Texture("carlitos.png");
		img = new Texture("jairo.png");
		img2= new Texture ("echeverri.png");
		
		
	

	
	}
	

	public void render () {
		super.render();

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
<<<<<<< HEAD
		//batch.draw(img2, z, z1);
=======
		// batch.draw(img2, z, z1);
>>>>>>> 00b0b5d75ccc3b75ef9cb822f08c80c62fd6be51
		batch.end();
		
		
	}
	
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();

	}
}	
