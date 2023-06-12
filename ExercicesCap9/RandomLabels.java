import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import acm.util.*;

public class RandomLabels extends GraphicsProgram{

	public void run() {
		GLabel Red = new GLabel ( "RED", rgen.nextInt(APPLICATION_WIDTH), rgen.nextInt(APPLICATION_HEIGHT));
		GLabel Orange = new GLabel ( "ORANGE", rgen.nextInt(APPLICATION_WIDTH), rgen.nextInt(APPLICATION_HEIGHT));
		GLabel Yellow = new GLabel ( "YELLOW", rgen.nextInt(APPLICATION_WIDTH), rgen.nextInt(APPLICATION_HEIGHT));
		GLabel Green = new GLabel ( "GREEN", rgen.nextInt(APPLICATION_WIDTH), rgen.nextInt(APPLICATION_HEIGHT));
		GLabel Cyan = new GLabel ( "CYAN", rgen.nextInt(APPLICATION_WIDTH), rgen.nextInt(APPLICATION_HEIGHT));
		GLabel Blue = new GLabel ( "BLUE", rgen.nextInt(APPLICATION_WIDTH), rgen.nextInt(APPLICATION_HEIGHT));
		GLabel Magenta = new GLabel ( "MAGENTA", rgen.nextInt(APPLICATION_WIDTH), rgen.nextInt(APPLICATION_HEIGHT));
		
		Red.setColor(rgen.nextColor());
		Orange.setColor(rgen.nextColor());
		Yellow.setColor(rgen.nextColor());
		Green.setColor(rgen.nextColor());
		Cyan.setColor(rgen.nextColor());
		Blue.setColor(rgen.nextColor());
		Magenta.setColor(rgen.nextColor());
		
		add(Red);
		add(Orange);
		add(Yellow);
		add(Green);
		add(Cyan);
		add(Blue);
		add(Magenta);
	}
	
	
	
	private static final int APPLICATION_WIDTH = 640;
	private static final int APPLICATION_HEIGHT = 500;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
