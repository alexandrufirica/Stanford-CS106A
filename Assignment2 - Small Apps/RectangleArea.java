import acm.program.*;

public class RectangleArea extends ConsoleProgram {
	
	public void run (){
		println("This program calculates Aria of a rectangle. Please enter the base and height");
		double b = readDouble("Enter b: ");
		double h = readDouble("Enter h: ");
		double a = (b + h) / 2;
		println("A =" + a);
	}
}
