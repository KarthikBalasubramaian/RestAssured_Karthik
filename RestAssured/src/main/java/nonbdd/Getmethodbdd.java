package nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Getmethodbdd {
	@Test
	public void getuserlist() {
		
		RestAssured.given().baseUri("https://reqres.in/")
		.when()
		.get("api/users?page=2")
		.prettyPrint();
	}

}
