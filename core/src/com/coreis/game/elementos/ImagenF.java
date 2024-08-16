package com.coreis.game.elementos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.coreis.game.utiles.Render;


public class ImagenF {
	private Texture t;
	private Sprite s;
	public ImagenF (String Ruta) {
		t = new Texture(Ruta);
		s = new Sprite(t);
		
	}
	public void dibujar () {
		s.draw(Render.batch);	
		
		
	}
	
}

