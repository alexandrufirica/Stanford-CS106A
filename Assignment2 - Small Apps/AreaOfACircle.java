import acm.program.*;

public class AreaOfACircle extends ConsoleProgram{
	
	public void run(){
	println("This program calculate area of a circle.");
	double r = readDouble("Enter the radius: ");
	double A = PI * (r*r);
	println ("A =" + A + ".");
	}
/* Private Constants */
	private static final double PI = 3.14 ;
}

