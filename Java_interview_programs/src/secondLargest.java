import java.util.ArrayList;

public class secondLargest {
	
	public static void main(String v[])
	{
	
	int ab[]={1,6,10,8,7,4,3,8};
	
	ArrayList<Integer> test=new ArrayList<Integer>();
	for(int i=0;i<ab.length;i++)
	{
		for(int j=i+1;j<ab.length;j++)
		{
			if(ab[i]>ab[j])
			{
				int temp=ab[i];
				ab[i]=ab[j];
				ab[j]=temp;
			}
		}
	}
	
	for(int i=0;i<ab.length;i++)
	{
		System.out.println(ab[i]);
	}
	
	System.out.println("Second largest number is "+ab[ab.length-2]);
	}
}
