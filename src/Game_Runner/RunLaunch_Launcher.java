package Game_Runner;

import processing.core.PApplet;
import Engine_Core.*;

public class RunLaunch_Launcher extends Launcher_Core{

	public RunLaunch_Launcher(PApplet f) {
		super(f);
	}

	public void GameStart() {
		super.GameStart();
		Player_Sprite player = new Player_Sprite(parent, parent.width/2, parent.height/2,60, 60);
		player.start();
	}
	
}
