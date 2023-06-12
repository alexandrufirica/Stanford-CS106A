/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
	println("Enter values to compute Pythagorean theorems.");
	calc();
	}
	
	private void calc(){
		int a = readInt ("a:");
		int b = readInt ("b:");
		int c = (a * a) + (b * b);
		double t = Math.sqrt(c);
		println(" c = " + t);
	}
}
