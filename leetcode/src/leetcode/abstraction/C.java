package leetcode.abstraction;

interface A
{
	default void show() {}
}
interface B
{
	default void show() {}
}
class D implements A, B
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		B.super.show();
	}
	
}
public class C {
public static void main(String args[])
{
	
}
}
