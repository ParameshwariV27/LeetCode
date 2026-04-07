package Threads;


class ThreadOne extends Thread
{
	public void run()
	{
		System.out.println("Run method");
	}
}
public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadOne o = new ThreadOne();
		o.start();
	}
}
