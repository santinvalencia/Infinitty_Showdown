package HUD;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
public class BotonJugar extends Actor implements Disposable{
	private Texture boton;
	private TextureRegion miBoton;
	
	
	public BotonJugar() {
		boton = new Texture("BotonJugarInactivo.png");
		miBoton = new TextureRegion(boton,200,200);
		setSize(200,200);
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		Color col = getColor();
		batch.setColor(col.r,col.g,col.b,col.a * parentAlpha);
		super.draw(batch, parentAlpha);
		batch.draw(miBoton, getX(), getY(), getOriginX(), getOriginY(), 
					getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
		
	}
	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
	}
	@Override
	public void dispose() {
		boton.dispose();
	}
}
