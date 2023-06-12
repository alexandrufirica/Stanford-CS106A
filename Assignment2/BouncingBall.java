import acm.program.*;
import acm.graphics.*;

public class BouncingBall extends GraphicsProgram{
	
	public void run (){
		GOval oval = new GOval ( (getWidth() / 2) - OVAL_DIAMETER, (getHeight() / 2) - OVAL_DIAMETER, OVAL_DIAMETER, OVAL_DIAMETER);
		oval.setFilled(true);
		add(oval);
		while (true){
			double dx = (getWidth()- OVAL_DIAMETER)/ N_STEPS;
			double dy =	(getHeight() - OVAL_DIAMETER)/ N_STEPS;
			for ( int i = 0; i < N_STEPS; i++){
				oval.move(dx , dy);
				pause(PAUSE_TIME);	
			}
			for ( int i = 0; i < N_STEPS; i++){
				oval.move(dx, -dy);
				pause (PAUSE_TIME);
			}
			for ( int i = 0; i < N_STEPS; i++){
				oval.move(-dx, -dy);
				pause (PAUSE_TIME);
			}
			for ( int i = 0; i < N_STEPS; i++){
				oval.move(-dx, dy);
				pause (PAUSE_TIME);
			}
		}
	}

	private static final int OVAL_DIAMETER = 30;
	private static final int PAUSE_TIME = 10;
	private static final int N_STEPS = 250;
}
