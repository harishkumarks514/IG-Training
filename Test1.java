// We can't overload two methods in java if they differ only 
//by static keyword


package Polymorphism;

public class Test1 {
	public static void foo()
	{
		System.out.println("Test.foo() called");
	}
	public void foo() // compiler error: cannot redefine foo()
	{
		System.out.println("Test.foo(int) called");
	}

	public static void main(String[] args) {
		Test.foo();
	}
}
