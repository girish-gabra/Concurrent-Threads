package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ConcurrentThreads implements Runnable {
	static int count=0;			// global counter
	final CyclicBarrier gate = new CyclicBarrier(3);	// 3 as we have 3 threads
	
	public void run()
	{
		try 
		{
			gate.await();
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
						/* display the collection of elements by this thread*/
						display(collection);
						break;
					}
				}	
			}
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
	 }
	
	public void display(List<Integer> collection)
	{
		System.out.println(Thread.currentThread().getName()+" "+collection);
	}

}
