package sg.edu.nus.iss.club.su;



public class Club {
	
	private int ARRAY_SIZE_INCREMENT=1;
	private int numMembers;
	private int count;
	private Member memberlist[]= new Member[ARRAY_SIZE_INCREMENT];
	
	public Club()
	{
		
	}
	public  Member getMember(int idx)
	{
		Member m=null;
		Member newMembers[]=getMembers();
		for(int i=0;i<newMembers.length;i++)
		{
			m= newMembers[i];
			if(m.getMembershipid()==idx)
			{
				break;
			}
		}
		return m;
	}
	
	public Member[]  getMembers()
	{
		Member newMembers[];
		newMembers=memberlist;
		return newMembers;
		
	}
	public void showMember()
	{
		Member newMembers[]=getMembers();
		for(int i=0;i<newMembers.length;i++)
		{
			Member m= newMembers[i];
			System.out.println(m.getSurname()+m.getFirstname()+m.getSecondname()+m.getMembershipid());
		}
	}
	
	public Member addMember(String surname,String firstname,String secondname)
	{
		if(numMembers>memberlist.length)
		{			
			Member newMembers[];
	        int newSize = numMembers + ARRAY_SIZE_INCREMENT;
	        newMembers = new Member[newSize];
	        for (int i = 0; i < numMembers; i++) {
	           newMembers[i] = memberlist[i];
	        }
	        memberlist = newMembers;
		}
				
		numMembers++;
		Member m= new Member(surname,firstname,secondname,numMembers+ARRAY_SIZE_INCREMENT);
		memberlist[count - 1] = m;
		count++;
		return m;
	}
	

}
