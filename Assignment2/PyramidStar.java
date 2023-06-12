
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class PyramidStar extends  GraphicsProgram {
	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public static void main(String[] args) {
	    int rows = 14, k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int space = 1; space <= rows - i; ++space) {
	    	  System.out.print("  ");
	  		
	      }

	      while (k != 2 * i - 1) {
	    	  System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	  }
	
	private void addbrick (double cx, double cy){
		double x = cx;
		double y = cy;
		GRect rect1 = new GRect ( cx, cy, BRICK_WIDTH, BRICK_HEIGHT );
		add(rect1);
	}
}

