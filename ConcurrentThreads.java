package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ConcurrentThreads implements Runnable {
	static int count=0;
	
	public void run()
	{
		List<Integer> collection=new ArrayList<Integer>();
			while(true)
			{
				/* synchronized block to ensure only one thread at a time executes the following statements*/	
				synchronized(this){
					if(count<100){
						count++;
						collection.add(count);
						System.out.println(count);
					}else{
						display(collection);
						break;
					}
				}	
			}
		
	}
	
	public void display(List<Integer> collection)
	{
		System.out.println(Thread.currentThread().getName()+" "+collection);
	}

}
