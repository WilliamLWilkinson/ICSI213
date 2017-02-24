package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.SquareRoot;

public class SquareRootTest {
	
	@Test
	public void testOne(){
		// Tests the calcRoot method with a zero percent error
		SquareRoot test = new SquareRoot();
		double anExpected =2;
		double toBeRooted = 4;
		double percentError = 0;
		test.setNumSquareRoot(toBeRooted);
		test.setNumPercError(percentError);
		double answerCalc = test.calcRoot(test.getInitGuess());
		
		assertTrue("I expect the answer to be " +Double.toString(anExpected) + 
					" but it was" + Double.toString(answerCalc),answerCalc==anExpected);
	}
	
	@Test
	public void testTwo(){
		// Tests the calcRoot method with a zero percent error
		SquareRoot test = new SquareRoot();
		double anExpected =3;
		double toBeRooted = 9;
		double percentError = 0;
		test.setNumSquareRoot(toBeRooted);
		test.setNumPercError(percentError);
		double answerCalc = test.calcRoot(test.getInitGuess());
		
		assertTrue("I expect the answer to be " +Double.toString(anExpected) + 
					" but it was" + Double.toString(answerCalc),answerCalc==anExpected);
	}
	
	@Test
	public void testThree(){
		// Tests the calcRoot method with a zero percent error
		SquareRoot test = new SquareRoot();
		double anExpected =4;
		double toBeRooted = 16;
		double percentError = 0;
		test.setNumSquareRoot(toBeRooted);
		test.setNumPercError(percentError);
		double answerCalc = test.calcRoot(test.getInitGuess());
		
		assertTrue("I expect the answer to be " +Double.toString(anExpected) + 
					" but it was" + Double.toString(answerCalc),answerCalc==anExpected);
	}
	
	@Test
	public void testFour(){
		SquareRoot test = new SquareRoot();
		double guess = 3;
		double realValue =4;
		test.setNumSquareRoot(realValue);
		double perError = test.percentError(3);
		double realPerError = 100*((guess*guess-realValue)/realValue);
		assertTrue("I expect the percent error to be " + realPerError
				   + "but it was " + perError, perError==realPerError);
	}
	
	
	
	
}
