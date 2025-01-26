package entity;

public class Patient {
//	private int id;
	private String name;
	private int age;
	private String docName;
	private String email;
	private String date;


//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDocName() {
		return docName;
	}


	public void setDocName(String docName) {
		this.docName = docName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Patient(String name, int age, String docName, String email, String date) {
		super();
		this.name = name;
		this.age = age;
		this.docName = docName;
		this.email = email;
		this.date = date;
	}


	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Patient [ name=" + name + ", age=" + age + ", docName=" + docName + ", email=" + email
				+ ", date=" + date + "]";
	}



}
