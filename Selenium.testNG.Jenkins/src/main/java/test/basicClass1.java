package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.*;
import org.testng.annotations.*;

public class basicClass1 {
	private static Logger log=LogManager.getLogger(basicClass1.class.getClass().getName());
	
	@Parameters({"Deepak"})
	@Test(groups={"regression", "smoke"}, timeOut=2)
	public void method1(String url) throws FileNotFoundException, IOException
	{
		System.out.println("God is great Savior of families");
		System.out.println(url);
		
		
		log.error("Error1");
	}
	@Test(groups={"smoke"})
	public void method2() throws FileNotFoundException, IOException
	{
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\Users\\Deepak\\Selenium\\Selenium.testNG.Jenkins\\src\\main\\java\\test\\testng.properties"));
		
		System.out.println("TestNg is for "+ prop.getProperty("testng"));
		System.out.println("Selenium is for "+ prop.getProperty("selenium"));
		System.out.println("bc1- method 2- God is great Savior of families");
		log.debug("Error2");

	}


}
