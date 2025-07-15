package nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Deletemethodbdd {
	
	@Test
  public void Deleteauser() {
	  
	  RestAssured
	  .given().baseUri("https://reqres.in/")
	  .when()
	  .delete("api/users/2")
	  .statusLine();
  }

}
