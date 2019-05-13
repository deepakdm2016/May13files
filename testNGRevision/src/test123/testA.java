package test123;

import java.util.Random;

import org.testng.annotations.Test;

public class testA {
	
	@Test(groups={"Smoke"})
	public void getNumber()
	{
		System.out.println("TestNG revision");
		
		Random r=new Random();
		System.out.println(r.nextInt(50));
	}
	
	
	@Test(groups={"Regression"})
	public void getNumberDouble()
	{
		System.out.println("TestNG revision for double");
		
		Random r=new Random();
		System.out.println(r.nextDouble());
	}

}
