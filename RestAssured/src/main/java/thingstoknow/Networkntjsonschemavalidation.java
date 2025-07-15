package thingstoknow;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class Networkntjsonschemavalidation {
	@Test
	public void NetworkNTJSV() throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonSchemaFactory factory =  JsonSchemaFactory.getInstance(VersionFlag.V4);
		
		File Inputjson = new File("./src/test/resources/Input.json");
		InputStream schema = new FileInputStream("./src/test/resources/Schema.json");
		
		JsonNode jnode =  mapper.readTree(Inputjson);
		
		JsonSchema jschema = factory.getSchema(schema);
		
		Set<ValidationMessage> result = jschema.validate(jnode);
		
		if(result.isEmpty()) {
			System.out.println("No Validation Errors");
		}
		else {
			System.out.println(result);
			
		}
		
		
		
	
		
	
	}
		
	

}
