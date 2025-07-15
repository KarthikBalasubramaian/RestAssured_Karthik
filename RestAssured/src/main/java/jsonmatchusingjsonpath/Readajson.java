package jsonmatchusingjsonpath;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath; 

@Test(enabled = true)
public class Readajson {
	public void readjson() throws IOException {

		InputStream  jsonfile = new FileInputStream("src/test/resources/bookstore.json");

	 Object parsedjson =	Configuration.defaultConfiguration().jsonProvider().parse(jsonfile.readAllBytes()); 

		List<Object> store =  JsonPath.read(parsedjson, "$..price");

		for(Object nm: store) {
			System.out.println(nm);
		}

	}






}
