package HUD;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.coreis.game.utiles.Colores;
import com.coreis.game.utiles.EstiloFuente;

import Interfaces.HUD;

public class VidaHud implements HUD{

	private Stage stage;
	private ScreenViewport vw;
	private Table tabla, contenedor;
	private Label etiqueta;
	private Label etiqueta2;
	private Table mostrarVida;
	private Label mostrarVidaE;
	private Label.LabelStyle estiloFuente, estiloPeligro, fuenteAdvertencia;
	boolean owo;
	

	public VidaHud(int vida) {
	    crearFuentes(); // Primero crear las fuentes
	    crearActores(vida); // Después de crear las fuentes
	    poblarStage();
	    stage.setDebugAll(true); // Enable debug lines
	}

	
	@Override
	public void crearActores(int vida) {
		vw = new ScreenViewport();
		stage = new Stage(vw);
		tabla = new Table();
		tabla.setFillParent(true);
		contenedor = new Table();
		etiqueta = new Label(""+vida, estiloFuente);
		
	}

	@Override
	public void poblarStage() {
		stage.addActor(tabla);
		tabla.add(contenedor).size(100,100);
		contenedor.add(etiqueta).size(100,100).expandX();
		contenedor.row();
	}

	@Override
	public void dibujar() {
		stage.draw();//Dibujar el hud
		
	}

	@Override
	public void crearFuentes() {
		estiloFuente = EstiloFuente.generarFuente(50, Colores.ROJO, false);
	}
}