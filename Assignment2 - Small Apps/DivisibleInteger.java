import acm.program.*;

public class DivisibleInteger extends ConsoleProgram {

	public void run(){
		println ("This program displays the integers between 1 and 100 that are divisible by 6 or 7 but not both.");
		int n = 0;
		int n2 = 1;
		int n3 = 1;
		while (n < 100) {
			n = n2++;
			if ( n2 % 6 == 0){
				if ( n2 % 7 != 0){
				println ( n2) ;
				}
			}
			if (n2 % 7 == 0){
				if ( n2 % 6 != 0){
				println (n2);
				}
			}
		}
	}
}
