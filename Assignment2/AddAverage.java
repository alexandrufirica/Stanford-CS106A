import acm.program.*;

public class AddAverage extends ConsoleProgram {
	
	public void run(){
		println ("This program show the average score.");
		println ("Enter values, one per line, using " + SENTINEL);
		println ("to signal the end of the list.");
		int total = 0;
		int count = 0;
		while (true) {
			int value = readInt(" ? ");
			if (value == SENTINEL ) break;
			total = total + value ;
			count++;
		}
		double avg = total / count;
		println ("The average score is " + avg + ".");
	}
		
		private static final int SENTINEL = -1;
}
