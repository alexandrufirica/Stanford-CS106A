import acm.program.*;
import acm.graphics.*;

public class HelloWorld extends GraphicsProgram {
	
	public void run (){
		GLabel hi = new GLabel ("I love Java", 100 ,75);
		GLabel sign = new GLabel ("Alexandru Firica", 650, 450);
		add (hi);
		add (sign);
	}
	

}
