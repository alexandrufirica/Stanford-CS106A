import acm.program.*;

public class FahrenheitToCelsius extends ConsoleProgram {
	
	public void run(){
	println ("This program transform Fahrenheit degrees in Celsius degrees.");
	double f = readDouble ("Enter Fahrenheit degrees: ");
	double c = FAHRENHEIT_TO_CELSIUS * ( f - 32 );
	println ("C degreees = " + c + ".");
	println ( FAHRENHEIT_TO_CELSIUS);
	}
 private static final double FAHRENHEIT_TO_CELSIUS = 5 / 9.0 ;
}
