package Engine_Core.Components;

import Engine_Core.Object_Process;
import Engine_Core.Process;
import Engine_Core.Transform_Core;

public abstract class Component_Process extends Process{
	public Component_Process (Object_Process o) {
		super(o.parent);
		this.game_object = o;
		this.transform = this.game_object.transform;
		this.game_object.component.add(this);
	}
	
	public Object_Process game_object;
	public Transform_Core transform;
	public abstract void start();
	public abstract void update();
	public abstract void render();
	
}
