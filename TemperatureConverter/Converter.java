import java.util.*;
/** cst-105 project 2.2
 * Temperature converter, Converts fahrenheit to celsius and celsius to fahrenheit.
 * @author Omira
 *
 */
public class Converter {
	
	public static void main(String[]args) {
		
		//Declare Variables
		
		double fahrenheit, celsius, convertedFahrenheit, convertedCelsius;
		
		//Create Scanner object
		
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter a degree in fahrenheit
		
		System.out.print("Enter a degree in fahrenheit: ");
		fahrenheit = input.nextDouble();
		System.out.print("Enter a degree in celsius: ");
		celsius = input.nextDouble();
		
		//Calculate the conversions
		convertedCelsius = (fahrenheit - 32) * 5 / 9;
		convertedFahrenheit = celsius * 9 / 5 + 32;
				
		//Print Conversion
		System.out.println(fahrenheit + " F " + "is equivalent to " + convertedCelsius + " C.");
		System.out.println(celsius + " C " + "is equivalent to " + convertedFahrenheit +" F.");
	}
	

}
