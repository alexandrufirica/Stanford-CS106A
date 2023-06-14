import acm.program.ConsoleProgram;

public class DigitalRoot extends ConsoleProgram {
	
	public void run (){
		println ("This program calculate digital root of an integer.");
		int n = readInt ("Enter a positive integer: ");
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		while (n > 0){
			n2 += n % 10;
			n /= 10;	
		}
		while (n2 > 0){
			n3 += n2 % 10;
			n2 /= 10;
		}
		
		while (n3 > 0) {
			n4 += n3 % 10;
			n3 /= 10;
		}
		println ("The digit root is: " + n4);
		
	}

}
