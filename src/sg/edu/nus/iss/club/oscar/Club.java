package sg.edu.nus.iss.club.oscar;

public class Club {
	public static final int ARRAY_SIZE_INCREMENT = 5;
	private int numMember;
	private int count;
	Member members[];

	public Club() {
		numMember = 1;
		count = 1;
		members = new Member[ARRAY_SIZE_INCREMENT];
	}

	public void addMember(String surname, String firstname, String secondName) {
		if (members.length <= numMember) {
			increaseArraySize();
		}
		Member m = new Member(surname, firstname, secondName, numMember);
		members[numMember] = m;
		numMember++;
	}

	private void increaseArraySize() {
		Member newArray[] = new Member[members.length + ARRAY_SIZE_INCREMENT];
		for (Member m : members) {
			if (m != null)
				newArray[m.memberNumber] = m;
		}
		members = newArray;
	}

	public Member[] getMembers() {
		return members.clone();
	}

	public void showMemeber() {
		for (Member m : members) {
			if (m != null)
				m.show();
		}
	}

	public Member getMember(int memberNum) {
		return members[memberNum];
	}

	public Member removeMember(int memberNum) {
		Member m = members[memberNum];
		members[memberNum] = null;
		return m;
	}
}
