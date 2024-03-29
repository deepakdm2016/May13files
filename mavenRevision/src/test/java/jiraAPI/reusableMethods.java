package jiraAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class reusableMethods {
	
	
	public static JsonPath rawToJson(Response r)
	{
		String resp=r.asString();
		JsonPath x=new JsonPath(resp);
		return x;

	}
	
	public static String getSessionId()
	{
		
		RestAssured.baseURI="http://localhost:8080";
		Response response = given().header("Content-Type", "application/json").body
		("{\"username\": \"deepakdm2016\",\"password\": \"Vinayaka@2019\"}").log().all().when().post("/rest/auth/1/session").
		then().log().all().statusCode(200).extract().response();	
		String asString = response.asString();

		System.out.println(asString);

		JsonPath js = new JsonPath(response.asString());
		String  sessionId = js.get("session.value");
		System.out.println("Session Id: "+ sessionId);

		System.out.println(js);
		
		return sessionId;

	}
	
	
	
	

}
