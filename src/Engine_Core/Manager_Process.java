package Engine_Core;
import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

import Engine_Core.Object_Process;
import Engine_Core.Components.SpatialGrid_Core;


public class Manager_Process extends Process{
	public int bg = 0;
	private ArrayList<Object_Process> game_objects;
	private ArrayList<Object_Process> player_objects;
	//bounding boxes
	public static int frame_count = 0;
	public static PVector offset = new PVector(0,0);
	public static PVector screen_Offset = new PVector(0,0);
	//spatial grid
	
	public Manager_Process(PApplet p) {
		super(p);
		this.name = "Manager_Process";
		game_objects = new ArrayList<Object_Process>();
		//bounding boxes
		screen_Offset.x = parent.width / 2;
		screen_Offset.y = parent.height / 2;
	}
	
	
	//add bounding boxes
	//add player objects
	//add object
	//remove object
	//start all
	//update all
	//key pressed
	//key released
	
	//public void addBoundingBoxes(GameObject b) {
	//	gameBoundingBoxes.add(b.transform.NewWorldBoundingBox());
	//}

	//public void addPlayerGameObjects(GameObject b) {
	//	playerGameObjects.add(b);
	//}

	//public void addObject(GameObject g) {
	//	gameObjects.add(g);
	//}

	//public void removeObject(GameObject g) {
	//	gameObjects.remove(gameObjects.lastIndexOf(g));
	//}

	public void StartAll() {

		//for (int i = 0; i < gameObjects.size(); i++) {
		//	GameObject g = gameObjects.get(i);
		//	g.start();

		}
		//basicSpatialGrid = new BasicSpatialGrid(parent.height,2);
	
	public void UpdateAll() {
		parent.pushMatrix();
		parent.translate(offset.x, offset.y);
		parent.background(bg);
		for (int i = 0; i < game_objects.size(); i++) {

			Object_Process g = game_objects.get(i);
			g.update();
			g.render();
		}
		//checkCollisions();
		frame_count ++; // completed all frame update and renderings
		parent.popMatrix();
	}

	public void key_Pressed(char key, int keyCode) {
		for (int i = 0; i < game_objects.size(); i++) {
			// send key press to player
			Object_Process g = game_objects.get(i);
			g.keyPressed(key, keyCode);
		}

	}
	
	public void key_Released(char key, int keyCode) {
		for (int i = 0; i < game_objects.size(); i++) {
			// send key press to player
			Object_Process g = game_objects.get(i);
			g.keyReleased(key, keyCode);
		}

	}

}
	
