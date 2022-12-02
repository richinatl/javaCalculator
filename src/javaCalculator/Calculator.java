package javaCalculator;



public class Calculator {
	
	// methods to perform needed operations
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int square(int num1) {
		return num1 * num1;
	}
	
	// bonus - make a class to perform trig operations
	// using the Math Java class
	public class MagicCalculator extends Calculator {
		public static double sin(double num1) {
			double b = Math.toRadians(num1);
			return Math.sin(b);
		}
		
		public static double cos(double num1) {
			num1 = Math.toRadians(num1);
			return num1;
			
		}
		
		public static double tan(double num1) {
			num1 = Math.PI / 2.0;
			return num1;
		}
		
		
		// add a square root method
		public static double squareRoot(double num1) {
			num1 = Math.sqrt(num1);
			return num1;
		}
		
		// add a factorial method
		public static int factorial(int num1) {
			if (num1 == 0)
				return 1;
			else
				return (num1 * factorial(num1 - 1));
		}
	}
	
	
	

	public static void main(String[] args) {
		// call each method to test function
		System.out.println(add(2,2));
		System.out.println(subtract(10,5));
		System.out.println(multiply(9,9));
		System.out.println(divide(24,6));
		System.out.println(square(3));
		
		// test the trig methods
		System.out.println(MagicCalculator.sin(45));
		System.out.println(MagicCalculator.cos(45));
		System.out.println(MagicCalculator.tan(45));
		
		// test the square root method
		System.out.println(MagicCalculator.squareRoot(9));
		
		// test the factorial method
		System.out.println(MagicCalculator.factorial(4));

	}

}
