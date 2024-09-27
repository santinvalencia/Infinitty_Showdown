package com.coreis.game.pantallas;
import com.badlogic.gdx.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.coreis.game.utiles.Recursos;
import com.coreis.game.utiles.Render;
import com.coreis.game.elementos.ImagenF;

public class Juego implements Screen{
	SpriteBatch batch;
	public static final float SPEED = 120;
	Texture img;
	Texture fondo;
	Texture img1;
	Texture fondo1;
	float x;
	float x1= 300;
	float y1;
	float y;
	boolean color=false;
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		batch = Render.batch;
		fondo = new Texture(Recursos.FONDOJUEGO2);
		img1 = new Texture("carlitos.png");
		img = new Texture("jairo.png");
		
	}
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		MovJairo();
		MovCarlitos();
		Render.limpiarPantalla();
		if (Gdx.input.isKeyPressed(Keys.ENTER)) {
			color = !color;
		}
		if (color) {
			fondo = new Texture(Recursos.FONDOJUEGO);
		}if(!color) {
			fondo1 = new Texture(Recursos.FONDOJUEGO2);
		}
			batch.begin();
			batch.draw(fondo, 0, 0);
			batch.draw(img, x, y);
			batch.draw(img1, x1, y1);
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
		batch.dispose();
	}
	public void MovJairo() {
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
	}
	public void MovCarlitos() {
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
	}
}
