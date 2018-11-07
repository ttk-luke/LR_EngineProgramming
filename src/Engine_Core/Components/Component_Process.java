package Engine_Core.Components;

import Engine_Core.Object_Process;
import Engine_Core.Process;
import Engine_Core.Transform_Core;

public abstract class Component_Process extends Process{
	public Component_Process (Object_Process o) {
		super(o.parent);
		this.??? = o;
		
		//this.gameObject = g; //components are linked to a gameObject
		//this.transform = this.gameObject.transform;
		//this.gameObject.components.add(this);
	}
	
}
