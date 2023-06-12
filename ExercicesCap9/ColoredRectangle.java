import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import acm.util.*;

public class ColoredRectangle extends GraphicsProgram{
	
	public void run () {
		GRect rect = new GRect (RECT_WIDTH, RECT_HEIGHT);
		rect.setFilled (true);
		rect.setColor(Color.BLACK);
		double x = (getWidth() - rect.getWidth()) / 2 ; 
		double y = (getHeight() - rect.getHeight()) /2 ;
		add(rect, x ,y);
		while (true){
			
			rect.setColor(rgen.nextColor());
			pause(DELAY);
		}
		
	}
	
	private static final int RECT_WIDTH = 100;
	private static final int RECT_HEIGHT = 100;
	private static final int DELAY = 1000;
	
	private GRect rect;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
