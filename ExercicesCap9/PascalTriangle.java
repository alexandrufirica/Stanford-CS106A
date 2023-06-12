import acm.program.*;
import acm.graphics.*;

public class PascalTriangle extends GraphicsProgram{
	
	public void run(){
		int x = combination(2,2);
		GLabel label = new GLabel (""+x);
		add(label, getWidth() /2 + 20, 30);
		circle();
	}

	private int combination(int n, int k){
		return factorial(n) / (factorial(k) * factorial(n-k));
	}
	
	private int factorial(int n){
		int result = 1;
		for ( int i = 1; i <= n; i++){
		result *= i;	
		}
		return result;
	}
	
	private void circle(){
		GOval oval = new GOval(40, 40);
		add(oval, getWidth() /2, 20);
	}
}
