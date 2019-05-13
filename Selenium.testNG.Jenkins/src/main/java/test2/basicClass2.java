package test2;

import org.testng.annotations.Test;

public class basicClass2 {
	
	@Test(dependsOnMethods="method2")
	public void method1()
	{
		System.out.println("God is great Savior of families in baseclass2 in package test2");
	}

	
	@Test
	public void method2()
	{
		System.out.println("method2 -God is great Savior of families in baseclass2 in package test2");
	}
}
