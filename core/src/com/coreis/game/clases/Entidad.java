package com.coreis.game.clases;

import ENUMS.Velocidad;

abstract public class Entidad{
	private int id;
	private Posicion posXYZ;
	private String Nombre;
	private int vida;
	private Velocidad speed;
	
	
	
	
	public Entidad(int id, Posicion posXYZ, String nombre, int vida, Velocidad speed) {
		super();
		this.id = id;
		this.posXYZ = posXYZ;
		Nombre = nombre;
		this.vida = vida;
		this.speed = speed;
	}
	
	
}
