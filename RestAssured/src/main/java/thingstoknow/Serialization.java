package thingstoknow;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Serialization {
	@Test
	public void serilization(){
List<String> Skills = new ArrayList<String>();
		
		Skills.add("Selenium-java");
		Skills.add("RestAssured");
		Skills.add("Postman-API");
		
		Map<String, Object> jsonbody = new HashMap<String, Object>();
		
		jsonbody.put("name", "Karthik");
		jsonbody.put("job", "Automation test engineer");
		jsonbody.put("id", "3637");
		jsonbody.put("createdAT", "2025-06-21");
		jsonbody.put("Skills", Skills);
		
		
		System.out.println(jsonbody);
		
		
		
		RestAssured
		.given()
		.baseUri("https://reqres.in/").header("x-api-key", "reqres-free-v1").header("Content-Type","application/json")
		.body(jsonbody)
		.log().all()
		.when()
		.post("api/users")
		.then()
		.log()
		.all();
	}

}
