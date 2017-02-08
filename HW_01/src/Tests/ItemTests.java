package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.Item;


public class ItemTests {

	@Test
	public void test() {
		Item one = new Item();
		one.setName("Test item");
		String actual = one.getName();
		String expected = "Test item";
		
		assertTrue("I expect th name of the item to be "+
					expected+ " but it was actually" + actual, new String(actual).equals(expected) );
		
	}//end of test
	
	@Test
	public void test1(){
		
	}// end of test1

}//End of test class
