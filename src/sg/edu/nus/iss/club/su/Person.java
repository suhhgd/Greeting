package sg.edu.nus.iss.club.su;

public class Person {
	
	private String surname;
	private String firstname;
	private String secondname;
	
	public Person(String surname,String firstname,String secondname)
	{
		this.surname=surname;
		this.firstname=firstname;
		this.secondname=secondname;
		
	}
	public String toString()
	{
		String fullname=getSurname()+" "+getFirstname()+" "+getSecondname();
		return fullname;
	}
	
	public void show()
	{		
		System.out.println(toString());
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
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

}
