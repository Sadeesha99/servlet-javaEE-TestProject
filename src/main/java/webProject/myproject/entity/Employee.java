package webProject.myproject.entity;

public class Employee {
	
	private int id;
	
	private String firstName;
	
	private String email;
	
	private String password;
	
	private int mobile;
	
	private String nic;
	
	private String gender;
	
	
//Constructor with id
	public Employee(int id, String firstName, String email, String password, int mobile, String nic, String gender) {
		this.id = id;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.nic = nic;
		this.gender = gender;
	}
	
//Constructor without id
	public Employee(String firstName, String email, String password, int mobile, String nic, String gender) {
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.nic = nic;
		this.gender = gender;
	}
	
	
//Getter and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
