import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MoneyTest {
	
	private Money f12CHF;
	private Money f14CHF;
	
	@Before
	public void setUp(){
		f12CHF = new Money(12,"CHF");
		f14CHF = new Money(14,"CHF");		
	}
	
	
	@Test
	public void testAdd() {
		Money expected= new Money(26,"CHF");
		Money result= f12CHF.add(f14CHF);
		assertEquals(result.amount(),expected.amount());
	}
	
	
	@Test
	public void testEqualsObject() {
		assertTrue(!f12CHF.equals(null));
		assertEquals(f12CHF, f12CHF);
		assertEquals(f12CHF, new Money(12, "CHF"));
		assertTrue(!f12CHF.equals(f14CHF));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
	ArrayList emptyList = new ArrayList();
	Object o = emptyList.get(0);
	}
	
	@After
	public void tearDown(){
	f12CHF = null;
	f14CHF = null;		
}

}
