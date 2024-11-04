package Interfaces;

import com.coreis.game.clases.Jugador;

public interface HUD {
	void crearFuentes();
	void crearActores(Jugador j);
	void poblarStage(Jugador j);
	void dibujar();
	void refrescarTexto(Jugador j);
	
	
	
}
