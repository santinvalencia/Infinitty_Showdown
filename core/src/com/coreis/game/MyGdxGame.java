package com.coreis.game;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.coreis.game.pantallas.Splash_Screen;
import com.coreis.game.utiles.Render;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport; 	

public class MyGdxGame extends Game {
	SpriteBatch batch;
	private FitViewport viewport;
	private ScreenViewport vw;
    private Camera camera;
    private Stage stage;
    private Table table;
	public MyGdxGame() { 
		super(); 
	}
	
	@Override
	public void create () {
		batch = Render.batch;
		this.setScreen(new Splash_Screen(this));
		camera = new PerspectiveCamera();
		vw = new ScreenViewport();
        viewport = new FitViewport(1152, 768, camera);
	}
	

	public void render () {
		super.render();
	}
	
	
	@Override
	public void dispose () {
		super.dispose();
		Render.batch.dispose();


	}
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

}	
