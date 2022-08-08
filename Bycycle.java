//Java program to illustrate the concept of inheritance

package Inheritance;

//base class
public class Bycycle {

//	the bicycle class has two fields
	public int gear;
	public int speed;

//	the Bicycle class has one constructor
	public Bycycle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}

//	the Bicycle class has three methods
	public void applyBreak(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

//	toString() method to print info of Bicycle
	public String toString() {
		return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
	}
}

//driver class
class MountainBike extends Bycycle {
	
//	the MountainBike subclass adds one more field
	public int seatHeight;
	
//	the MountainBike subclass has one constructor
	public MountainBike(int gear, int speed, int seatHeight)
	{
//		invoking base-class(Bicycle) constructor
		super(gear,speed);
		seatHeight = seatHeight;
	}
	
//	the MountainBike subclass adds one more method
	public void setHeight(int newValue)
	{
		seatHeight = newValue;
	}
	
//	overriding toString() method of Bicycle to print more info
	@Override public String toString()
	{
		return (super.toString() + "\nseat height is " + seatHeight);
	}	
}

























