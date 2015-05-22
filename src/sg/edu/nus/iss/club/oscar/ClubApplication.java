package sg.edu.nus.iss.club.oscar;

public class ClubApplication {
	public static void main(String args[]) {
		Club c = new Club();

		c.addMember("Castro Araya", "Oscar", "Andres");
		c.addMember("Calculator", "Table", "Desmond");
		c.addMember("Castro Araya", "Aylin", "Patricia");
		c.addMember("Chavarria Araya", "Juan", "Carlos");
		c.addMember("Chavarria Araya", "Yamileth", "Eugenia");
		c.addMember("Chavarria Araya", "Luis", "Diego");
		c.addMember("Chavarria Araya", "Alejandro", "Jose");
		
		Facility f1 = new Facility("The Pool");
		Facility f2 = new Facility("The Gym");
		Facility f3 = new Facility("BBQ Pit 1", "Near the pool");
		Facility f4 = new Facility("BBQ Pit 2", "Near the Gym");

		System.out.println("Welcome to the club");

		c.showMemeber();
		c.removeMember(2);
		c.showMemeber();
		
		f1.show();
		f2.show();
		f3.show();
		f4.show();
	}
}
