package com.coreis.game;
import com.badlogic.gdx.*;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.coreis.game.pantallas.Juego;
import com.coreis.game.pantallas.PantallaMenu;
import com.coreis.game.pantallas.Splash_Screen;
import com.coreis.game.utiles.Render;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.utils.Timer; 	

public class MyGdxGame extends Game {
	SpriteBatch batch;
	public MyGdxGame() { 
		super(); 
	}
	
	@Override
	public void create () {
		batch = Render.batch;
		
		this.setScreen(new Splash_Screen(this));
		// this.setScreen(new PantallaMenu());
		//this.setScreen(new Juego());
		
		
	

	
	}
	

	public void render () {
		super.render();
		
		
		
	}
	
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}	
