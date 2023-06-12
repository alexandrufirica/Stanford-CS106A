import acm.program.*;
import java.math.*;
public class PerfectNumber extends ConsoleProgram{
	 
//	function checks if the given number is perfect or not  
	static boolean isPerfectNumber(int num)  
	{  
//	variable stores the sum of divisors  
		int sum = 1;  
//	determines all the divisors of the given number and adds them  
		for (int i = 2; i * i <= num; i++) {  
			if (num % i==0) {  
				if(i * i != num)  
				sum = sum + i + num / i;  
				else  
//	calculates the sum of factors  
				sum = sum + i; 
				}  //end of if  
				}  //end of for  
		if (sum == num && num != 1)  
//	returns true if both conditions (above) returns true  
		return true;  
//	returns false if any condition becomes false  
		return false;  
	} //end of function 
	
//	driver code  
	public static void main (String args[]) {
		
		System.out.println("Perfect Numbers between 2 to 10000 are: ");  
//	loop executes until the condition n<10000 becomes false  
		for (int n = 2; n < 10000; n++)  
//	calling function  
		if (isPerfectNumber(n))  
//	prints all perfect number between given range  
			System.out.println(n +" is a perfect number");  
		}  
		} 
	






/*
	public void run (){
		int n = readInt ( " Enter a number to check if it is perfect : ");
		if (isPerfect (n)) println ("False");
		else println ("True");
		
		
		
	}
	
	private void perfect (){
	
		
	}
	
	private boolean isPerfect ( int n ){
		for ( int i = 1; i <= n - 1; i++){
			int r = n % i;
			if ( r == 0 ) {
				if ( i + i == n) return false;
			}
		}
		return true;
	}
	*/
	
	/*private int isPerfect ( int n) {
		for ( int i = 1; i <= n - 1; i++){
			int r = n % i;
			if ( r == 0 ){
			 println ( i);
			}
		}
		return n;
	}
	*/
	

	/* int n = readInt ( " Enter a number to check if it is perfect : ");
			int n1 = (isPerfect ( n / 2 ));
			int sum = n1 + n1;
			println (sum);

*/