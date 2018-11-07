package Engine_Core;
import processing.core.PApplet;

public abstract class Process {
	public String name;
	public int ID;
    public PApplet parent;
    
    public Process (PApplet p) {
    	parent = p;
    }
    
}
