package Game_Runner;

import Engine_Core.*;
import Engine_Core.Components.Physics2D;
import processing.core.PApplet;
import processing.core.PVector;

public class Player_Sprite extends Sprite_Object
{
	float SForce = 2f;
	float JForce = 8f;
	public PVector size = new PVector(12,12);
	private Physics2D phys;
	public int line = parent.color(120,120,255);
	public int fill = parent.color(255);
	
	public Player_Sprite(PApplett p) {
		super(p);
	}
	
}
