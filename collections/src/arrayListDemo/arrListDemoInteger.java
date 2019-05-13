package arrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class arrListDemoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		
		l1.add(3);
		l1.add(10);
		l1.add(5);
		System.out.println(l1);

		System.out.println(l1.size());
		
		l1.add(3, 8);
		
		System.out.println(l1);
		
		l1.set(0, 0);
		System.out.println(l1);

		for(Object o:l1)
		{
			System.out.println(o);
		}
		
		
		
		l2.add(111);
		l2.add(222);
		l2.add(333);
		
		System.out.println(l2);
		l1.addAll(1, l2);
		System.out.println(l1);
		
		boolean contains = l1.contains(123);
		System.out.println(contains);
		
		l1.remove(new Integer(333));
		System.out.println(l1);

		l1.remove(new Integer(666));
		System.out.println(l1);
		
		

	}

}
