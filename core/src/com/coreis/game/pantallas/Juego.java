package com.coreis.game.pantallas;
import com.badlogic.gdx.Screen;
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
	Posicion posCarlitos= new Posicion (0, 0);
	Posicion posJairo = new Posicion(500, 0);
	Jugador Carlitos;
	Jugador Jairo;
	Texture fondo;
	Texture fondo1;
	boolean color=true;
	
	public Juego(MyGdxGame game) {
        this.game= game;
        batch = new SpriteBatch();
    }
	@Override
	public void show() {
		// TODO Auto-generated method++
		batch = Render.batch;
		
		
		fondo = new Texture(Recursos.FONDOJUEGO2);
		Jairo = new Jugador(
				2, posJairo, "Jairo",
				100, Velocidad.NORMAL,
				new Texture("jairo.png"),
				Controles.JUGADOR2);
		
		
		Carlitos = new Jugador (
				1, posCarlitos,
				"Carlitos", 100, Velocidad.NORMAL,
				new Texture("carlitos.png"),
				Controles.JUGADOR1
				);
		VidaJairo = new VidaHud(Jairo);
		VidaCarlitos = new VidaHud(Carlitos);
		NombreJairo = new NombreHud(Jairo);
		NombreCarlitos = new NombreHud(Carlitos);
	}
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Jairo.MovimientoJ2();
		Carlitos.MovimientoJ1();
		mostrarVida(Carlitos);
		mostrarVida(Jairo);
		Render.limpiarPantalla();
		quitarVida(Carlitos, Keys.H);
		quitarVida(Jairo, Keys.G);
		VidaJairo.refrescarTexto(Jairo);
		VidaCarlitos.refrescarTexto(Carlitos);
		NombreJairo.refrescarTexto(Jairo);
		NombreCarlitos.refrescarTexto(Carlitos);
		if(Gdx.input.isKeyJustPressed(Keys.ESCAPE)) {
			game.setScreen(new PantallaMenu(game));
		}
		cambiosMapa();
		
			batch.begin();
			
			batch.draw(fondo, 0, 0);
			batch.draw(Jairo.getImg(), Jairo.getPosXY().getPosX(),Jairo.getPosXY().getPosY());
			batch.draw(Carlitos.getImg(), Carlitos.getPosXY().getPosX(),Carlitos.getPosXY().getPosY());
			
			batch.end();
			
			
			
			batch.begin();
			VidaJairo.dibujar();
			VidaCarlitos.dibujar();
			NombreJairo.dibujar();
			NombreCarlitos.dibujar();
			batch.end();
		
	}
	public void quitarVida(Jugador j, int a) {
		if(Gdx.input.isKeyJustPressed(a)) {
			j.setVida(j.getVida()-1);
		}
		
	}
	private void cambiosMapa() {
		if (Gdx.input.isKeyJustPressed(Keys.K)) {
			color = !color;
			if(color) {
				fondo = new Texture(Recursos.FONDOJUEGO2);
			}
			if (!color) {
				fondo = new Texture(Recursos.FONDOJUEGO);
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
	
public void mostrarVida(Jugador j) {
		
		if(Gdx.input.isKeyJustPressed(Keys.U)) {
			
			System.out.println("Vida de "+ j.getNombre() + ": " + j.getVida());
			
		}
	}
}
