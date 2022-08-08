// We can overload static methods with the same name but with the different input parameters. 

package Polymorphism;

public class Test {
	public static void foo()
	{
		System.out.println("Test.foo() called");
	}
	
	public static void foo(int a)
	{
		System.out.println("Test.foo(int) called");
	}
	
	public static void main(String[] args) {
		Test.foo();
		Test.foo(100);
	}

}
