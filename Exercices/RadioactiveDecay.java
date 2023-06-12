import acm.program.*;
import acm.util.*;

public class RadioactiveDecay extends ConsoleProgram{
	
	public void run(){
		println ("There are " + NO_ATOMS + " atoms initially.");
		while (true) {
			simYear();
			println ("There are " + curentAtoms + " atoms at the end of the year " + year + ".");
			if (curentAtoms == 0) break;
		}
	}
	
	private void simYear(){
		int atomCount = curentAtoms;
		for ( int i = 0; i < atomCount; i++){
			if ( isDecay()) curentAtoms--;
		}
		year++;
	}
	
	private boolean isDecay(){
		return rgen.nextBoolean(PROBABILITY_DECAY);
	}

	private int year;
	private int curentAtoms = NO_ATOMS;
	
	private static final int NO_ATOMS = 10000;
	private static final double PROBABILITY_DECAY = 0.5;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
