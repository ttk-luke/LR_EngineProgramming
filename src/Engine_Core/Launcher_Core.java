package Engine_Core;
import processing.core.PApplet;

public class Launcher_Core {
    public PApplet parent;

    public Launcher_Core(PApplet p) {
    	parent = p;
    }
    
    public Manager_Process g_manager;
    public void GameStart()     {
    	g_manager = new Manager_Process(parent);
    }
    public void UpdateAll() 
    {
    	g_manager.UpdateAll();
    }
    public void keypressed (char key, int keycode) 
    {
    	g_manager.key_Pressed (key, keycode);
    }
    public void keyreleased (char key, int keycode) 
    {
    	g_manager.key_Released (key,keycode);
    }
    
}
