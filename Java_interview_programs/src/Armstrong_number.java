//program to tell how amstron number is verified
//program to tell how amstron number is verified
//program to tell how amstron number is verified
//program to tell how amstron number is verified
//program to tell how amstron number is verified
public class Armstrong_number {
	
	public static void main(String v[])
	{
		int a=153;
		int x=a;
		double sum=0;
		int count_of_times=a;
		
		int count=1;
		while(count_of_times>10)
		{
			count_of_times=count_of_times/10;
		

			
			count++;

		}
		
		
		while(a>10)
		{
			int b=a%10;
			a=a/10;
			
			sum=sum+(Math.pow(b,count));

		}

		sum=sum+(Math.pow(a,count));

		System.out.println(sum);

		if (sum==x)
		{
			System.out.println("it's armstrong");
		}

		else
			System.out.println("it's not armstrong");
			
	}

}
