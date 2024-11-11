package com.coreis.game.pantallas;
	import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.coreis.game.MyGdxGame;
import com.coreis.game.elementos.ImagenF;
import com.coreis.game.utiles.Recursos;
import com.coreis.game.utiles.Render;
	

	 
	public class PantallaMenu implements Screen {
		final MyGdxGame game;
	    private SpriteBatch batch;
	    private Stage stage;
	    private Texture t;
	    private Texture fondo;
	    private Skin skin;
	    Texture fondo1;
	    public PantallaMenu(MyGdxGame game) {
	        this.game= game;
	        batch = Render.batch;
	        
	        
	        //////////////////////////////
	        stage = new Stage();
	        skin = new Skin(Gdx.files.internal("makigas/uiskin.json"));
	        TextButton jugar = new TextButton("Jugar", skin);
	        TextButton opciones = new TextButton ("Opciones", skin);
	        TextButton creditos = new TextButton ("Creditos", skin);
		    Table tabla= new Table ();
	        stage.addActor(tabla);
	        tabla.setFillParent(true);
	        tabla.row();
	        
	        jugar.setPosition(50,400);
	        opciones.setPosition(50, 300);
	        creditos.setPosition(50, 200);
	        
	        stage.addActor(creditos);
	        stage.addActor(jugar);
	        stage.addActor(opciones);
	        Gdx.input.setInputProcessor(stage);
	        stage.setDebugAll(true);
	        jugar.addCaptureListener(new InputListener() {
	        	@Override
	        	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
	        		// TODO Auto-generated method stub
	        		return true;
	        	}
	        	@Override
	        	public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
	        		super.touchUp(event, x, y, pointer, button);
	        		game.setScreen(new Juego(game));
	        	}
	        });
	        
	        //////////////////////////////
	        
	    }
	   @Override
	   	
	    public void show() { 
		   batch = new SpriteBatch();
		   fondo = new Texture(Recursos.MENUSCREEN);
		    fondo1 = new Texture(Recursos.FONDOJUEGO2);
		  
	   }
	    @Override
	    public void render(float delta) {
	    	Render.limpiarPantalla();
	    	MoverBotonJugar();
	        batch.begin();
	        batch.draw(fondo,0,0, 1152, 768);
	        
	        batch.end();
	        
	        stage.draw();
	        stage.act(delta);
	        
	    }
	    
	    
	 
	    private void MoverBotonJugar() {
			if (Gdx.input.isKeyPressed(Keys.Q)) {
				
			}
			
		}
		@Override
	    public void hide() { }
	 
	    @Override	
	    public void pause() { }
	 
	    @Override
	    public void resume() { }
	 
	  
	    
	 
	    @Override
	    public void resize(int width, int height) { 
	    }
	 
	    @Override
	    public void dispose() {
	        t.dispose();
	        batch.dispose();
	    }
		
	}