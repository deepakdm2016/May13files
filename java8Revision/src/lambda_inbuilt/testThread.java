package lambda_inbuilt;

public class testThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r=() -> {for(int i=0;i<10;i++) System.out.println("Child thread");};
		Thread a=new Thread(r);
		a.start();
		
		for(int i=0;i<10;i++) System.out.println("Parent thread");
		
	}

}
