package multithreading;

public class ConcurrentThreads implements Runnable {
	static int count=0;
	
	public void run()
	{
		while(true)
		{
			if(count<100){
				count++;
				System.out.println(count);
			}else{
				break;
			}
		}
	}

}
