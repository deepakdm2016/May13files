package test123.copy;

import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testA2 {
	
	@BeforeSuite
	public void getNumbertest123A2()
	{
		System.out.println("TestNG revision in copy package in A2");
		
		Random r=new Random();
		System.out.println(r.nextInt(50));
	}
	
	
	@AfterTest
	public void getNumberDoubleTest123A2()
	{
		System.out.println("TestNG revision for double in copy package in A2");
		
		Random r=new Random();
		System.out.println(r.nextDouble());
	}

	@BeforeTest

	public void getNumberDoubleBeforeTesttest123()
	{
		System.out.println("TestNG revision for double in A2 BeforeTest test123");
		
		Random r=new Random();
		System.out.println(r.nextDouble());
	}



}
