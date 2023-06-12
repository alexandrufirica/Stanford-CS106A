import acm.program.*;

public class FibonacciN extends ConsoleProgram {
	
	public void run(){
		int n = readInt ("Enter what Fibonacci number to be displayed: ");
		int n1 = fibonacci (n);
		println ("This is the " + n + " Fibonacci number " + n1 );
	}
	
	private int fibonacci (int n){
		int i = 0;
		int j = 1;
		for (int a = 0; a <= n-2; a++){
			int k = i + j;
			i = j;
			j = k;
		}
		return i;
	}
	private static final int MAX_TERM_VALUE = 10000 ;
}
