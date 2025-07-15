package non.BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putmethodnonbdd {
	@Test
	public void updateuser() {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification requestspecification = RestAssured.given().header("x-api-key", "reqres-free-v1").header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}");
		
		Response response = requestspecification.request(Method.PUT, "api/users/2");
		
		System.out.println(response.prettyPrint());
	}

}
