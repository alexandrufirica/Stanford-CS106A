

	/*
	 * File: CentimetersToFeetAndInches.java
	 * -------------------------------------
	 * This program converts centimeters to an integral number of feet
	 * and any remaining inches.
	 */

	import acm.program.*;

	public class FeetAndInchesToCentimeters extends ConsoleProgram {

		public void run() {
			println("This program converts feet and inches to centimeters.");
			double ft = readDouble("Enter value in of feet: ");
			double inches = readDouble("Enter value of inches: ");
			double cm = ((ft * INCH_PER_FOOT) + inches) * CENTIMETERS_PER_INCH;
			println(ft + "ft " + inches + "in = " + cm + "cm.");
		}

	/* Private constants */
		private static final double CENTIMETERS_PER_INCH = 2.54;
		private static final double INCH_PER_FOOT = 12;

	

}
