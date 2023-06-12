import acm.program.*;
import acm.graphics.*;

public class DrawHouseOfUsher extends GraphicsProgram {
	
	public void run(){
		double x = HOUSE_INSET;
		double y = getHeight();
		drawUsherHouse(x,y);
		
	}
	
	private void drawUsherHouse(double x, double y){
	
		drawHouse( x, y);
		drawHouseColumn( x , y);
		drawRoof( x, y);
		drawTrees( x, y);
		drawWindows( x, y);
		drawDoor(x ,y);
	}
	
	private void drawHouse ( double x, double y){
		double x0 = x + HOUSE_INSET + HOUSE_COLUMN_WIDTH;
		double y0 = y - HOUSE_BASEMENT - HOUSE_HEIGHT;
		GRect house = new GRect ( x0, y0, HOUSE_WIDTH, HOUSE_HEIGHT);
		add(house);
	}
	
	private void drawHouseColumn (double x, double y){
		drawColumn( x + HOUSE_INSET, y - HOUSE_BASEMENT - HOUSE_COLUMN_HEIGHT );
		drawColumn ( x + HOUSE_INSET +HOUSE_COLUMN_WIDTH + HOUSE_WIDTH, y - HOUSE_BASEMENT - HOUSE_COLUMN_HEIGHT);
		
	}
	
	private void drawColumn (double x, double y){
		GRect column = new GRect (x, y, HOUSE_COLUMN_WIDTH, HOUSE_COLUMN_HEIGHT);
		GLine line = new GLine ( x, y, x + HOUSE_COLUMN_WIDTH / 2, y - HOUSE_COLUMN_HEIGHT / 4);
		GLine line2 = new GLine (x + HOUSE_COLUMN_WIDTH, y, x + HOUSE_COLUMN_WIDTH / 2, y - HOUSE_COLUMN_HEIGHT / 4);
		add(column);
		add(line);
		add(line2);
	}
	
	private void drawRoof (double x, double y){
		GLine line = new GLine ( x + HOUSE_INSET + HOUSE_COLUMN_WIDTH , y - HOUSE_BASEMENT - HOUSE_HEIGHT , x + HOUSE_INSET + HOUSE_COLUMN_WIDTH + HOUSE_WIDTH / 2, y - HOUSE_BASEMENT - HOUSE_HEIGHT - HOUSE_WIDTH);
		GLine line2 = new GLine (x + HOUSE_INSET + HOUSE_COLUMN_WIDTH + HOUSE_WIDTH, y - HOUSE_BASEMENT - HOUSE_HEIGHT, x + HOUSE_INSET + HOUSE_COLUMN_WIDTH + HOUSE_WIDTH / 2, y - HOUSE_BASEMENT - HOUSE_HEIGHT - HOUSE_WIDTH);
		add(line);
		add(line2);
	}

	private void drawTrees (double x, double y){
		tree ( x + HOUSE_INSET + 3 * HOUSE_COLUMN_WIDTH + HOUSE_WIDTH, y - HOUSE_BASEMENT - TREE_HEIGHT);
		tree ( x + HOUSE_INSET + 4 * HOUSE_COLUMN_WIDTH + HOUSE_WIDTH + TREE_WIDTH, y - HOUSE_BASEMENT - TREE_HEIGHT);
		tree ( x + HOUSE_INSET + 5 * HOUSE_COLUMN_WIDTH + HOUSE_WIDTH + 2* TREE_WIDTH, y - HOUSE_BASEMENT - TREE_HEIGHT);
	}
	
	private void tree(double x, double y){
		GRect tree = new GRect ( x, y, TREE_WIDTH, TREE_HEIGHT );
		GLine line = new GLine ( x, y, x + TREE_WIDTH /2, y - TREE_HEIGHT / 2);
		GLine line2 = new GLine ( x + TREE_WIDTH, y, x + TREE_WIDTH /2, y - TREE_HEIGHT / 2);
		add(tree);
		add(line);
		add(line2);
	}
	
	private void drawWindows (double x, double y){
		window ( x + HOUSE_INSET + HOUSE_COLUMN_WIDTH + HOUSE_WIDTH / 4 - WINDOWS_DIAMETER /2, y - HOUSE_BASEMENT - HOUSE_HEIGHT + HOUSE_HEIGHT / 4 );
		window ( x + HOUSE_INSET + HOUSE_COLUMN_WIDTH + HOUSE_WIDTH - HOUSE_WIDTH / 4 - WINDOWS_DIAMETER /2, y - HOUSE_BASEMENT - HOUSE_HEIGHT + HOUSE_HEIGHT / 4 );
	}
	
	private void window ( double x, double y){
		GOval window = new GOval ( x, y, WINDOWS_DIAMETER, WINDOWS_DIAMETER );
		add(window);
	}
	
	private void drawDoor (double x, double y){
		door(x + HOUSE_INSET + HOUSE_COLUMN_WIDTH + HOUSE_WIDTH / 2 - DOOR_WIDTH /2  , y - HOUSE_BASEMENT - DOOR_HEIGHT);
	}
	
	private void door( double x, double y){
		GRect door = new GRect (x ,y, DOOR_WIDTH, DOOR_HEIGHT);
		GLine line = new GLine ( x, y, x + DOOR_WIDTH / 2, y -  DOOR_HEIGHT / 2);
		GLine line2 = new GLine ( x + DOOR_WIDTH, y, x + DOOR_WIDTH / 2, y -  DOOR_HEIGHT / 2);                             
		add(door);
		add(line);
		add(line2);
	}

	private static final double HOUSE_WIDTH = 150;
	private static final double HOUSE_HEIGHT = 200;
	private static final double HOUSE_BASEMENT = 20;
	private static final double HOUSE_INSET = 20;
	
	private static final double HOUSE_COLUMN_WIDTH = 50;
	private static final double HOUSE_COLUMN_HEIGHT = 300;
	
	private static final double TREE_WIDTH = 25;
	private static final double TREE_HEIGHT = 130;
	
	private static final double WINDOWS_DIAMETER = 30;
	
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGHT = 60;
}
