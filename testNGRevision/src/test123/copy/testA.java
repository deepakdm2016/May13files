package test123.copy;

import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testA {

	@Test(groups = { "Smoke", "Regression" }, dependsOnMethods = { "getNumberDoubleTest123" })
	@Parameters({"Deepak","Deepak"})
	public void getNumberTest123(String empid, String empid1) {
		System.out.println("TestNG revision in copy package");

		Random r = new Random();
		System.out.println(r.nextInt(50));
		System.out.println("EmpId of Deepak is "+ empid + empid1);
	}

	@Test(dataProvider="giveData",groups = { "Regression", "Smoke" }, enabled = true)
	
	public void getNumberDoubleTest123(int i1,int i2) {
		System.out.println("TestNG revision for double in copy package");

		Random r = new Random();
		System.out.println(r.nextDouble());
		System.out.println(i1);
		System.out.println(i2);

	}

	@DataProvider
	public Object[][] giveData()
	{
		Object[][] a=new Object[5][2];
		
		for(int i=0;i<=4;i++)
			for(int j=0;j<=1;j++)
			{
				a[i][j]=i+j;
			}
		return a;
		
		
	}
	
}
