package com.coreis.game.pantallas;
	import com.badlogic.gdx.Gdx;
	import com.badlogic.gdx.Screen;
	import com.badlogic.gdx.graphics.GL20;
	import com.badlogic.gdx.graphics.Texture;
	import com.badlogic.gdx.graphics.g2d.SpriteBatch;

	import com.coreis.game.elementos.ImagenF;

	import com.coreis.game.utiles.Recursos;
	import com.coreis.game.utiles.Render;
	

	 
	public class PantallaMenu implements Screen {
	    private SpriteBatch batch;
	    private Texture t;
	    ImagenF fondo;
	   
	    
	    public class immagenCarga{
	    	
	    	public static final String MenuScreen = "assets/MenuScreen.png";
	    }
	    public PantallaMenu() {
	        super();
	        batch = new SpriteBatch();
	        t = new Texture("MenuScreen.png");
	    }
	   @Override
	   
	    public void show() { 
		   fondo = new ImagenF(Recursos.MENU);
		   batch = Render.batch;
		   
		
		   
	   }
	    @Override
	    public void render(float delta) {

	    	
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