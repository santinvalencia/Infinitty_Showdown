package com.coreis.game.clases;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;

import ENUMS.Velocidad;

abstract public class Entidad{
	private int id;
	protected static final float SPEED = 120;
	protected Posicion posXY;
	private String Nombre;
	private int vida;
	private Velocidad speed;
	private Texture img;
	
	

	public Entidad(int id, Posicion posXY, String nombre, int vida, Velocidad speed, Texture img) {
		super();
		this.id = id;
		this.posXY = posXY;
		Nombre = nombre;
		this.vida = vida;
		this.speed = speed;
		this.img = img;
	}

	public Posicion getPosXY() {
		return posXY;
	}

	public void setPosXY(Posicion posXY) {
		this.posXY = posXY;
	}

	public Texture getImg() {
		return img;
	}
	
	
		
	
}
