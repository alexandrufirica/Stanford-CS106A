import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Target2 extends GraphicsProgram{
	
	public void run(){
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		double or = OUTER_RADIUS;
		double ir = OUTER_RADIUS - INNER_RADIUS;
		for ( int i = 1; i <= N_CIRCLES ; i++){
			if (i % 2 !=0 ){
			createFilledCircle( cx , cy ,  or , Color.RED);
			or = ir - INNER_RADIUS;
			}else{
			createFilledCircle( cx , cy ,  ir , Color.WHITE);
			ir = or - INNER_RADIUS;
			}
		}
		
		
		/*		if (i % 2 !=0 ){
			createFilledCircle( cx , cy , 2 * OUTER_RADIUS, Color.RED);
			createFilledCircle( cx , cy , 2 * OUTER_RADIUS/ 2, Color.WHITE);
			createFilledCircle( cx , cy , 2 * OUTER_RADIUS/ 3, Color.RED);
			createFilledCircle( cx , cy , 2 * OUTER_RADIUS/ 4, Color.WHITE);
			createFilledCircle( cx , cy , 2 * INNER_RADIUS, Color.RED);
			ir = (OUTER_RADIUS / N_CIRCLES) - N_CIRCLES;
		*/
	}
	
	private GOval createFilledCircle (double x, double y, double r, Color color){
		
		GOval circle = new GOval (x - r, y -r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		add(circle);
		return circle;
	}
	
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;

}
 
 
