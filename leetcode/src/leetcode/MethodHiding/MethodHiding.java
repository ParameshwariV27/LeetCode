package leetcode.MethodHiding;


class Animal
{
	static void sound()
	{
		System.out.println("Animal sound");
	}
}
class Dog extends Animal
{
	static void sound()
	{
		System.out.println("Dog Sounds");
	}
}
public class MethodHiding {
public static void main(String args[])
{
	Animal s = new Dog();
	s.sound();
}
}
