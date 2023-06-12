import acm.program.*;
import java.math.*;

public class RiseToPower extends ConsoleProgram {

	public void run(){
		int n = 2;
		for ( int k = 0; k <=10; k++){
			int res = raiseIntToPower (n, k);
			println (res);
			}
		
	}
	
	private int raiseIntToPower (int n, int k){
		int result = (int) Math.pow( n, k);
		return result;
		
	}
}
