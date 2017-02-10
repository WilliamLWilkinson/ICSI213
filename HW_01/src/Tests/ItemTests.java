package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.Item;


public class ItemTests {

	// Tests setName and getName method
	@Test
	public void test() {
		
		Item one = new Item();
		one.setName("Test item");
		String actual = one.getName();
		String expected = "Test item";
		
		assertTrue("I expect th name of the item to be "+
					expected+ " but it was actually " + actual, new String(actual).equals(expected) );
		
	}//end of test
	
	// tests getWeight and setWeight method
	@Test
	public void test1(){
		Item testItem = new Item();
		testItem.setWeight(10);
		int actual = testItem.getWeight();
		int expected = 10;
		
		assertTrue("I expect the weight of the item to be "
					+ Integer.toString(expected) + " but was actually " 
					+ Integer.toString(actual), actual==expected);
	}// end of test1

}//End of test class
