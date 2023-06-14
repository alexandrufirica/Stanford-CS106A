import acm.program.*;	

public class KilogramosToPoundsAndOunces extends ConsoleProgram {
	
	public void run(){
		
		println ("This program tranform Kilograms in Pounds and Ounces");
		double kilogram = readDouble ("Enter kilograms : ");
		double pounds = kilogram * KILOGRAM_TO_POUNDS;
		double ounces = pounds * POUND_TO_OUNCES ;
		println ( kilogram + " kilograms = " + pounds + " pounds.");
		println ( kilogram + " kilograms = " + ounces + " ounces.");
	}
	
/* Private constatnts */
	private static final double KILOGRAM_TO_POUNDS = 2.2 ;
	private static final double POUND_TO_OUNCES = 16 ;
}
