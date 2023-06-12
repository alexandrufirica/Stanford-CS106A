import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
import java.util.*;
import java.awt.*;

public class RandomCircles extends GraphicsProgram {
	
	public void run(){
		for ( int i = 0; i <NCIRCLES; i++){
			createCircle();
		}
	}
	
	private void createCircle(){
		radius = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		double dx = rgen.nextDouble(0, getWidth() - 2* radius);
		double dy = rgen.nextDouble(0, getHeight() - 2 * radius);
		GOval oval = new GOval (2 * radius, 2 * radius);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval, dx ,dy);
		
	}

	public int radius ;
	
	private static final int NCIRCLES = 10;
	private static final int MIN_RADIUS = 5;
	private static final int MAX_RADIUS = 50;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
