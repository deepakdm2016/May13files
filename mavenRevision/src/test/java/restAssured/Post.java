package restAssured;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Post {
	
	public static Properties prop;
	
	
	@BeforeTest
	public void getData() throws FileNotFoundException, IOException
	{
		 prop=new Properties();
		prop.load(new FileInputStream(new File("C:\\Users\\Deepak\\Selenium\\restAssured\\src\\files\\environment.properties")));
	}
	

	@Test
	public void testData() {
		RestAssured.baseURI = prop.getProperty("host");
		given().queryParam("key", "qaclick123").

				body("{" +

						"\"location\": {" +

						"\"lat\": -33.8669710," +

						"\"lng\": 151.1958750" +

						"}," +

						"\"accuracy\": 50," +

						"\"name\": \"Google Shoes!\"," +

						"\"phone_number\": \"(02) 9374 4000\"," +

						"\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\"," +

						"\"types\": [\"shoe_store\"]," +

						"\"website\": \"http://www.google.com.au/\"," +

						"\"language\": \"en-AU\"" +

						"}")
				.

				when().

				post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200);

	}

}
