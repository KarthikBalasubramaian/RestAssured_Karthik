package thingstoknow;

import java.util.List;

public class PojotoJson {

	private String firstname;
	private String lastname;
	private String email;
	private List<String> Skills;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List getSkills() {
		return Skills;
	}
	public void setSkills(List skills) {
		Skills = skills;
	}
	
}
