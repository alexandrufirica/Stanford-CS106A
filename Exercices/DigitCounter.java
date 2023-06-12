import acm.program.*;	

public class DigitCounter extends ConsoleProgram {
	
	public void run(){
		println ("This program return the number of digits in the interger you enter.");
		int n = readInt ("Enter an integer: ");
		countDigits (n);
		println ("Number have " + countDigits(n) + " numbers.");
	}
	
	private int countDigits ( int n){
		int dcount = 0;
		while (n > 0) {
			dcount += 1 + 0 * (n % 10);
			n /= 10;
		}
		return dcount;
	}
}
