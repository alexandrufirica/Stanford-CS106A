import acm.program.*;
import java.math.*;

public class Quadratic extends ConsoleProgram {
	
	public void run(){
		println ("Enter coefficients for the quadratic equation:");
		int a = readInt ("a: ");
		int b = readInt ("b: ");
		int c = readInt ("c: ");
		double e = equation1(a ,b ,c);
		double f = equation2(a, b, c);
		if (a != 0){
			if (sqrtEq(a,b,c) > 0){
		println ("The first solution is: " + e);
		println ("The second solutions is: " + f);
			}else{
				println ("The square root is negative.");
			}
		} else {
			println ("The numerator is 0, cannot compute, try a to not be 0");
		}
	}

	private double equation1 ( int a, int b, int c){
	
		return (-b + sqrt (a, b, c)) / (2*a) ;
	}
	
	private double equation2 ( int a, int b, int c){
		
		return (-b - sqrt (a, b, c)) / (2*a) ;
	}
	
	private double sqrt ( int a, int b, int c){
		return Math.sqrt(sqrtEq(a, b, c));
		
	}
	
	private double sqrtEq ( int a, int b, int c){
		return ((b*b) - (4*a*c));
	}
}
