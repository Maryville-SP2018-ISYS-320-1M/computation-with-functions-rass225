/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 What were the errors you found?
 double tempc should not be even used. if it is, it will only keep printing 0.0
 to return a accurate value, a conversion variable should be created to calculate celcius.
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		double conversion = fahrenheitToCelcius(tempf);
			System.out.println("Body temp in C is: " + conversion);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double fahrenheitToCelcius(double tempf) {
	      return(tempf - 32) * 5 / 9;
    }
}
