/** This program show a Fibonacci Sequence from 0 to 10,000.
 * Ic Contains a while loop.
 * @author firic
 *
 */
import acm.program.*;

public class FibonacciSequence extends ConsoleProgram {
	
private static final int MAX_TERM_VALUE = 10000;
	
	public void run () {
		println ("This program lists the Fibonacci Sequence.");
		int i = 0;
		int j = 1;
		while ( i < MAX_TERM_VALUE ) {
			println(i);
			int k = i + j;
			i = j;
			j = k;
		
		}
	}
}
