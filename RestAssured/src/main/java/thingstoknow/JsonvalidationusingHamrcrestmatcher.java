package thingstoknow;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonvalidationusingHamrcrestmatcher {
	@Test
	public void Hamcrestmatchedvalidation() throws IOException {
		
		File Inputsjson = new File("./src/test/resources/Input.json");
		
		String jsontostring = FileUtils.readFileToString(Inputsjson, "UTF-8");
		
		File Jsonschem = new File("./src/test/resources/Schema.json");
		
		MatcherAssert.assertThat(jsontostring, JsonSchemaValidator.matchesJsonSchema(Jsonschem));
				
	}

}
