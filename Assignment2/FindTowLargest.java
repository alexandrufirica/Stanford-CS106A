import acm.program.ConsoleProgram;

public class FindTowLargest extends ConsoleProgram {
	
	private static final int SENTINEL = 0 ;

	public void run(){
		println ("This program display the largest value.");
		println ("Enter values, one per line , using " + SENTINEL + " to signal the end of the list.");
		
		int total = 0;
		int total2 = 0;
		while (true){
			int value = readInt (" ? ");
			if (value == SENTINEL) break;
			if (value > total){
				total = value;
				if (value > total){
					total = value;
				}
			}
			if ( value < total){
				total2 = value;
			}
			if ( value > total2){	
				total2 = value;
			}
		}	
		println ("The largest value is " + total);
		println ("The second largest value is " + total2);
	}
}
