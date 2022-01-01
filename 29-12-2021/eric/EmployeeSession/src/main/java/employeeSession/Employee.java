package employeeSession;

public class Employee {
/*
 * 
		<label for="username">Username</label>	
		<input type="text" name="username"/><br/>
		<label for="age">Age</label>
		<input type="number" name="age"><br/>
		<label for="city">City</label>
		<input type="text" name="city"><br/>
		<label for="gender">Gender</label>
		<input type="text" name="gender"><br/>
		<label for="email">Email</label>
		<input type="email" name="email"><br/>
		<input type="submit" value="registere"/>
 */
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
