package multithreading;

public class Main {

	public static void main(String[] args)
	{
		
		try 
		{
			ConcurrentThreads cr = new ConcurrentThreads();
			Thread a = new Thread(cr,"A");
			Thread b = new Thread(cr,"B");
			Thread c = new Thread(cr,"C");
			
			a.start();
			b.start();
			c.start();
			
			a.join();
			b.join();
			c.join();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
