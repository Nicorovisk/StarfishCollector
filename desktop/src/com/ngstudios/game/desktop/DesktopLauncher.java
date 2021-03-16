package com.ngstudios.game.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.ngstudios.game.StarfishCollectorAlpha;
import com.ngstudios.game.StarfishCollectorBeta;

public class DesktopLauncher {
	public static void main (String[] args) {
		Game myGame = new StarfishCollectorBeta();
		LwjglApplication launcher =
				new LwjglApplication(myGame, "StarfishCollector", 800, 600);
	}
}
