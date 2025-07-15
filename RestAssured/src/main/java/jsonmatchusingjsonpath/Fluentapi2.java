package jsonmatchusingjsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;


public class Fluentapi2 {
	File bookstore = new File("src/test/resources/bookstore.json");
	
	public void fl2() throws IOException {
		
		Filter price = Filter
		.filter(Criteria
				.where("price")
				.lt(20));
		
		List<Object> filter = JsonPath.parse(bookstore).read("$.store.book[?]", price);
		
		for(Object fil : filter) {
			System.out.println(fil);
		}
		
		
	
		
	}
	public static void main(String[] args) throws IOException {
		
		Fluentapi2 new1 = new Fluentapi2();
		
	    new1.fl2();
		
	}

}
