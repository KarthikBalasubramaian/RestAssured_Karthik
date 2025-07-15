package non.BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Deletemethodnonbdd {
	@Test
	public void Deleteauser() {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification requestSpecification = RestAssured.given().header("x-api-key", "reqres-free-v1");
		
		Response response = requestSpecification.request(Method.DELETE, "api/users/2");
		
		System.out.println(response.statusCode());
		System.out.println(response.asPrettyString());
	}

}
