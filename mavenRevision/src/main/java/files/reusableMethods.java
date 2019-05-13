package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class reusableMethods {
	
	
	public static XmlPath rawToXml(Response r)
	{
		String resp=r.asString();
		XmlPath x=new XmlPath(resp);
		return x;

	}

	public static JsonPath rawToJson(Response r)
	{
		String resp=r.asString();
		JsonPath x=new JsonPath(resp);
		return x;

	}
}
