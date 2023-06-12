import acm.graphics.*;

public class GTrapezoid extends GPolygon{
	
	public GTrapezoid ( double width, double height){
		
		double dx = width / 2;
		double dy = height / 2;
		addVertex ( -dx, dy);
		addVertex ( dx, dy);
		addVertex ( dx / 2, -dy);
		addVertex ( -dx / 2, -dy);
		
	}

}
