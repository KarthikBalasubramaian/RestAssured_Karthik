package nonbdd;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class Putmethodbdd {
	
	@Test
	
	public void updateauser() {
		
		given().baseUri("https://reqres.in/").header("x-api-key", "reqres-free-v1").header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"sam\",\r\n"
				+ "    \"job\": \"alagappa collage\"\r\n"
				+ "}")
		.when()
		.put("api/users/2")
		.prettyPrint();
		
		
	}

}
