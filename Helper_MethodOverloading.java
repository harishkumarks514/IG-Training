//program for method Overloading
//By using Different Types of Arguments
//compile time polymorphism.
//class 1
//Helper class
package Polymorphism;

public class Helper_MethodOverloading {

//	Method with 2 integer parameters

	static int Multiply(int a, int b) {
//		Return product of two integer numbers
		return a * b;
	}

//	Method 2
//	With same name but with 2 double parameters

	static double Multiply(double a, double b) {
//		return product of double numbers
		return a * b;
	}
}

//class 2
// Main class

class GFG {

//	Main driver method
	public static void main(String[] args) {

//		Calling method by passing input as in arguments
		System.out.println(Helper_MethodOverloading.Multiply(2, 4));
		System.out.println(Helper_MethodOverloading.Multiply(5.5, 6.3));
	}
}
