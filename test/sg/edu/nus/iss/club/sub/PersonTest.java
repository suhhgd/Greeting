package sg.edu.nus.iss.club.sub;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.iss.club.su.Person;

public class PersonTest {
	private Person p;
	@Before
	public void setUp() throws Exception {
		p= new Person("Kwon", "Ji", "Yong");		
	}
	
	@After
	public void tearDown()
	{
		p=null;
	}
	
	@Test
	public void testToString() {
		//fail("Not yet implemented");
	  assertEquals(p.getFirstname(),"Kwon");
	  
	}
	
	

}
