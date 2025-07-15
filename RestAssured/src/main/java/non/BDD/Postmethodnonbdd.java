package non.BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postmethodnonbdd {
	@Test
	public void Postuser() {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification requestspecification = RestAssured.given().header("x-api-key", "reqres-free-v1").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}}");
		
	Response response =	requestspecification.request(Method.POST, "api/users");
	
	System.out.println(response.asPrettyString());
		
		
	}

}
