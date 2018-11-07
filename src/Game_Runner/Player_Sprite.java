package Game_Runner;

import Engine_Core.*;
import Engine_Core.Components.Physics2D_Component;
import game_engine2D.game_components.Physics2D;
import processing.core.PApplet;
import processing.core.PVector;

public class Player_Sprite extends Sprite_Object
{
	float SForce = 2f;
	float JForce = 8f;
	public PVector size = new PVector(12,12);
	private Physics2D_Component phys;
	public int line = parent.color(120,120,255);
	public int fill = parent.color(255);
	
	public Player_Sprite(PApplet p) 
	{
		super(p);
	}
	
	public Player_Sprite(PApplet p, float x, float y, float w, float h) 
	{
		super(p);
	}
	
	
	public void start() {
		this.transform.pos.x = parent.width / 2;
		this.transform.pos.y = parent.height / 2;
		this.transform.localBoundingBox.fromSize(size);
		this.phys = new Physics2D_Component(this);
		this.phys.start();
		this.phys.speed = SForce;
	}
	
}
