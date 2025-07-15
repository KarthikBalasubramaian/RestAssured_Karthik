package jsonmatchusingjsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

public class Inlinepredicate {
	
	File jsonefile = new File("src/test/resources/bookstore.json");
	
	@Test
	public void inlinepredicate() throws IOException {
		
	List<Object> price	= JsonPath.read(jsonefile, "$.store.book[?(@.price<10 || @.category==\"fiction\")]");
	
	for(Object price1: price) {
		
		System.out.println(price1);
	}
		
		
	}

}
