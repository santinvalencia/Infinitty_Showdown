package com.coreis.game.pantallas;
	import com.badlogic.gdx.Gdx;
	import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
	import com.badlogic.gdx.graphics.Texture;
	import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.coreis.game.MyGdxGame;
import com.coreis.game.elementos.ImagenF;

	import com.coreis.game.utiles.Recursos;
	import com.coreis.game.utiles.Render;
	

	 
	public class PantallaMenu implements Screen {
		final MyGdxGame game;
		public static final String MenuScreen = "assets/fondos/MenuScreen.jpeg";
	    private SpriteBatch batch;
	    private Texture t;
	    ImagenF fondo;
	    Texture BotonJugarInactivo;
	    Texture BotonJugarActivo;
	    Texture BotonOpcionesInactivo;
	    Texture BotonOpcionesActivo;
	    Texture BotonCreditosInactivo;
	    Texture BotonCreditosActivo;
	    
	    public PantallaMenu(MyGdxGame game) {
	        this.game= game;
	        batch = new SpriteBatch();
	        BotonJugarInactivo = new Texture("BotonJugarInactivo.png");
	        BotonJugarActivo = new Texture("BotonJugarActivo.png");
	      
	        
	        t = new Texture("MenuScreen.jpeg");
	    }
	   @Override
	   	
	    public void show() { 
		   batch = Render.batch;
		   fondo = new ImagenF(Recursos.MENU);
	   }
	    @Override
	    public void render(float delta) {
	    	if(Gdx.input.isKeyPressed(Keys.ENTER)) {
	    		game.setScreen(new Juego(game));
	    	}
	    	Render.limpiarPantalla();
	    	
	        batch.begin();
	        fondo.dibujar();
	        batch.draw(BotonJugarInactivo, 100, 120);
	        batch.draw(BotonJugarActivo, 100, 100);
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