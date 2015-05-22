package sg.edu.nus.iss.club.oscar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.iss.club.oscar.Member;

public class MemberTest {

	Member m1;
	
	@Before
	public void setUp(){
		m1 = new Member("Castro Araya", "Oscar", "Andres", 1);
	}
	
	@After
	public void tearDown(){
		m1 = null;
	}
	
	@Test
	public void test() {
		assertNotNull("Object should not be null", m1);
		assertEquals("Object first name should be Oscar", m1.getFirstName(), "Oscar");
		assertEquals("Object second name should be Andres", m1.getSecondName(), "Andres");
		assertEquals("Object surname should be Oscar", m1.getSurName(), "Castro Araya");
		assertEquals("Object member number should be 1", m1.getMemberNumber(), 1);
	}


}
