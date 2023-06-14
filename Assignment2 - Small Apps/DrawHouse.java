import acm.graphics.*;
import acm.program.*;

public class DrawHouse extends GraphicsProgram {
	
	public void run (){
		door();
		body();
		roof();
		window();
	}
	
	public void body(){
		GRect body = new GRect (200 , 200, 400 ,250);
		add(body);
	}
	
	public void roof(){
		GLine ln1 = new GLine (200, 200 ,400, 100);
		GLine ln2 = new GLine (600, 200, 400, 100);
		add(ln1);
		add(ln2);
	}
	
	public void door(){
		GRect door = new GRect (365, 300, 75, 150);
		GOval knob = new GOval (420, 370, 15, 15);
		add(door);
		add(knob);
	}
	
	public void window(){
		GRect window1 = new GRect (240, 240, 70, 70);
		GRect window2 = new GRect (490, 240, 70, 70);
		add(window1);
		add(window2);
		
	}
	

}
