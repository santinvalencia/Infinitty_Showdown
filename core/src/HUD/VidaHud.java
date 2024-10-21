package HUD;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.mygdx.game.Utiles.EstiloFuente;

import Interfaces.HUD;

public class VidaHud implements HUD{
	private Stage stage;
	private Table contenedor, tabla;
	private Label etiqueta;
	private Label.LabelStyle estiloFuente;
	public VidaHud() {
		
	}
	@Override
	public void crearActores() {
		stage.addActor(tabla);
		tabla.add(contenedor).size(100, 100);
		contenedor.add(etiqueta);
		contenedor.row();
		System.out.println("funciono");
		etiqueta = new Label("Eq", estiloFuente);
		
	}
	@Override
	public void poblarStage() {
		
		
	}
	@Override
	public void dibujar() {
		
		
	}
	@Override
	public void crearFuentes() {
		estiloFuente = EstiloFuente.generarFuente(20, #111111, false);
	}
	
}
