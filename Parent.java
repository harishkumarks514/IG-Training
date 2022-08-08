//	JAva program for Method Overriding

// 	class1
// 	Helper class

package Polymorphism;

public class Parent {

	void print() {
//		print statement
		System.out.println("PARENT CLASS");
	}
}

// 	class2
// 	Helper class

class subclass1 extends Parent {
//	Method
	void print() {
		System.out.println("subclass1");
	}
}

//class 3
// Helper class
class subclass2 extends Parent {
//		Method
	void print()
	{
//		print statement
		System.out.println("subclass2");
	}
}

//class 4
// main class

class GFGF{
//	main driver method
	public static void main(String[] args) {
//		creating object of class 1
		Parent a;
		
//		Now we will  be calling print methods
//		inside main() method
		
		a = new subclass1();
		a.print();
		
		a=new subclass2();
		a.print();
	}
}