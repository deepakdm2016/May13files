package LinkedListDemo;

import java.util.ArrayList;
import java.util.List;

public class arrListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> l1=new ArrayList<Object>();
		
		l1.add(3);
		l1.add("Deepak");
		l1.add(5.5);
		
		for(Object o:l1)
		{
			System.out.println(o);
		}

	}

}
