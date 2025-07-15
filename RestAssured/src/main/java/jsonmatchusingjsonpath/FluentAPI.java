package jsonmatchusingjsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class FluentAPI {
	
	@Test(enabled = true)
	
	public void fluentapiexample() throws IOException {
		
		File jsonfile = new File("src/test/resources/bookstore.json");
		
	DocumentContext context = JsonPath.parse(jsonfile);
	
	List<Object> Category = context.read("$..category");
	
	for(Object catrgoryp : Category) {
		System.out.println(catrgoryp);
	}
	
	Configuration config = Configuration.defaultConfiguration();
	
	List<Object> category1 = JsonPath.using(config).parse(jsonfile).read("$..title");
	
	for(Object category2 : category1) {
		System.out.println(category2);
	}
	
	
	
	}
}
	
	


