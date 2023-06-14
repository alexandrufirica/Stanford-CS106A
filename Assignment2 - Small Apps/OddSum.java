import acm.program.*;

public class OddSum extends ConsoleProgram{
	
	public void run() {
	println ("This program calculate sum of the odd's numbers.");
	int N = readInt ("Enter how much odd number want to sum: ");
	int num2 = 1;
	int total = 0;
	while (N > 0){
		if ( num2 % 2 !=0){
			total = total +num2;
			N --;
		}
		num2 ++;
	}
	println ("Sum is : " + total);
	}

}
