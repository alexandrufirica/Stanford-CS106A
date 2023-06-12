import acm.program.*;

public class Prime extends ConsoleProgram {
	
	public void run (){
		int n = readInt (" Enter a number to ckeck if is prime or not : ");
		if (prime (n)) println ("True");
		else println ("False");
	}
	
	private boolean prime ( int n) {
		for ( int i = 2; i <= n / 2; i++){
			int r = n % i;
				if ( r == 0) return false;
		}				
		return true;
	}

}
 /* BRUTE FORCE method:
  * 
  * private boolean prime( int n){
  * 	if ( n == 2)return true;
  * 	if (n % 2 == 0) retrun false;
  * 
  * 	for (int i = 3; i < ( n - 1); i += 2) {
  * 		if ( n % i == 0 )return false;
  * 	}	
  * 	return true;
  * 	}
  */

