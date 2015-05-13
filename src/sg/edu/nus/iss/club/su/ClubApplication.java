package sg.edu.nus.iss.club.su;

public class ClubApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************Person**************");
		Person p1= new Person("Kwon", "Ji", "Yong");
		Person p2= new Person("G", "-", "Dragon");
		p1.show();
		p2.show();
		System.out.println("********Facility**************");
		Facility f1= new Facility("Meeting Room");
		Facility f2= new Facility("Studio","The place where do recording");
		Facility f3= new Facility("Concert Hall","The place where I can see him.");
		f1.show();
		f2.show();
		
	}

}
