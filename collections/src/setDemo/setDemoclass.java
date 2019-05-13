package setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * Set is a collection interface where duplicates are not allowed
 * implemented by hash set, extended by sorted set extended by navigable set
 * implemented by sorted set
 */

public class setDemoclass {
	
	public static void main(String v[])
	{
		Random obj=new Random();
		Set<Object> l1=new HashSet<Object> ();
		List<Object> l2=new ArrayList<Object> ();
		
		System.out.println(((obj)).nextInt(1000));
		System.out.println((obj).nextBoolean());
		System.out.println(obj.nextFloat());
		System.out.println(obj.nextGaussian());
		
		for(int i=0;i<5;i++)
		{
			l2.add(-1);
		}
		System.out.println(l2);

		for(int i=0;i<500;i++)
		{                    
			l1.add(i);
		}
	
		System.out.println(l1);
		l1.addAll(l2);
		System.out.println(l1);

	}

}
