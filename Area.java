package Encapsulation;

public class Area {
	int length;
	int breadth;

//	constructor to calculate area
	public void getArea(int length , int breadth)
	{
		int area= length * breadth;
		System.out.println("Area: " + area);
		
	}
}

	class Main
	{
		public static void main(String[] args) {
			Area rectangle = new Area();
			rectangle.getArea(2,16);
		}
	}