	package com.coreis.game.pantallas;
	import com.badlogic.gdx.Gdx;
	import com.badlogic.gdx.Screen;
	import com.badlogic.gdx.graphics.GL20;
	import com.badlogic.gdx.graphics.Texture;
	import com.badlogic.gdx.graphics.g2d.SpriteBatch;
	import com.coreis.game.elementos.ImagenF;
	import com.coreis.game.utiles.Recursos;
	import com.coreis.game.utiles.Render;

	 
	public class Splash_Screen implements Screen {
	    private SpriteBatch batch;
	    private Texture t;
	    ImagenF fondo;
	    boolean fadeInTerminado = false;
	    float f = 0;
	    
	    public class immagenCarga{
	    	
	    	public static final String loadingScreen = "assets/logoCVF.PNG";
	    }
	    public Splash_Screen() {
	        super();
	        batch = new SpriteBatch();
	        t = new Texture("logoCVF.PNG");
	    }
	   @Override
	    public void show() { 
		   fondo = new ImagenF(Recursos.LOGO);
		   batch = Render.batch;
		   fondo.setAparicionF(f);
		   
	   }
	    @Override
	    public void render(float delta) {

	    	Render.limpiarPantalla();
	    	procesarFade();
	        batch.begin();
	        fondo.dibujar();
	        batch.end();
	        
	    }
	    private void procesarFade() {
	    	fondo.setAparicionF(f);
	    	f+=0.01f;
	    	
	    	
	    	
	    	
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
