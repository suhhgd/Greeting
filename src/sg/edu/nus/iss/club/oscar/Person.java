package sg.edu.nus.iss.club.oscar;

public class Person {
	private String surName;
	private String firstName;
	private String secondName;
	
	public Person(String surname, String firstname, String secondName) {
		this.surName = surname;
		this.firstName = firstname;
		this.secondName = secondName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public void show(){
		System.out.println(this.toString());
	}
	
	public String toString(){
		String fullName = this.firstName + " " + this.secondName + " " + this.surName;
		return fullName;
	}
}
