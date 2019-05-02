package LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj[]=new Object[1000000];
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new Object();
		}
		
		
		LinkedList<Object> l1=new LinkedList<Object>();
		
		long t1=System.currentTimeMillis();
		for(Object o:obj)
		{
			l1.add(o);
		}
		long t2=System.currentTimeMillis();
		System.out.println((t2-t1 )+ " ms is the time taken");
		
	/* Array list*/
		
	List<Object> l2=new ArrayList<Object>();
		
		long t3=System.currentTimeMillis();
		for(Object o:obj)
		{
			l2.add(o);
		}
		long t4=System.currentTimeMillis();
		System.out.println((t4-t3 )+ " ms is the time taken");
	
		
	}

}
