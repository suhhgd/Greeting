package sg.edu.nus.iss.club.oscar;

import java.util.ArrayList;

public class Club {
	public static final int ARRAY_SIZE_INCREMENT = 5;
	private int numMember;
	private int count;
	private ArrayList<Member> members;

	public Club() {
		numMember = 1;
		count = 1;
		members = new ArrayList<Member>();
	}

	public void addMember(String surname, String firstname, String secondName) {
		Member m = new Member(surname, firstname, secondName, numMember);
		members.add(m);
		numMember++;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Member> getMembers() {
		return (ArrayList<Member>) members.clone();
	}

	public void showMemeber() {
		for (Member m : members) {
			if (m != null)
				m.show();
		}
	}

	public Member getMember(int memberNum) {
		for (Member m : members) {
			if (m.getMemberNumber() == memberNum) {
				return m;
			}
		}
		return null;
	}

	public Member removeMember(int memberNum) {
		Member m = getMember(memberNum);
		members.remove(m);
		return m;
	}
}
