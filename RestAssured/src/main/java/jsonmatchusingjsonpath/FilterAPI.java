package jsonmatchusingjsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterAPI {
	
	File jsonefile = new File("src/test/resources/bookstore.json");
	
	public  void filterapiexample() throws IOException {
		
		Filter priceless = Filter.filter(
				Criteria
				.where("price")
				.lt(20));
		
		List<Object>  filterapiexaple =  JsonPath.parse(jsonefile)
		.read("$.store.book[?]", priceless);
		
		for(Object printfilter : filterapiexaple) {
			
			System.out.println(printfilter);
		}
		
		
	}
	
	public void secondfilterapi() throws IOException {
		
		Filter secex = Filter.filter(
				Criteria
				.where("price")
				.lt(10)
				.and("category")
				.is("fiction")
				);
		
	List<Map<Object, Object>> secc =	JsonPath.parse(jsonefile).read("$.store.book[?]", secex);
	
	
		
		System.out.println(secc.get(0).get("category"));
	
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		FilterAPI example = new FilterAPI();
		
		example.secondfilterapi();
	}

}
