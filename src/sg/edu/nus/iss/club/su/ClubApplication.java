package sg.edu.nus.iss.club.su;

import sg.edu.nus.iss.club.oscar.Club;

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
		Facility f2= new Facility("Studio","The place where he does recording");
		Facility f3= new Facility("Concert Hall","The place where I can see him.");
		f1.show();
		f2.show();
		f3.show();
		System.out.println("********Members**************");
		Member m1=new Member("Kwon", "Ji", "Yong",0000);
		Member m2=new Member("G", "-", "Dragon",8888);
		m1.show();
		m2.show();
		System.out.println("********Club**************");
		Club c = new Club();
		System.out.println("******** Add 4 members**************");
	    c.addMember("Su", "H", "H");		
	    c.addMember("Su2", "H", "H");	
	    c.addMember("S3", "H", "H");	
	    c.addMember("Su4", "H", "H");	
	    c.showMemeber();
		System.out.println("******** Remove 3rd Members**************");
		c.removeMember(3);
		c.showMemeber();
		
	
		
		
		
		
	}

}
