import acm.program.*;

public class ReverseDigit extends ConsoleProgram {
	
	public void run (){
		println ("This program reverse the digits");
		int n = readInt ("Enter a positive integer: ");
		int n2 = 0;
		int n3 = 0;
		while (n > 0){
			n2 *= 10;
			n3 = n % 10;
			n2 = n2 + n3;
			n = n / 10;
		}
		println ("The reversed number is: " + n2);
	}

}
