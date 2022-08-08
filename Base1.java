//  Java program to show that if static method are redefined by a 
//  derived class, then it is not overriding but hiding.


package Polymorphism;

//Superclass
public class Base1 {

//	Static method in base class which will be hidden in subclass
	
	public static void display()
	{
		System.out.println("Static or class method from Base");
	}
	
//	Not-Static method which will be overriding in derived class
	public void print()
	{
		System.out.println("Non-static or Instance method from Base");
	}
}


//Subclass
class Derived extends Base1
{
//	Static is removed here(Cause Compiler Error)
	public void display()
	{
		System.out.println("Non-static method from Derived");
	}
	
//	Static is added here(Cause compiler Error)
	public static void print()
	{
		System.out.println("Static method from Derived");
	}
	
}





















