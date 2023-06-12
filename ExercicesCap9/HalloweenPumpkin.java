import acm.program.*;
import acm.graphics.*;
import java.awt.*;


public class HalloweenPumpkin extends GraphicsProgram{
	
	public void run(){
		pumpkinHead (HEAD_RADIUS) ;
		eye (EYE_WIDTH);
		nose(NOSE_WIDTH);
		stem (STEM_WIDTH);
		mouth(MOUTH_WIDTH);
	}
	
	private GOval pumpkinHead (double radius){
		
		double r = radius;
		head = new GOval ( 2*r, 2*r);
		
		head.setFillColor(Color.ORANGE);
		head.setFilled(true);
		
		add (head,getWidth() / 2 - HEAD_RADIUS, getHeight() / 2 - HEAD_RADIUS);
		return (head);
		
	}
	
	private void eye (double width){
		
		double dx = width;
		
		GTriangle eye1 = new GTriangle (dx);
		GTriangle eye2 = new GTriangle (dx);
		eye1.setColor(Color.BLACK);
		eye1.setFilled(true);
		eye1.rotate(180);
		eye2.setColor(Color.BLACK);
		eye2.setFilled(true);
		eye2.rotate(180);
		add (eye1, getWidth() / 2 - (head.getWidth() / 6 ) , getHeight() / 2 - (head.getHeight() / 6));
		add (eye2, getWidth() / 2 + (head.getWidth() / 6 ) , getHeight() / 2 - (head.getHeight() / 6));
		
	}
	
	private void nose (double width){
		
		double dx = width;
		
		GTriangle nose = new GTriangle (dx);
		nose.setFilled(true);
		nose.setColor(Color.BLACK);
		add (nose, getWidth() / 2, getHeight() / 2 );
		
	}
	
	private void stem (double width){
		
		double dx = width;
		
		GRect stem = new GRect ( dx, dx);
		stem.setFilled(true);
		stem.setColor(Color.BLACK);
		add (stem, getWidth() / 2 - STEM_WIDTH / 2, getHeight() / 2 - HEAD_RADIUS - STEM_WIDTH);
	}
	
	private void mouth (double width){
		
		PumpkinMouth mouth = new PumpkinMouth (10);
		mouth.setFilled(true);
		mouth.setColor(Color.BLACK);
		add(mouth, getWidth() / 2 - 5 * MOUTH_WIDTH, getHeight() / 2 + (head.getHeight() / 4));
	}
	

	private GOval head;
	
	private static final int MOUTH_WIDTH = 10;
	private static final int STEM_WIDTH = 10;
	private static final int NOSE_WIDTH = 20;
	private static final int HEAD_RADIUS = 100 ;
	private static final int EYE_WIDTH = 20;
}