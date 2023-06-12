import acm.graphics.*;

public class GTShape extends GPolygon {
	
	public GTShape (double width){
		
		double dx = width;
		double dy = width;
		
		addVertex ( -dx / 2, -dy / 2);
		addVertex ( -dx / 2, -dy / 4);
		addVertex ( -dx / 6, -dy / 4);
		addVertex ( -dx / 6, dy / 2);
		addVertex ( dx / 6 , dy / 2);
		addVertex ( dx / 6, -dy / 4);
		addVertex ( dx / 2, -dy / 4);
		addVertex ( dx / 2, -dy / 2);
		addVertex ( dx / 2, -dy / 2);
	}
	
}