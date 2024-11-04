package com.coreis.game.clases;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;

import ENUMS.Controles;
import ENUMS.Velocidad;

public class Jugador extends Entidad{
	private Controles tipo;
	
	public Jugador(int id, float posX, float posY, String nombre, int vida, Velocidad velocidad, Texture img,
			Controles tipo) {
		super(id, posX, posY, nombre, vida, velocidad, img);
		this.tipo = tipo;
	}
	public void MovimientoJ1() {
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			setPosY(getPosY()+SPEED * Gdx.graphics.getDeltaTime()) ;
		}
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			setPosY(getPosY()-SPEED * Gdx.graphics.getDeltaTime());
		}
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			setPosX(getPosX()-SPEED * Gdx.graphics.getDeltaTime());
		}
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			setPosX(getPosX()+ SPEED * Gdx.graphics.getDeltaTime());
		}
		
	}
		public void MovimientoJ2() {
			if(Gdx.input.isKeyPressed(Keys.W)) {
				setPosY(getPosY()+SPEED * Gdx.graphics.getDeltaTime()) ;
			}
			if(Gdx.input.isKeyPressed(Keys.S)) {
				setPosY(getPosY()-SPEED * Gdx.graphics.getDeltaTime());
			}
			if(Gdx.input.isKeyPressed(Keys.A)) {
				setPosX(getPosX()-SPEED * Gdx.graphics.getDeltaTime());
			}
			if(Gdx.input.isKeyPressed(Keys.D)) {
				setPosX(getPosX()+SPEED * Gdx.graphics.getDeltaTime());
			}
		}



		public Controles getTipo() {
			return tipo;
		}



		public void setTipo(Controles tipo) {
			this.tipo = tipo;
		}


	
	
	
}
