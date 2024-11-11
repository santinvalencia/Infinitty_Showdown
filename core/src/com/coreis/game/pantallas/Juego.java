package com.coreis.game.pantallas;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.coreis.game.utiles.Recursos;
import com.coreis.game.utiles.Render;

import ENUMS.Controles;
import ENUMS.Velocidad;
import HUD.NombreHud;
import HUD.VidaHud;

import com.coreis.game.MyGdxGame;
import com.coreis.game.clases.Jugador;
import com.coreis.game.clases.Posicion;
import com.coreis.game.elementos.ImagenF;
import Interfaces.HUD;
public class Juego implements Screen{
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
	boolean color=true;
	 Sound golpear1;
	
	public Juego(MyGdxGame game) {
        this.game= game;
        batch = new SpriteBatch();
    }
	@Override
	public void show() {
		// TODO Auto-generated method++
		batch = Render.batch;
		
		
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
	}
	
	public void CaidaLibre(Jugador j) {
		if(j.getPosY()<0) {
			j.setPosY(0);
		}
		if(j.getPosY()>0) {
		j.setPosY(j.getPosY()-2);
		}
	}
	@Override
	public void render(float delta) {
		Render.limpiarPantalla();
		quitarVida(Keys.F);
		Jairo.MovimientoJ2();
		Carlitos.MovimientoJ1();
		CaidaLibre(Jairo);
		CaidaLibre(Carlitos);
		VidaJairo.refrescarTexto(Jairo);
		VidaCarlitos.refrescarTexto(Carlitos);
		NombreJairo.refrescarTexto(Jairo);
		NombreCarlitos.refrescarTexto(Carlitos);
		if(Gdx.input.isKeyJustPressed(Keys.ESCAPE)) {
			game.setScreen(new PantallaMenu(game));
		}
		cambiosMapa();
		
		batch.begin();
		batch.draw(fondo1, 0, 0);
		batch.draw(Jairo.getImg(), Jairo.getPosX(),Jairo.getPosY());
		batch.draw(Carlitos.getImg(), Carlitos.getPosX(),Carlitos.getPosY());
			
		batch.end();
			
			
			
		batch.begin();
		
		VidaJairo.dibujar();
		VidaCarlitos.dibujar();
		NombreJairo.dibujar();
		NombreCarlitos.dibujar();
		
		batch.end();
		
	}
	public void quitarVida(int a) {
		if(Gdx.input.isKeyJustPressed(a)) {
			golpear1 = Gdx.audio.newSound(Gdx.files.internal("sonidos/GOLPEAR1.ogg"));
			golpear1.setVolume(0, 55);
			golpear1.play();
		}
		
	}
	public void quitarVida(Jugador j, int a) {
		if(Gdx.input.isKeyJustPressed(a)) {
			j.setVida(j.getVida()-1);
		}
		
	}
	private void cambiosMapa() {
		if (Gdx.input.isKeyJustPressed(Keys.M)) {
			color = !color;
			if(color) {
				fondo1 = new Texture(Recursos.FONDOJUEGO2);
			}
			if (!color) {
				fondo1 = new Texture(Recursos.FONDOJUEGO);
			}
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
	}
	
	
}
