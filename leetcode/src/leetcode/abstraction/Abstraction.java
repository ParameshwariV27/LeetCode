package leetcode.abstraction;



abstract class Vehicle
{
	abstract void start();
	
	void fuel()
	{
		System.out.println("Vehicle needs fuel");
	}
}
class Car extends Vehicle
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Start car");
	}
	
}
public class Abstraction {
public static void main(String args[])
{
	Vehicle v = new Car();
	v.start();
}
}
