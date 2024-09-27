package ENUMS;

import com.badlogic.gdx.*;
import com.badlogic.gdx.Input.Keys;

public enum Direcciones {
	ARRIBA(Gdx.input.isKeyPressed(Keys.UP)),IZQUIERDA(Gdx.input.isKeyPressed(Keys.LEFT)),
	DERECHA(Gdx.input.isKeyPressed(Keys.RIGHT)),ABAJO(Gdx.input.isKeyPressed(Keys.DOWN));

	Direcciones(boolean keyPressed) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
