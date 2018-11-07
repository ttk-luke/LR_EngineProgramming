package Engine_Core;
import processing.core.PApplet;

public class Launcher_Core {
    public PApplet parent;

    public Launcher_Core(PApplet p) {
    	parent = p;
    }
    
    public Manager_Process g_manager;
    public void StartGame()     {
    	g_manager = new Manager_Process(parent);
    }
    public void UpdateAll() 
    {
    	g_manager.UpdateAll();
    }
    public void keypressed (char key, int keycode) 
    {
    	g_manager.keypressed (key, keycode);
    }
    public void keyreleased (char key, int keycode) 
    {
    	g_manager.keyreleased (key,keycode);
    }
    
}
