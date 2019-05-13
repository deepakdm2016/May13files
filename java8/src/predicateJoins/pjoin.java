package predicateJoins;

import java.util.function.Predicate;

public class pjoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int []x={2, 10, 13, 30, 41, 52, 66, 70};
			Predicate<Integer> p1=i->(i>10);
			Predicate<Integer> p2=i->(i%2==0);

			System.out.println("Greater than 10");
			method1(p1,x);
			
			System.out.println("Even");
			method1(p2,x);
			
			System.out.println("Not greater than");
			method1(p1.negate(),x);
			
			System.out.println(" greater than 10 and even");
			method1(p1.and(p2),x);
			
			System.out.println(" greater than 10 or even");
			method1(p1.or(p2),x);
	
	}
	
	static void method1(Predicate<Integer> p,  int[] x)
	{
		for(int eachValue: x)
		{
			if(p.test(eachValue))
			{
				System.out.println(eachValue);
			}
		}
		
	}

	
	}

