package com.coreis.game.clases;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;

import ENUMS.Controles;
import ENUMS.Velocidad;

public class Jugador extends Entidad{
	private Controles tipo;

	public Jugador(int id, Posicion posXYZ, String nombre, int vida, Velocidad speed, Texture img, Controles tipo) {
		super(id, posXYZ, nombre, vida, speed, img);
		this.tipo = tipo;
	}

	
	
	public void MovimientoJ1() {
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			posXY.setPosY(posXY.getPosY()+SPEED * Gdx.graphics.getDeltaTime()) ;
		}
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			posXY.setPosY(posXY.getPosY()-SPEED * Gdx.graphics.getDeltaTime());
		}
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			posXY.setPosX(posXY.getPosX()-SPEED * Gdx.graphics.getDeltaTime());
		}
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			posXY.setPosX(posXY.getPosX()+ SPEED * Gdx.graphics.getDeltaTime());
		}
		
	}
		public void MovimientoJ2() {
			if(Gdx.input.isKeyPressed(Keys.W)) {
				posXY.setPosY(posXY.getPosY()+SPEED * Gdx.graphics.getDeltaTime()) ;
			}
			if(Gdx.input.isKeyPressed(Keys.S)) {
				posXY.setPosY(posXY.getPosY()-SPEED * Gdx.graphics.getDeltaTime());
			}
			if(Gdx.input.isKeyPressed(Keys.A)) {
				posXY.setPosX(posXY.getPosX()-SPEED * Gdx.graphics.getDeltaTime());
			}
			if(Gdx.input.isKeyPressed(Keys.D)) {
				posXY.setPosX(posXY.getPosX()+ SPEED * Gdx.graphics.getDeltaTime());
			}
		}



		public Controles getTipo() {
			return tipo;
		}



		public void setTipo(Controles tipo) {
			this.tipo = tipo;
		}


	
	
	
}
