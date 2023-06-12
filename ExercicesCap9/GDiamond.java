import acm.graphics.*;

public class GDiamond extends GPolygon{
	
	public GDiamond (double width){
		
		double dx = width /2 ;
		double dy = width ;
		addVertex (-dx, 0);
		addVertex (0, dy);
		addVertex (dx, 0);
		addVertex (0,-dy);
		
	}

}
