	package com.coreis.game.pantallas;
	import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
	import com.badlogic.gdx.graphics.GL20;
	import com.badlogic.gdx.graphics.Texture;
	import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.coreis.game.MyGdxGame;
import com.coreis.game.elementos.ImagenF;
	import com.coreis.game.utiles.Recursos;
	import com.coreis.game.utiles.Render;
	
	public class Splash_Screen implements Screen {
		final MyGdxGame game;
	    private SpriteBatch batch;
	    private Texture t;
	    ImagenF fondo;
	    boolean fadeInTerminado = false, termina = false;
	    float f = 0;
	    float contTiempo=0, tiempoEspera= 5;
	    float contTiempoTermina=0, tiempoTermina=5;
	    
	    public class immagenCarga{
	    	
	    	public static final String loadingScreen = "assets/logoCVF.PNG";
	   
	    }
	    public Splash_Screen(MyGdxGame game) {
	        this.game = game;
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
	    	
	    	if (termina) {
	    		
	    		game.setScreen(new PantallaMenu(game));
	    	}
	    	Render.limpiarPantalla();
	    	procesarFade();
	        batch.begin();
	        fondo.dibujar();
	        batch.end();
	        
	    }
	    private void procesarFade() {
	    	if(!fadeInTerminado) {
	    		f+=0.01f;
	    		if(f>1){
	    		f=1;
	    		fadeInTerminado = true;
	    		}
	    		
	    	}else {
	    		contTiempo+=0.1F;
	    		if(contTiempo>tiempoEspera) {
	    			f -= 0.01f;
	    			if (f<0) {
	    				f=0;
	    				termina = true;
	    			}
	    		}
	    	}
	    	fondo.setAparicionF(f);
	    	
	    		if(termina) {
	    		contTiempoTermina+=0.04f;
	    		if(contTiempoTermina>tiempoTermina) {
	    		Render.Menu.setScreen(new PantallaMenu(game));
	    		}
	}
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
