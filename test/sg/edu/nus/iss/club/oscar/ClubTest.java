package sg.edu.nus.iss.club.oscar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import sg.edu.nus.iss.club.su.Member;



public class ClubTest {


	private Member m;
	@Before
	public void setUp() throws Exception {
		m= new Member("Kwon", "Ji", "Yong",8888);		
	}
	
	@After
	public void tearDown()
	{
		m=null;
	}
	
	@Test
	public void testToString() {
		//fail("Not yet implemented");
	}
	@Test
	public void testgetMembershipid() {
		assertTrue("Ji Yong Membership id is his favorite number", m.getMembershipid()==8888);
		
		
		
	}

	

}
