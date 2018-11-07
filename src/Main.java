import processing.core.PApplet;
import simple_platformer.Launcher;
public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Main");
	}
	public RunLaunch_Launcher launcher;
	public void setup() {
		background(0);
		launcher = new RunLaunch_Launcher(this);
		launcher.StartGame();
	}
	public void draw() {
		launcher.UpdateAll();
	}
	public void settings() {
		size(640,480);
	}
	// event handling
	public void keyPressed()    { 
		launcher.keyPressed(key, keyCode);
		}
	public void keyReleased()   { 
		launcher.keyReleased(key, keyCode); 
		}
//	void mouseMoved()    { launcher.mouseMoved(mouseX, mouseY); }
//	void mousePressed()  { SoundManager.clicked(mouseX,mouseY); activeScreen.mousePressed(mouseX, mouseY, mouseButton); }
//	void mouseDragged()  { launcher.mouseDragged(mouseX, mouseY, mouseButton); }
//	void mouseReleased() { launcher.mouseReleased(mouseX, mouseY, mouseButton); }
//	void mouseClicked()  { launcher.mouseClicked(mouseX, mouseY, mouseButton); }

}
