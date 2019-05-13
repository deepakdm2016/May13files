package Predicate;

import java.util.function.Predicate;

public class predicateJoins {
	
	public static void main(String v[])
	{
		int x[]={1,2,3,4,5,7,9,0,6};
		
		Predicate<Integer> p1=i->i<5;
		Predicate<Integer> p2=i->i%2==0;
		
		for(int i=0;i<x.length;i++)
		{
			if(p1.test(x[i]) || p2.test(x[i]))
				System.out.println(x[i]);
		}
		
	
	}
	

}
