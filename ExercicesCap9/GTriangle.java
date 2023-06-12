import acm.graphics.*;

public class GTriangle extends GPolygon {
	
	public GTriangle (double width){
		
		double dx = width / 2;
		
		addVertex ( 0, -dx);
		addVertex ( dx, dx);
		addVertex ( -dx, dx);
		
	}
	
	

}
