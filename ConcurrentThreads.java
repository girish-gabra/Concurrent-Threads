package multithreading;

public class ConcurrentThreads implements Runnable {
	static int count=0;
	
	public void run()
	{
		while(true)
		{
			/* synchronized block to ensure only one thread at a time executes the following statements*/	
			synchronized(this){
				if(count<100){
					count++;
					System.out.println(count);
				}else{
					break;
				}
			}	
		}
	}

}
