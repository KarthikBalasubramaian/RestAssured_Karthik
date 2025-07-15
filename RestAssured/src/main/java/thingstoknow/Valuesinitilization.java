package thingstoknow;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Valuesinitilization {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		
	PojotoJson PJ1 =  new PojotoJson();
	
	PJ1.setFirstname("Karthik");
	PJ1.setLastname("Balasubramanian");
	PJ1.setEmail("Karthikvampirez@gmail.com");
	PJ1.setSkills(Arrays.asList("java","restassured"));
	
	System.out.println(PJ1.getFirstname());
	System.out.println(PJ1.getLastname());
	System.out.println(PJ1.getEmail());
	System.out.println(PJ1.getSkills());
	
	ObjectMapper mapper = new ObjectMapper();
	
	String detailsjson =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(PJ1);
	
	System.out.println(detailsjson);
	
	}

}
