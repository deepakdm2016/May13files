import java.util.Scanner;

public class prime_or_not {

	public static void main(String v[])
	{
		System.out.println("Please enter the number to check if it is prime or not");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		Boolean isPrime=true;
		in.close();
		for (int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				System.out.println("It is not a prime number");
				break;
			}
		}
		
		if(isPrime==true)
		{
			System.out.println("It is  a prime number");

		}
		
	}
}
