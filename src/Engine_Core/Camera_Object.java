package Engine_Core;
import Engine_Core.Manager_Process;
import Engine_Core.Object_Process;
import processing.core.PApplet;
import processing.core.PVector;

public class Camera_Object extends Object_Process{
	public Object_Process follow;
	public float offset_limit = 100;
	public PVector camera_offset = new PVector(0,0);
	public Camera_Object(PApplet p, Object_Process f) {
		super(p);
		this.follow = f;
	}
	
	public Camera_Object(PApplet p, Object_Process f, float limit) {
		super(p);
		this.follow = f;
		offset_limit = limit;
	}
	
	@Override
	public void start() {
	}
	
	@Override
	public void update() {
	}
	
	@Override
	public void render() {
		update_xy();
	}
	
	private void update_xy() {
		PVector virtualScreenCentre = Manager_Process.screen_Offset.copy();
		virtualScreenCentre.add(Manager_Process.offset);
		PVector virtualPlayer = Manager_Process.offset.copy();
		virtualPlayer.add(this.follow.transform.pos);
		float d = virtualScreenCentre.dist(virtualPlayer);
		
		if (d > offset_limit) {
			virtualScreenCentre.sub(virtualPlayer);
			virtualScreenCentre.add(this.camera_offset);
			Manager_Process.offset.lerp(virtualScreenCentre, 0.02f);
		}
	}
	
}
