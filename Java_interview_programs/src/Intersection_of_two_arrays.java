import java.util.*;
public class Intersection_of_two_arrays {

	public static void main(String v[])
	{
		int a[]={1,2,3,5,7};
		int b[]={1,2,4,5};
		int c[]={2};
		List<Integer> abc=new ArrayList<Integer>();
		
		for(int i=0;i<b.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==b[i] && (!abc.contains(b[i])))
				{
					abc.add(b[i]);
				}
			}
		}
	
		System.out.println(abc);
	List<Integer> def=new ArrayList<Integer>();
		for (int k=0;k<c.length;k++)
		{
			if(abc.contains(c[k]) && (!def.contains(c[k])))
			{
				def.add(c[k]);
			}
		}
		System.out.println(def);

	}
}
