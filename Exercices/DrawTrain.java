import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawTrain extends GraphicsProgram{
	
	public void run(){
		double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
		double x = (getWidth() - trainWidth) / 2;
		double y = getHeight();
		double dx = CAR_WIDTH + CONNECTOR;
		drawEngine(x, y);
		drawBoxcar(x + dx, y, Color.GREEN);
		drawCaboose(x+ 2 * dx, y);
	}
	
	private void drawCarFrame (double x, double y , Color color){
		double x0 = x + CONNECTOR;
		double y0 = y - CAR_BASELINE;
		double top = y0 - CAR_HEIGHT;
		add(new GLine(x, y0 , x + CAR_WIDTH + 2 * CONNECTOR, y0));
		drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
		drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
		GRect r = new GRect ( x0, top , CAR_WIDTH, CAR_HEIGHT);
		r.setFilled(true);
		r.setFillColor(color);
		add(r);
	}
	
	private void drawWheel (double x, double y){
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval ( x - r, y - r, 2 * r, 2 * r);
		wheel.setFilled(true);
		wheel.setColor(Color.GRAY);
		add(wheel);
	}
	
	private void drawBoxcar (double x, double y, Color color){
		drawCarFrame (x, y, color);
		double xRight = x + CONNECTOR + CAR_WIDTH /2;
		double xLeft = xRight - DOOR_WIDTH;
		double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect (xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect (xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
	}
	
	private void drawEngine (double x, double y){
		drawCarFrame(x, y, Color.BLACK);
		drawSmokestack(x, y);
		drawCab(x, y);
		drawCowcatcher(x, y);
	}
	
	private void drawSmokestack ( double x, double y){
		GRect smokestack = new GRect ( x + CONNECTOR + SMOKESTACK_INSET, y- CAR_BASELINE - CAR_HEIGHT - SMOKESTACK_HEIGHT, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
		smokestack.setFilled(true);
		smokestack.setColor(Color.BLACK);
		add(smokestack);
	}
	
	private void drawCab (double x, double y){
		GRect cab = new GRect ( x + CONNECTOR + CAB_WIDTH, y - CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT, CAB_WIDTH, CAB_HEIGHT);
		cab.setFilled(true);
		cab.setColor(Color.BLACK);
		add(cab);
	}
	
	private void drawCowcatcher(double x, double y){
		GLine line = new GLine ( x , y - CAR_BASELINE, x + CONNECTOR, y - CAR_BASELINE - CAR_HEIGHT / 2);
		GLine line2 = new GLine ( x + CONNECTOR / 2, y - CAR_BASELINE, x + CONNECTOR, y - CAR_BASELINE - CAR_HEIGHT / 2);
		add(line);
		add(line2);
	}
	
	private void drawCaboose (double x, double y){
		drawCarFrame (x, y, Color.RED);
		drawCupola (x, y);
	}
	
	private void drawCupola (double x ,double y){
		GRect cupola = new GRect ( x + CONNECTOR + CAR_WIDTH / 4, y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT, CUPOLA_WIDTH, CUPOLA_HEIGHT);
		cupola.setFilled(true);
		cupola.setColor(Color.RED);
		add(cupola);
	}
	
	/*Dimensions of the frame of the train car */
	private static final double CAR_WIDTH = 150;
	private static final double CAR_HEIGHT = 72;
	
	/*Dimensions from the bottom of the train to the track below it */
	private static final double CAR_BASELINE = 20;
		
	/*Dimensions of the connector, which overlaps between succesive cars */
	private static final double CONNECTOR = 12;
		
	/*Dimensions of the wheels on each car */
	private static final double WHEEL_RADIUS = 16;
	
	/*Dimensions from the edge of the frame to the center of the wheel */
	private static final double WHEEL_INSET = 32;
		
	/*Dimensions of the cab on the engine */
	private static final double CAB_WIDTH = 70;
	private static final double CAB_HEIGHT = 16;
	
	/*Dimensions of the smokestack and its distance from the front*/
	private static final double SMOKESTACK_WIDTH = 16;
	private static final double SMOKESTACK_HEIGHT = 16;
	private static final double SMOKESTACK_INSET = 16;
	
	/*Dimensions of the door pannels on the boxcar */
	private static final double DOOR_WIDTH = 36;
	private static final double DOOR_HEIGHT = 64;
	
	/*Dimensions of the cupola on the caboose */
	private static final double CUPOLA_WIDTH = 70;
	private static final double CUPOLA_HEIGHT = 16;
}
