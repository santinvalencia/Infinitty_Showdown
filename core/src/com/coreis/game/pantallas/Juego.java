package com.coreis.game.pantallas;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.coreis.game.MyGdxGame;
import com.coreis.game.clases.Jugador;
import com.coreis.game.utiles.Recursos;
import com.coreis.game.utiles.Render;

import ENUMS.Controles;
import ENUMS.Velocidad;
import HUD.NombreHud;
import HUD.VidaHud;
import entities.Player;
import mundo.GameMap;
import mundo.TileType;
import mundo.TiledGameMap;
public class Juego implements Screen{
	OrthographicCamera camera;
	SpriteBatch batch;	
	final MyGdxGame game;
	VidaHud VidaJairo;
	VidaHud VidaCarlitos;
	NombreHud NombreCarlitos;
	NombreHud NombreJairo;
	public static final float SPEED = 120;
	Jugador Carlitos;
	Jugador Jairo;
	Texture fondo1;
	Sound golpear1;
	GameMap gameMap;
	Stage stage;
	Player p;
	
	public Juego(MyGdxGame game) {
        this.game= game;
    }
	@Override
	public void show() {
		batch = Render.batch;
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera= new OrthographicCamera();
		camera.setToOrtho(false, w, h);
		camera.update();
		gameMap = new TiledGameMap();
		stage = new Stage();
		crearBotonMenu();
		
		
		
		fondo1 = new Texture(Recursos.FONDOJUEGO2);
		Jairo = new Jugador(2, 1000,0,
				"Jairo",100, Velocidad.NORMAL,
				new Texture("jairo.png"),Controles.JUGADOR2);
		
		
		Carlitos = new Jugador (
				1, 0,0,
				"Carlitos", 100, Velocidad.NORMAL,
				new Texture("carlitos.png"),
				Controles.JUGADOR1
				);
		VidaJairo = new VidaHud(Jairo);
		VidaCarlitos = new VidaHud(Carlitos);
		NombreJairo = new NombreHud(Jairo);
		NombreCarlitos = new NombreHud(Carlitos);
		fondo1 = new Texture(Recursos.FONDOJUEGO);
		p = new Player(50, 50, gameMap);
	}
	
	@Override
	public void render(float delta) {
		Render.limpiarPantalla();
		sonidoGolpe(Keys.F);
		Jairo.MovimientoJ2();
		Carlitos.MovimientoJ1();
		CaidaLibre(Jairo);
		CaidaLibre(Carlitos);
		VidaJairo.refrescarTexto(Jairo);
		VidaCarlitos.refrescarTexto(Carlitos);
		NombreJairo.refrescarTexto(Jairo);
		NombreCarlitos.refrescarTexto(Carlitos);
		detectarBloque();
		
		
		batch.begin();
		batch.draw(fondo1, 0, 0);
		//batch.draw(Jairo.getImg(), Jairo.getPosX(),Jairo.getPosY());
		//batch.draw(Carlitos.getImg(), Carlitos.getPosX(),Carlitos.getPosY());
		p.render(batch);
		batch.end();
		stage.draw();
        stage.act(delta);
		
		
        camera.update();
		gameMap.update(Gdx.graphics.getDeltaTime());
		gameMap.render(camera, batch);
		
		
		
		batch.begin();
		
		VidaJairo.dibujar();
		VidaCarlitos.dibujar();
		NombreJairo.dibujar();
		NombreCarlitos.dibujar();
		
		batch.end();
		
	}
	
	public void sonidoGolpe(int a) {
		if(Gdx.input.isKeyJustPressed(a)) {
			golpear1 = Gdx.audio.newSound(Gdx.files.internal("sonidos/GOLPEAR1.ogg"));
			golpear1.setVolume(0, 55);
			golpear1.play();
		}
		
	}
	public void CaidaLibre(Jugador j) {
		if(j.getPosY()<0) {
			j.setPosY(0);
		}
		if(j.getPosY()>0) {
		j.setPosY(j.getPosY()-2);
		}
	}
	public void quitarVida(Jugador j, int a) {
		if(Gdx.input.isKeyJustPressed(a)) {
			j.setVida(j.getVida()-1);
		}
		
	}
	@Override
	public void resize(int width, int height) {
		
		
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
		gameMap.dispose();
	}
	
	private void crearBotonMenu() {
		
		Skin skin = new Skin(Gdx.files.internal("makigas/uiskin.json"));
		TextButton menu = new TextButton ("Menu", skin);
		menu.setPosition(520,690);
		menu.setSize(80, 50);
        stage.addActor(menu);
        Gdx.input.setInputProcessor(stage);
        stage.setDebugAll(false);
        menu.addCaptureListener(new InputListener() {
        	@Override
        	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
        		// TODO Auto-generated method stub
        		return true;
        	}
        	@Override
        	public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
        		super.touchUp(event, x, y, pointer, button);
        		game.setScreen(new PantallaMenu(game));
        	}
        });
		
	}

	
private void detectarBloque() {
	if (Gdx.input.isTouched()) {
		camera.translate(-Gdx.input.getDeltaX(), Gdx.input.getDeltaY());
		camera.update();
	}
	if (Gdx.input.justTouched()) {
		Vector3 pos = camera.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
		TileType type = gameMap.getTileTypeByLocation(1, pos.x, pos.y);
		
		if (type != null) {
			System.out.println("clickeaste en el tile con id: "+ type.getId()+ " llamado:"+ type.getName());
		}
	}
	}	

}