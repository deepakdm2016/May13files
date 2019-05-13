package ocjp;

import java.util.ArrayList;
import java.util.List;

public class arrayCheck {

	public static void main(String[] args) {

		//Variable must provide either dimension expressions or an array initializer
		int [] array=new int[10];
		
		System.out.println(array[1]);
		
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at ocjp.arrayCheck.main(arrayCheck.java:10)

		 */
		
		int [][][] array1=new int[7][][]; //1st row should atleast be provided
		
		int [][]b=new int[5][];
		System.out.println(b[3]); //null
		
		List list=new ArrayList();
		System.out.println(list.size());//0
		
		List l1=new ArrayList(2);
		l1.add("A");
		
		System.out.println(l1.size());//1
		
		//top level for all exceptions is throwable
		
		//unchecked exceptions are derived from "Error" and "RuntimeException" class
		
		//string Buffer is thread safe
		
		
	}

}
