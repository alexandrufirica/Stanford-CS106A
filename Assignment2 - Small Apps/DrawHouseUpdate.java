import acm.graphics.*;
import acm.program.*;

public class DrawHouseUpdate extends GraphicsProgram {
	
	public void run (){
		door();
		body();
		roof();
		window();
	}
	
	public void body(){
		GRect body = new GRect (200 , 200, RECT_WIDTH , RECT_HEIGTH);
		add(body);
	}
	
	public void roof(){
		GLine ln1 = new GLine (200, 200 ,400, 100);
		GLine ln2 = new GLine (600, 200, 400, 100);
		add(ln1);
		add(ln2);
	}
	
	public void door(){
		GRect door = new GRect (365, 300, DOOR_WIDTH, DOOR_HEIGTH);
		GOval knob = new GOval (420, 370, 2 * KNOOB_RADIUS, 2 * KNOOB_RADIUS);
		add(door); 
		add(knob);
	}
	
	public void window(){
		GRect window1 = new GRect (240, 240, WINDOW_WIDTH, WINDOW_HEIGTH);
		GRect window2 = new GRect (490, 240, WINDOW_WIDTH, WINDOW_HEIGTH);
		add(window1);
		add(window2);
		
	}
	private static final double RECT_WIDTH = 400;
	private static final double RECT_HEIGTH = 250;
	private static final double DOOR_WIDTH = 75;
	private static final double DOOR_HEIGTH = 150;
	private static final double KNOOB_RADIUS = 8;
	private static final double WINDOW_WIDTH = 70;
	private static final double WINDOW_HEIGTH = 70;
}
