package libraryAPI;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.payLoad;
import files.resources;
import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class dynamicJson {

	public static Properties prop;

	@BeforeTest
	public void getData() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(
				new File("C:\\Users\\Deepak\\Selenium\\restAssured\\src\\files\\environment.properties")));
	}

	@Test(dataProvider="booksData")
	public void dynamicJson(String isbn, String isle) {
		RestAssured.baseURI = "http://216.10.245.166";
		System.out.println("step1");
		Response res = given().log().body().header("Content-Type", "application/json").

				body(addBook(isbn,isle))
				.

				when().

				post("/Library/Addbook.php").then().log().body().assertThat().statusCode(200).and().contentType(ContentType.JSON)
				.and().extract().response();

		System.out.println(res);

		String response = res.asString();
		System.out.println(response);
		
		JsonPath js=reusableMethods.rawToJson(res);
					String id=js.get("ID");
		
		System.out.println(id);
		
	}
	
	public String addBook(String aisle, String isbn)
	{
		
		String payload= "{\r\n\t\"name\":\"Learn 123 Deepak Appium\",\r\n\t\"isbn\":"+"\""+isbn+"\""+",\r\n\t\"aisle\":"+"\""+aisle+"\""+",\r\n\t\"author\":\"John Deepak Foe\"\r\n}";
		return payload;
		
		
	}
	
	@DataProvider(name="booksData")
	public String[][] getBooks()
	{
		String[][] test=new String[10][2];
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<2;j++)
			{
				test[i][j]="Deepak "+i+" "+j;
				System.out.println(test[i][j]);
			}
			
		}
		return test;
		
		
	}
	

}
