package sg.edu.nus.iss.club.su;

public class Member extends Person {

	private int membershipid;
	public Member(String surname, String firstname, String secondname,int memberid) {
		super(surname, firstname, secondname);
		this.membershipid=memberid;
		// TODO Auto-generated constructor stub
		
	}
	public String toString()
	{
		String memberdetail=super.toString()+" "+getMembershipid();
		return memberdetail;
	}

	public int getMembershipid() {
		return membershipid;
	}
	public void setMembershipid(int membershipid) {
		this.membershipid = membershipid;
	}

}
