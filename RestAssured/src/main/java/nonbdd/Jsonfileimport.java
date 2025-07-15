package nonbdd;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Jsonfileimport {
	@Test
	public void jsonimport() {
		
		File inputjson = new File("./src/test/resources/Input.json");
		
		RestAssured
		.given().baseUri("https://reqres.in/").header("x-api-key", "reqres-free-v1").header("Content-Type","application/json")
		.body(inputjson)
		.when()
		.post("api/users").prettyPrint();
	}

}
