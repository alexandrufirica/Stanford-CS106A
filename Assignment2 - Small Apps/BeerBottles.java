import acm.program.*;

public class BeerBottles extends ConsoleProgram {
	
	public void run() {
		
		for ( int n = BOTTLE_OF_BEER ; n > 0; n--){
			println ( n + " bottles of beer on wall.");
			println ( n + " bottles of beer.");
			println ( "You take one down, pass it around.");
			println ( n-1 + " bottles of beer on the wall.");
			println (" ");
			
			}
		println ( "You finised the bottles!");
		}
	
	private static final int BOTTLE_OF_BEER = 99 ;
	

}
