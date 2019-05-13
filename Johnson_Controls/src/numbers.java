import java.util.ArrayList;

public class numbers {
	
	public static void main(String v[])
	{
		int a[]={1,2, 3, 2, 2, 5, 5, 8, 3, 1};
		ArrayList<Integer> ab=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			
			if (!ab.contains(a[i]))
			{
				int k=0;
				ab.add(a[i]);
				k++;
			
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
				}
			}
			
			System.out.println(a[i]+"  "+ k);
		}
		}
	}

}
