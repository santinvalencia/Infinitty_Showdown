package com.coreis.game.clases;

import com.badlogic.gdx.graphics.Texture;

import ENUMS.Controles;
import ENUMS.Velocidad;

public class Jugador extends Entidad{
	private Controles tipo;

	public Jugador(int id, Posicion posXYZ, String nombre, int vida, Velocidad speed, Texture img, Controles tipo) {
		super(id, posXYZ, nombre, vida, speed, img);
		this.tipo = tipo;
	}

	
	
	
	
	
	
}
