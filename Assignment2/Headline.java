
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Headline extends GraphicsProgram {
	
	public void run(){
		GLabel headline = new GLabel (" DEWEY DEFEATS TRUMAN ", 800, 200);
		Font myfont = new Font ("Serif", Font.BOLD, 200);
		headline.setFont(myfont);
		add(headline);
		double dx = 5 * getWidth() / N_STEPS;
		double dy = getHeight() / N_STEPS;
		for ( int i = 0; i < N_STEPS; i++){
			headline.move( -dx , dy);
			pause(PAUSE_TIME);	
		}
	}

	public static final int N_STEPS = 750;
	private static final int PAUSE_TIME = 10;
}
