package lambdaAnonymous;

public class testAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=10;i>0;i--)
				{System.out.println("Hi, Hello, Howla, Howla");}
			}});
		
		t.start();
		
		for(int i=10;i>0;i--)
		{System.out.println("Parent - Hi, Hello, Howla, Howla");}
	}

}
