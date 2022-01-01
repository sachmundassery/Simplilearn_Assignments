package EmpSessJSPActionTag;

public class Employee {
	private String username;
	private int age;
	private String city;
	private String gender;
	private String email;
	
	public Employee() {}

	public String getUsername() {
		return username;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
