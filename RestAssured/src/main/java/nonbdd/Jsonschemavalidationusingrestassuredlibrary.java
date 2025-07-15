package nonbdd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Jsonschemavalidationusingrestassuredlibrary {
	@Test
	public void Schemavalidation1() throws FileNotFoundException {
		
		File input = new File("./src/test/resources/Input.json");
//		File inputschema = new File("./src/test/resources/Schema.json");
//		InputStream IS = new FileInputStream("./src/test/resources/Schema.json");
		FileReader Inputs = new FileReader("./src/test/resources/Schema.json");
		
		
		
		RestAssured
		.given().baseUri("https://reqres.in/").header("x-api-key", "reqres-free-v1").header("Content-Type","application/json")
		.body(input)
		.when()
		.post("api/users")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(Inputs))
		.log()
		.all();
	
	}
	


}
