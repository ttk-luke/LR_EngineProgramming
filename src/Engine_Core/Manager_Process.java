package Engine_Core;
import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;


public class Manager_Process extends Process{
	public int bg = 0;
	private ArrayList<Object_Process> game_objects;
	private ArrayList<Object_Process> player_objects;
	//bounding boxes
	public static int frame_Count = 0;
	public static PVector offset = new PVector(0,0);
	public static PVector screen_Offset = new PVector(0,0);
	//spatial grid
	
	public Manager_Process(PApplett p) {
		super(p);
		this.name = "Manager_Process";
		game_objects = new ArrayList<Object_Process>();
		//bounding boxes
		screen_Offset.x = father.width / 2;
		screen_Offset.y = father.height / 2;
	}
	
	
	//add bounding boxes
	//add player objects
	//add object
	//remove object
	//start all
	//update all
	//key pressed
	//key released
}
