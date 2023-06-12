import acm.program.*;
import acm.graphics.*;

public class DisplayForm extends GraphicsProgram {
	
	public void run() {
		
		GDiamond diamond = new GDiamond (100);
		GTrapezoid trapez = new GTrapezoid (100,100);
		GTShape shape = new GTShape (100);
		GTriangle tri = new GTriangle (50);
		
		add (diamond, 100 ,100);
		add (trapez, 200, 200);
		add (shape , 300,300);
		add (tri , 400,400);
	}

}
