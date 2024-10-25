package HUD;


import com.badlogic.gdx.Input;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.coreis.game.utiles.Colores;
import com.coreis.game.utiles.EstiloFuente;

import Interfaces.HUD;

public class PausaHud implements HUD{


	private Stage stage;
	private ScreenViewport vw;
	private Table tabla, contenedor;
	private Label etiqueta;
	private Label botonPausa;
	private Label.LabelStyle estiloFuente, estiloPeligro, fuenteAdvertencia;
	

	public PausaHud(int vida) {
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
		botonPausa = new Label(""+vida, estiloFuente);
		
	}
	


	@Override
	public void poblarStage() {
		
		stage.addActor(tabla);
		tabla.add(contenedor).size(300,500);	
		contenedor.add(botonPausa).size(300,200).expandX();
		contenedor.row();
		etiqueta.addListener(new ClickListener() {
			
		@Override
			public void clicked(InputEvent e, float x, float y) {
				System.out.println("long press " + x + ", " + y);
			
			}
		});
		botonPausa.addListener(new ChangeListener() {
			@Override
			public void changed(InputEvent e, float x, float y) {
				System.out.println("long press " + x + ", " + y);
			
			}
			
		
		
		
			
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