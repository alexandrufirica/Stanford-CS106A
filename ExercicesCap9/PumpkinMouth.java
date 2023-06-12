import acm.graphics.*;	

public class PumpkinMouth extends GPolygon{
	
	public PumpkinMouth (double width) {
		
		double dx = width;
		
		addVertex (0, 0);
		addVertex(dx, -dx);
		addVertex(2 * dx, 0);
		addVertex(3 * dx, -dx);
		addVertex(4 * dx, 0);
		addVertex(5 * dx, -dx);
		addVertex(6 * dx, 0);
		addVertex(7 * dx, -dx);
		addVertex(8 * dx, 0);
		addVertex(9 * dx, -dx);
		addVertex(10 * dx, 0);
		addVertex(8 * dx, 2 * dx);
		addVertex(7 * dx, dx);
		addVertex(6 * dx, 2 * dx);
		addVertex(5 * dx, dx);
		addVertex(4 * dx, 2 * dx);
		addVertex(3 * dx, dx);
		addVertex(2 * dx, 2 * dx);
		addVertex(dx, dx);
	}

}
