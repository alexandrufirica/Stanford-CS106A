import acm.graphics.*;

public class HeartArc extends GPolygon {
	
	public HeartArc (double width) {
		
		
		addArc (width, width  , 315 ,180);
		addArc (width, width , 45, 180);
		recenter();
		addVertex (0, width + width /4);
		
		
		
	}

}
