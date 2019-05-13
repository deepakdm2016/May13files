package multithreading;

public class threadDemoInterface implements Runnable{
	
	public static void main(String v[]) throws InterruptedException
	{
		threadDemoInterface b=new threadDemoInterface();
		Thread a=new Thread(b);
		Thread c=new Thread(b);
		Thread d=new Thread(b);
		Thread e=new Thread(b);

		a.start();
		c.start();
		d.start();
		e.start();
		a.join();
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
		
		
	}

	
	public synchronized void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("in thread"+i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
