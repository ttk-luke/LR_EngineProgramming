package Engine_Core;

import Engine_Core.Components.Component_Process;
import processing.core.PApplet;
import processing.core.PVector;
//import Game_Components.Component_Process;

public abstract class Sprite_Object extends Object_Process {

	public PVector size = new PVector(13,13);
	//public Sprite_Object(PApplett p) 
	//{
	//	super(p);
	//}
	
	public Sprite_Object(PApplet p, float x, float y) 
	{
		super(p);
		this.transform.position.x = x;
		this.transform.position.y = y;
		
	}
	
	public abstract void render();
	
	public void update() {
		for (int i = this.component.size() - 1; 0 <= i; i--) {
			Component_Process comp = this.components.get(i);
			comp.update();
			comp.render();
		}
	}
}
