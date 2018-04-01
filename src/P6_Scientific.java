/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P6_Scientific {

	public static void main(String[] args) {
		// REMINDER: Any print statements should only be in the main method
		System.out.println(computeScientificValue( 6.5, 3));
	}
	public static double computeScientificValue( double number, double powerNumber ) {
		return number * Math.pow(10, powerNumber);
	}

}
