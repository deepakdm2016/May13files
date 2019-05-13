
public class number {
	
	public static void main(String v[])
	{
		int a[]={1,2,3,5,6,7,8,9,10};
		
		System.out.println(a.length);
		int max=a[a.length-1];
		System.out.println(max);
		
		int ResultSum=(max*(max+1))/2;
		
		int trialsum=0;
		for (int i=0;i<a.length;i++)
		{
			
			trialsum=trialsum+a[i];
			
		}
		
		System.out.println(ResultSum-trialsum);
		
		for(int i=0;i<=max;i++)
		{
			if (i+1 != a[i])
			{
				System.out.println("missing number is "+(i+1));
				break;
			}
		}
	}

}
