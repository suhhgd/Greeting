package sg.edu.nus.iss.club.oscar;

public class Member extends Person {
	int memberNumber;

	public Member(String surname, String firstname, String secondName, int memberNumber) {
		super(surname, firstname, secondName);
		this.memberNumber = memberNumber;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	
	public String toString(){
		String fullName = super.toString() + " " + memberNumber;
		return fullName;
	}
}
