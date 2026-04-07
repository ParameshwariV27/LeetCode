package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadThree implements Callable<Integer>
{
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 20-10;
	}
	
}
public class ExecutorServicePractice {
	public static void main(String args[]) throws Exception
	{
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		Future<Integer> c = service.submit(new ThreadThree());
		
		Integer res = c.get();
		
		System.out.println(res);
		
		service.shutdown();
	}
}
