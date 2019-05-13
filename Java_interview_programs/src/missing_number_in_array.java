
public class missing_number_in_array {
	
	public static void main(String v[])
	{
		int a[]={1,2,3,5,6,7,8,9,10};
		
		int max=a[a.length-1];
		
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
