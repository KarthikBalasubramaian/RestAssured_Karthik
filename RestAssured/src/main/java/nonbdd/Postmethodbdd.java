package nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Postmethodbdd {
	@Test
	public void createauser() {
		
		RestAssured.given().baseUri("https://reqres.in/").header("x-api-key", "reqres-free-v1").header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"karthik\",\r\n"
				+ "    \"job\": \"QA Automation Engineer\"\r\n"
				+ "}")
		.when()
		.post("api/users")
		.prettyPrint();
	}

}
