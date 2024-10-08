package com.coreis.game.clases;

import ENUMS.Controles;
import ENUMS.Velocidad;

public class Jugadores extends Entidad{
	Controles tipo;

	public Jugadores(int id, Posicion posXYZ, String nombre, int vida, Velocidad speed, Controles tipo) {
		super(id, posXYZ, nombre, vida, speed);
		this.tipo = tipo;
	}
	
	
	
}
