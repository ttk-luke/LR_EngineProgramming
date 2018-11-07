package Engine_Core;

import java.util.ArrayList;

import Engine_Core.Components.*;
import processing.core.*;

public abstract class Object_Process extends Process {

	public Object_Process(PApplet p) {
		super(p);
		this.component = new ArrayList<Component_Process>();
	}

	public String name;
	public String tag;
	
	public ArrayList<Component_Process> component;
	public Transform_Core transform = new Transform_Core();
	public abstract void start();
	public abstract void update();
	public abstract void render();
	//check collision
	public void keyPressed(char key, int keyCode) {}
	public void keyReleased(char key, int keyCode) {}
	
	public String ToString() {
		return this.name;
	}
	
}
