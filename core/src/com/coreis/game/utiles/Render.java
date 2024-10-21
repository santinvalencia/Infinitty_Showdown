package com.coreis.game.utiles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.coreis.game.MyGdxGame;
import com.coreis.game.pantallas.PantallaMenu;

public abstract class Render {
	public static SpriteBatch batch = new SpriteBatch();;
	public static MyGdxGame Menu = new MyGdxGame();
	public static void limpiarPantalla () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
	}
}
