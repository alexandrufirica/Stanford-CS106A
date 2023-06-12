import acm.program.*;

public class Interest extends ConsoleProgram {
	
	public void run() {
		println ("Interest calculation program.");
		double balance = readDouble ("Enter starting balance: ");
		double annualIR = readDouble ("Enter annual interest rate: ");
		balance = balance + (balance * (annualIR / 100));
		println ("Balance after one year = " + balance);
		balance = balance + (balance * (annualIR / 100));
		println ("Balance after two years = " + balance);
	}

}
