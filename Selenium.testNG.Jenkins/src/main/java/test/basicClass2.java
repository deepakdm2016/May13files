package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class basicClass2 {
	
	@Test(groups={"regression"})
	public void method1()
	{
		System.out.println("God is great Savior of families in baseclass2");
	}

	
	@Test(dataProvider="method3", groups={"regression", "smoke"})
	public void method2(int x, int y, int z)
	{
		System.out.println("method 2 - God is great Savior of families in baseclass2");
		
		System.out.println("Nikhi"+x);
		System.out.println("Nikhi"+y);
		System.out.println("Nikhi"+z);

		
	}

	@DataProvider
	public Object[][] method3()
	{
		
		Object[][] abc=new Object[2][3];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				abc[i][j]=(i+1)*(j+1);
			}
		}
		
		return abc;
	}
	
	
	
}
