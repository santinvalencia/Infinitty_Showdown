package com.coreis.game.pantallas;
	import com.badlogic.gdx.Gdx;
	import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
	import com.badlogic.gdx.graphics.Texture;
	import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.coreis.game.MyGdxGame;
import com.coreis.game.elementos.ImagenF;

	import com.coreis.game.utiles.Recursos;
	import com.coreis.game.utiles.Render;
	

	 
	public class PantallaMenu implements Screen {
		final MyGdxGame game;
	    private SpriteBatch batch;
	    private Texture t;
	    ImagenF fondo;
	    private float time = 0;
	    
	    public class immagenCarga{
	    	
	    	public static final String MenuScreen = "assets/fondos/MenuScreen.jpeg";
	    }
	    public PantallaMenu(MyGdxGame game) {
	        this.game= game;
	        batch = new SpriteBatch();
	        t = new Texture("MenuScreen.jpeg");
	    }
	   @Override
	   
	    public void show() { 
		   fondo = new ImagenF(Recursos.MENU);
		   batch = Render.batch;
	   }
	    @Override
	    public void render(float delta) {
	    	time += 0.0001f;
	    	if(Gdx.input.isKeyPressed(Keys.ENTER)) {
	    		game.setScreen(new Juego(game));
	    	}
	    		
	    	
	        batch.begin();
	        fondo.dibujar();
	        batch.end();
	        
	    }
	    
	    
	 
	    @Override
	    public void hide() { }
	 
	    @Override	
	    public void pause() { }
	 
	    @Override
	    public void resume() { }
	 
	  
	    
	 
	    @Override
	    public void resize(int width, int height) { }
	 
	    @Override
	    public void dispose() {
	        t.dispose();
	        batch.dispose();
	    }
		
	}