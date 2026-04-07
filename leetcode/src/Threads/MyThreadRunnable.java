package Threads;


class ThreadTwo implements Runnable
{
	public void run()
	{
		System.out.println("Runnable Interface");
	}
}
public class MyThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread two = new Thread(new ThreadTwo());
		two.start();
	}

}
