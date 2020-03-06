package Lester.Alisha.Chapter6.JavaProject;

public class SimpleMath {
	
	public static double divide(double numerator, double denominator) {
		
		if (denominator == 0) {
			throw new ArithmeticException ("divide by Zero");
		}
		double div = numerator/denominator;
		return div;
	}
	
	public static double multiply(double number1, double number2) {
		return number1*number2;
	}
	
	
}
