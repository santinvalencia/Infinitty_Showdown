package com.coreis.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.coreis.game.MyGdxGame;
import com.badlogic.gdx.*;
// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(144);
		config.setTitle("Infinitty Showdown");
		config.setWindowedMode(1023, 768); //
        config.setResizable(true); // 
		new Lwjgl3Application(new MyGdxGame(), config);
		
	}
}
