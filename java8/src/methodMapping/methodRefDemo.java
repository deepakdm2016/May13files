package methodMapping;

public class methodRefDemo {
	
	
	public static void myMethod()
	{
		for(int i=0;i<=10;i++)
		{
				System.out.println("child thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r= methodRefDemo::myMethod;
		Thread t=new Thread(r);
		t.start();

		for(int i=0;i<=10;i++)
		{
				System.out.println("Main thread");
		}
	
	}

}
