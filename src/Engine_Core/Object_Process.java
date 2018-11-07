package Engine_Core;

import processing.core.PApplet;

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
	//key pressed
	//key released
	
}
