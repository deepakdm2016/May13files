import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int a=Integer.parseInt(str);
		int factorial=1;
		for (int i=a;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
		System.out.println(fact(5));
	}
	
	
	static int fact(int n)
	{
		int result=1;
		if(n==0 || n==1)
			return 1;
		
		else
			result=fact(n-1)*n;
		
		return result;
	}

}
