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
	private Velocidad velocidad;
	private Texture img;
	
	

	public Entidad(int id, Posicion posXY, String nombre, int vida, Velocidad speed, Texture img) {
		super();
		this.id = id;
		this.posXY = posXY;
		Nombre = nombre;
		this.vida = vida;
		this.velocidad = speed;
		this.img = img;
	}

	public Posicion getPosXY() {
		return posXY;
	}

	public void setPosXY(Posicion posXY) {
		this.posXY = posXY;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Velocidad getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Velocidad velocidad) {
		this.velocidad = velocidad;
	}

	public Texture getImg() {
		return img;
	}

	public void setImg(Texture img) {
		this.img = img;
	}

	public static float getSpeed() {
		return SPEED;
	}

	
		
	
}
