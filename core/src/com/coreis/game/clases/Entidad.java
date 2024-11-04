package com.coreis.game.clases;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;

import ENUMS.Velocidad;

abstract public class Entidad{
	private int id;
	protected static final float SPEED = 240;
	private float posX;
	private float posY;
	private String Nombre;
	private int vida;
	private Velocidad velocidad;
	private Texture img;
	
	

	

	public Entidad(int id, float posX, float posY, String nombre, int vida, Velocidad velocidad, Texture img) {
		super();
		this.id = id;
		this.posX = posX;
		this.posY = posY;
		Nombre = nombre;
		this.vida = vida;
		this.velocidad = velocidad;
		this.img = img;
	}
	

	public float getPosX() {
		return posX;
	}


	public void setPosX(float posX) {
		this.posX = posX;
	}


	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
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
