import acm.program.*;

public class AverageOf3Integres extends ConsoleProgram {
	
	public void run(){
	
		println ("This program calculates the average of 4 integers numbers.");
		int n1 = readInt("Enter n1 : ");
		int n2 = readInt("Enter n2 : ");
		int n3 = readInt("Enter n3 : ");
		int n4 = readInt("Enter n4 : ");
		double average = (n1 + n2 + n3 + n4) / 4.0 ;
		println ("Average = " + average );
	}
}
