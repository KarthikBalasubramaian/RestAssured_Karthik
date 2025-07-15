package non.BDD;





import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class GetmothodnonBDD {
	
	
	public void FirstTest() {
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification requestspecification = RestAssured.given();
		
		Response response = requestspecification.request(io.restassured.http.Method.GET, "api/users?page=2");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.asString());
		
		
	}
}
