import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawStopLight extends GraphicsProgram {
	
	public void run(){
		double cx = getWidth() /2 ;
		double cy = getHeight() /2;
		double fx = cx - FRAME_WIDTH / 2;
		double fy = cy - FRAME_HEIGHT / 2;
		double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;
		add(createFilledRect(fx, fy, FRAME_WIDTH, FRAME_HEIGHT, Color.GRAY));
		add(createFilledCircle(cx ,cy - dy, LAMP_RADIUS, Color.RED));
		add(createFilledCircle(cx ,cy, LAMP_RADIUS, Color.YELLOW));
		add(createFilledCircle(cx ,cy + dy, LAMP_RADIUS, Color.GREEN));
	}

	private GOval createFilledCircle ( double x, double y, double r, Color color){
		GOval circle = new GOval ( x - r, y - r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
	
	private GRect createFilledRect (double x, double y, double w, double h, Color color){
		GRect rect = new GRect ( x , y , w, h);
		rect.setColor(color);
		rect.setFilled(true);
		return rect;
	}
	
	private final static double FRAME_WIDTH = 100;
	private final static double FRAME_HEIGHT = 200;
	private final static double LAMP_RADIUS = 20;
}
/*	GRect frame = new GRect ( fx, fy, FRAME_WIDTH, FRAME_HEIGHT);
	frame.setFilled(true);
	frame.setColor(Color.GRAY);
	add(frame);
*/