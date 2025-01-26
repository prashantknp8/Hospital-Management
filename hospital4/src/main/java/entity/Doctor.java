package entity;

public class Doctor {
	private String name;
	private String email;
	private String number;
	private String specialisation;
	private String password;
	
	public Doctor(String name, String email, String number, String specialisation,String password) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.specialisation = specialisation;
		this.password= password;
		
	}
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", email=" + email + ", number=" + number + ", specialisation=" + specialisation
				+ ", password=" + password + "]";
	}

	
}
