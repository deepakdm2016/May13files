package multithreading;

public class threaddemo extends Thread {
	
	public static void main(String v[]) throws InterruptedException
	{
		
		threaddemo a=new threaddemo();
		a.start();
		a.join();
		
		for (int i=0;i<10;i++)
		{
			System.out.println("In Main"+i);
		}
		
		
	}
	
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("in thread"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
