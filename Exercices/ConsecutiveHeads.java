import acm.program.*;
import acm.util.*;

public class ConsecutiveHeads extends ConsoleProgram {
	
	public void run(){
		while (true) {
			numHeads = 0;
			numFlips = 0;
			while ( numHeads < CONSEC_HEADS){
				flipCoin();
				numFlips++;
			}
			println ( "It took " + numFlips+ " to get " + numHeads + " heads in a row.");
			readLine ( "Press Enter to try again.");
		}
	}
	
	
	private void flipCoin(){
		if ( isHeads()){
			println("Heads");
			numHeads++;
		}else{
			println ("Tails");
			numHeads = 0 ;
		}
		
	}
	
	private boolean isHeads(){
	
		return rgen.nextBoolean();
	}
	
	private int numHeads;
	private int numFlips;
	private static final int CONSEC_HEADS = 2  ;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
