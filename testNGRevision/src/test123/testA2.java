package test123;

import java.util.Random;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testA2 {
	
	@AfterSuite
	public void getNumberA2()
	{
		System.out.println("TestNG revision in A2");
		
		Random r=new Random();
		System.out.println(r.nextInt(50));
	}
	
	
	@AfterTest

	public void getNumberDoubleA2()
	{
		System.out.println("TestNG revision for double in A2");
		
		Random r=new Random();
		System.out.println(r.nextDouble());
	}

	
	@BeforeTest

	public void getNumberDoubleBeforeTest()
	{
		System.out.println("TestNG revision for double in A2 BeforeTest");
		
		Random r=new Random();
		System.out.println(r.nextDouble());
	}

	
}
