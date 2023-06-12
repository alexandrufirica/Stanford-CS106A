import acm.program.*;
import acm.util.*;

public class MonteCarloIntegration extends ConsoleProgram {
	
	public void run () {
		while ( numDartsThrow < NO_OF_THROWING) {
			dartsThrow();
			numDartsThrow++;
		}
		aproxPi =  numInCircle * 4;
		println ("Total dart throw simulations: " + NO_OF_THROWING);
		println ("Total darts in circle: " + numInCircle);
		println ("Approximation of Pi: " + aproxPi);
	}
	
	private void dartsThrow (){
		double x = rgen.nextDouble(-1, 1);
		double y = rgen.nextDouble(-1, 1);
		if ( isInCircle(x,y)){
			numInCircle++;
		}
	}
	
	private boolean isInCircle(double x, double y){
		return ( ((x * x) + (y * y)) < 1.0 );
		
	}
		
	

	private int numDartsThrow = 0;
	private int numInCircle = 0;
	private double aproxPi;
	public static final int NO_OF_THROWING = 10000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
/* 	println ("Total dart throw simulations: " + NO_OF_THROWING);
println ("Total darts in circle: " + numInCircle);
println ("Approximation of Pi: " + aproxPi);

*/