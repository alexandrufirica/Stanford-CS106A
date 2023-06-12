import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class PumpkinPie extends GraphicsProgram{
	
	public void run(){
		getPie();
	}
	
	private void getPie(){
		double start = 0;
		for(double i = start; i <= 360; i += angle){
			
		GArc arc = new GArc (SLICE_WIDTH, SLICE_WIDTH, start, angle);
		arc.setFillColor(Color.ORANGE);
		arc.setFilled(true);
		add(arc, getWidth() / 2 - SLICE_WIDTH / 2, getHeight() / 2 - SLICE_WIDTH /2 );
		start +=angle;
		}
	}

	private double angle = 360 / N_PIECES;
	
	private static final int SLICE_WIDTH = 200;
	private static final int N_PIECES = 8;
}
