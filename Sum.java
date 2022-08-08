//program to demonstrate Polymorphism.
//the class have 3 mothods with same name, yet the 
//program will compile and run successfully.

package Polymorphism;

public class Sum {
//overloaded sum().
//	this sum takes two int parameters

	public int sum(int x, int y) {
		return (x + y);
	}

//	overloaded sum().
//	This sum takes three int parameters

	public int sum(int x, int y, int z) {
		return (x + y + z);
	}

//	Overload sum().
//	This sum takes two double parameters
	public double sum(double x, double y, double z) {
		return (x + y + z);
	}

//	Overload sum().
//	This sum takes two double parameters
	public double sum(double x, double y) {
		return (x + y);
	}

//Driver code
	public static void main(String args[]) {
		Sum s = new Sum();

		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.5, 20.50));
	}

}
