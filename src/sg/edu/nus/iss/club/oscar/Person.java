package sg.edu.nus.iss.club.oscar;

public class Person {
	private String surname;
	private String firstname;
	private String secondName;
	
	public Person(String surname, String firstname, String secondName) {
		this.surname = surname;
		this.firstname = firstname;
		this.secondName = secondName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String show(){
		String fullName = this.firstname + " " + this.secondName + " " + this.surname;
		System.out.println(fullName);
		return fullName;
	}
}
