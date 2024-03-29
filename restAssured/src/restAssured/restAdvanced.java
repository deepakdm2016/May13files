package restAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import files.reusableMethods;

public class restAdvanced {

	public static void main(String[] args) {
		RestAssured.baseURI="https://maps.googleapis.com";
		Response response = given().log().body().
				param("location","-33.8670522,151.1957362").
				param("radius","1500").
				param("key","AIzaSyDCCqBMQfSt3svIvYJXEu9ukNIjTwRwrKo").
		when().
				get("maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		//body("results[0].geometry.location.lat",equalTo("-33.86882")).
		extract().response();
		
		JsonPath js = reusableMethods.rawToJson(response);
		int count=js.get("results.size()");
		System.out.println(response.asString());
		System.out.println(count);
		//---------------------------------------------------------------
		
		for(int i=0;i<count;i++)
		{
			String  name = js.get("results["+i+"].name");
			System.out.println(name);
		}
		
	}

}
