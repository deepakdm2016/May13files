package com.jdbc.connection;

import com.jdbc.connection.Student;
public class Test {

	public static void main(String v[])
	{
		Student student=new Student(123,"12","345","@.c","@.c","+12012338550");
		
		if (student.validate())
		{
			System.out.println("Bean validates OK");
		}
		
		System.out.println("Hello");
		System.out.println(student.getMessage());

	}
}
