import acm.program.*;
import acm.graphics.*;
 
public class DrawHouse2 extends GraphicsProgram{
	
	public void run(){
		double x = (getWidth() - HOUSE_WIDTH) / 2;
		double y = getHeight();
		drawHouse (x, y);
	}
	
	private void drawHouse (double x, double y){
		drawHouseBody(x, y);
		drawHouseRoof(x, y);
		drawWindows(x, y);
		drawDoor(x, y);
	}
	
	private void drawHouseBody (double x , double y){
		double x0 = x;
		double y0 = y - HOUSE_BASEMENT - HOUSE_HEIGHT;
		GRect rect = new GRect ( x0 , y0, HOUSE_WIDTH, HOUSE_HEIGHT);
		add(rect);
	}
	
	private void drawHouseRoof (double x , double y){
		GLine line = new GLine (x , y - HOUSE_BASEMENT - HOUSE_HEIGHT, x + HOUSE_WIDTH /2, y - HOUSE_HEIGHT - HOUSE_HEIGHT /2);
		GLine line2 = new GLine (x + HOUSE_WIDTH, y - HOUSE_BASEMENT - HOUSE_HEIGHT, x + HOUSE_WIDTH /2, y - HOUSE_HEIGHT - HOUSE_HEIGHT /2);
		add(line);
		add(line2);
	}
	
	private void drawWindows (double x , double y){
		upWindows (x -  WINDOW_GLASS_WIDHT + HOUSE_WIDTH / 4 , y - HOUSE_BASEMENT - HOUSE_HEIGHT + 2 * WINDOW_GLASS_HEIGHT);
		upWindows (x - WINDOW_GLASS_WIDHT + HOUSE_WIDTH - HOUSE_WIDTH/4 , y - HOUSE_BASEMENT - HOUSE_HEIGHT + 2 * WINDOW_GLASS_HEIGHT);
		downWindows (x - WINDOW_GLASS_WIDHT + HOUSE_WIDTH / 4 - WINDOW_GLASS_WIDHT /2 , y - HOUSE_BASEMENT - WINDOW_GLASS_HEIGHT - WINDOW_GLASS_HEIGHT /2);
		downWindows (x - WINDOW_GLASS_WIDHT + HOUSE_WIDTH - HOUSE_WIDTH/4 - WINDOW_GLASS_WIDHT /2 , y - HOUSE_BASEMENT - WINDOW_GLASS_HEIGHT - WINDOW_GLASS_HEIGHT /2);
	}
	
	private void upWindows (double x, double y){
		GRect window = new GRect ( x + WINDOW_GLASS_WIDHT , y, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		GRect window2 = new GRect ( x, y, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		GRect window3 = new GRect ( x + WINDOW_GLASS_WIDHT, y - WINDOW_GLASS_HEIGHT, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		GRect window4 = new GRect ( x, y -WINDOW_GLASS_HEIGHT, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		add(window);
		add(window2);
		add(window3);
		add(window4);
	}
	
	private void downWindows (double x, double y){
		GRect window = new GRect ( x, y, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		GRect window2 = new GRect ( x, y -WINDOW_GLASS_HEIGHT, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		GRect window3 = new GRect ( x + WINDOW_GLASS_WIDHT , y, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		GRect window4 = new GRect ( x + WINDOW_GLASS_WIDHT, y - WINDOW_GLASS_HEIGHT, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		GRect window5 = new GRect ( x + 2 * WINDOW_GLASS_WIDHT, y -WINDOW_GLASS_HEIGHT, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		GRect window6 = new GRect ( x + 2 * WINDOW_GLASS_WIDHT, y, WINDOW_GLASS_WIDHT, WINDOW_GLASS_HEIGHT);
		add(window);
		add(window2);
		add(window3);
		add(window4);
		add(window5);
		add(window6);
	}
	
	private void drawDoor ( double x, double y){
		GRect door = new GRect ( x - DOOR_WIDTH /2 + HOUSE_WIDTH /2, y - HOUSE_BASEMENT - DOOR_HEIGHT, DOOR_WIDTH, DOOR_HEIGHT);
		GOval knob = new GOval ( x + HOUSE_WIDTH /2 + DOOR_WIDTH /2 - 2 * DOOR_KNOB_RADIUS, y - HOUSE_BASEMENT - DOOR_HEIGHT /2, DOOR_KNOB_RADIUS, DOOR_KNOB_RADIUS);
		add(door);
		add(knob);
	}
	
	

	private static final double HOUSE_WIDTH = 400;
	private static final double HOUSE_HEIGHT = 300;
	private static final double HOUSE_BASEMENT = 20;
	
	private static final double WINDOW_GLASS_WIDHT = 30;
	private static final double WINDOW_GLASS_HEIGHT = 40;
	
	private static final double DOOR_WIDTH = 60;
	private static final double DOOR_HEIGHT =100;
	private static final double DOOR_KNOB_RADIUS = 5;
}
