import acm.program.*;

public class FiboancciSequence15 extends ConsoleProgram {
	
	public void run(){
		println ("This program display the values of Fibonacci Sequence from F0 to F15.");
		int i = 0;
		int j = 1;
		
		for (int a = 0; a <= 15; a++){
		 	println ( i );
			int k = i + j;
			i = j;
			j = k;
		}
		
		
		/*while (i < 15){
			println ( i );
			int k = i + j;
			i = j;
			j = k;
		}
		*/
	}
	private static final int MAX_TERM_VALUE = 10000 ;
}
