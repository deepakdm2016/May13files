package restAssured;

import org.apache.logging.log4j.LogManager;
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
import org.apache.logging.log4j.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PostDelete {

	private static Logger log=LogManager.getLogger(PostDelete.class.getName());
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

				post(resources.placePostData()).then().log().all().assertThat().statusCode(200).and().contentType(ContentType.JSON)
				.and().body("status", equalTo("OK")).extract().response();

		log.info(res);

		String response = res.asString();
		log.info(response);

		JsonPath js = new JsonPath(response);
		log.info(js);

		String placeid = js.get("place_id");
		log.info(placeid);

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
		log.info(output);
		
		JsonPath js1 = new JsonPath(output);
		log.info(js1);

	}

}
