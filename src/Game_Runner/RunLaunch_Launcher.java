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
		
        //this.gameManager.addObject(player);
        //this.gameManager.addPlayerGameObjects(player);
        //Camera2D camera = new Camera2D(parent,player, 99);
        //camera.cameraOffset.y = 90;
        //this.gameManager.addObject(camera);
        //int platforms = 50;
        //Tile platform;
        //int tw = 50;
        //int th = 20;
        //for(int i = 0; i < platforms; i++){
        //	float x = parent.random(0, parent.width);
        //	float y = parent.random(-parent.height * 2f, parent.height*0.9f);
        //  platform = new Tile(parent, x,y,tw, th);
        //  platform.start();
        //  this.gameManager.addObject(platform);
        //  this.gameManager.addGameBoundingBoxes(platform);
	}
	
	//platforms = 5;
    //for(int i = 0; i < platforms; i++){
    //    platform = new Tile(parent, 26+ i * tw,40 + 15 * i,tw, th);
    //    platform.start();
    //    this.gameManager.addObject(platform);
    //    this.gameManager.addGameBoundingBoxes(platform);
    //}
	
    //platform = new Tile(parent, parent.width/2, parent.height-100,tw, th);
    //platform.start();
    //this.gameManager.addObject(platform);
    //this.gameManager.addGameBoundingBoxes(platform);
    
    //platform = new Tile(parent, (parent.width*0.75f),(parent.height*0.65f),tw, th);
    //platform.start();
    //this.gameManager.addObject(platform);
    //this.gameManager.addGameBoundingBoxes(platform);
    
    //platform = new Tile(parent, (parent.width*0.65f),(parent.height*0.45f),tw, th);
    //platform.start();
    //this.gameManager.addObject(platform);
    //this.gameManager.addGameBoundingBoxes(platform);
	
	//GROUND
    
    //for(int i = 0; i < 20; i++){
    //	platform = new Tile(parent, i*tw, parent.height+10,tw, th);
    //    platform.start();
    //    platform.strokeColour = parent.color(0,200,200);
    //    platform.fillColour = parent.color(0,200,200);
    //    this.gameManager.addObject(platform);
    //    this.gameManager.addGameBoundingBoxes(platform);
    //}
    
    //left
    //for(int i = 0; i < 200; i++){
    //	platform = new Tile(parent, 0,(-parent.height *3)+th*i,tw, th);
    //    platform.start();
    //    platform.strokeColour = parent.color(0,200,200);
    //    platform.fillColour = parent.color(0,200,200);
    //    this.gameManager.addObject(platform);
    //    this.gameManager.addGameBoundingBoxes(platform);
    //}
    //right
    //for(int i = 0; i < 200; i++){
    	//platform = new Tile(parent, parent.width,(-parent.height *3)+th*i,tw, th);
        //platform.start();
        //platform.strokeColour = parent.color(0,200,200);
        //platform.fillColour = parent.color(0,200,200);
        //this.gameManager.addObject(platform);
        //this.gameManager.addGameBoundingBoxes(platform);
    //}
    
    //this.gameManager.StartAll();
}
  //public void UpdateAll(){
  //      super.UpdateAll();
  //  }
	
	
}
