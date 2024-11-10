package HUD;

import com.badlogic.gdx.scenes.scene2d.Stage;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.coreis.game.clases.Jugador;
import com.coreis.game.utiles.Colores;
import com.coreis.game.utiles.EstiloFuente;

import ENUMS.Controles;
import Interfaces.HUD;

public class VidaHud implements HUD{

	private Stage stage;
	private ScreenViewport vw;
	private Table tabla, contenedor;
	private Label etiqueta;
	private Label.LabelStyle estiloFuente, estiloPeligro, fuenteAdvertencia;
	

	public VidaHud(Jugador j) {
	    crearFuentes(); // Primero crear las fuentes
	    crearActores(j); // Después de crear las fuentes
	    poblarStage(j);
	    refrescarTexto(j);
	    stage.setDebugAll(true);
	}

	@Override
	public void refrescarTexto(Jugador j) {
		etiqueta.setText(j.getVida());
		
	}
	
	
	@Override
	public void crearActores(Jugador j) {
		vw = new ScreenViewport();
		stage = new Stage(vw);
		tabla = new Table();
		if(j.getTipo() == Controles.JUGADOR1 ) {
			tabla.setPosition(stage.getWidth()/stage.getWidth()+50, stage.getHeight()-50);;
		}
		if(j.getTipo() == Controles.JUGADOR2) {
			tabla.setPosition(stage.getWidth()-100, stage.getHeight()-50);
		}
		contenedor = new Table();
		etiqueta = new Label(""+j.getVida(), estiloFuente);
		
	}

	
	@Override
	public void poblarStage(Jugador j) {
		stage.addActor(tabla);
		tabla.add(contenedor).size(100,100);
		contenedor.add(etiqueta).size(100,100);
		
		
	}

	@Override
	public void dibujar() {
		stage.draw();//Dibujar el hud
		
	}

	
	@Override
	public void crearFuentes() {
		estiloFuente = EstiloFuente.generarFuente(50, Colores.VERDE, false);
	}

}