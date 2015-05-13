package sg.edu.nus.iss.club.oscar;

public class ClubApplication {
	public static void main(String args[]){
		Person p1 = new Person("Castro Araya", "Oscar", "Andres");
		Person p2 = new Person("Castro Araya", "Aylin", "Patricia");
		
		Facility f1 = new Facility("The Pool");
		Facility f2 = new Facility("The Gym");
		Facility f3 = new Facility("BBQ Pit 1", "Near the pool");
		Facility f4 = new Facility("BBQ Pit 2", "Near the Gym");
		
		System.out.println("Welcome to the club");
		
		p1.show();
		p2.show();
		
		f1.show();
		f2.show();
		f3.show();
		f4.show();
	}
}
