package leetcode;

 class Employee {
	String name;
	double salary;
	
	void work()
	{
		System.out.println("Employee Class");
	}

}
class Developer extends Employee
{
	void work()
	{
		System.out.println("Developer Class");
	}
}
class Tester extends Employee
{
	void work()
	{
		System.out.println("Tester Class");
	}
}

public class Inheritance
{
	public static void main(String args[])
	{
		Employee c = new Developer();
		c.work();
		
		Employee d = new Tester();
		d.work();
	}
}