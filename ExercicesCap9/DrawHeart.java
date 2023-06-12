import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawHeart extends GraphicsProgram{
	
	public void run(){
		
		heart();
		
	}
	
	private void heart(){
		
		HeartArc arc1 = new HeartArc (WIDTH);
		arc1.setFilled(true);
		arc1.setColor(Color.RED);
		add(arc1, getWidth() /2, getHeight()/2);

		
		
	}


	private static final int WIDTH = 100;
}
