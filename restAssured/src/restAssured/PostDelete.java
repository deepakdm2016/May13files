package restAssured;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import files.payLoad;
import files.resources;
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

public class PostDelete {

	public static Properties prop;

	@BeforeTest
	public void getData() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(
				new File("C:\\Users\\Deepak\\Selenium\\restAssured\\src\\files\\environment.properties")));
	}

	@Test
	public void addAndDelete() {
		RestAssured.baseURI = prop.getProperty("host");

		Response res = given().queryParam("key", prop.getProperty("key")).

				body(payLoad.placePostData()).

				when().

				post(resources.placePostData()).then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
				.and().body("status", equalTo("OK")).extract().response();

		System.out.println(res);

		String response = res.asString();
		System.out.println(response);

		JsonPath js = new JsonPath(response);
		System.out.println(js);

		String placeid = js.get("place_id");
		System.out.println(placeid);

		given().queryParam("key", prop.getProperty("key")).body("{\"place_id\":\"" + placeid + "\" }").
		when()
				.post("/maps/api/place/delete/json").
		then().assertThat().statusCode(200).and()
				.contentType(ContentType.JSON).and().body("status", equalTo("OK"));

		Response res2 = given().queryParam("key", "qaclick123").
				body("{\"place_id\":\"" + placeid + "\" }").
		when()
				.post("/maps/api/place/delete/json").
		then().assertThat().contentType(ContentType.JSON).and().extract().response();

		String output = res2.asString();
		System.out.println(output);
		
		JsonPath js1 = new JsonPath(output);
		System.out.println(js1);

	}

}
