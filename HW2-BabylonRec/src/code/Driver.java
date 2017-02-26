package code;

import javax.swing.SwingUtilities;

public class Driver {
public static void main(String[] args){
		
		SwingUtilities.invokeLater( new GuiClass());
	
	/*
		//Test one
		//Test the square root of 9 with a 00% error
		SquareRoot test = new SquareRoot();
		double toBeRooted = 9;
		double percentError = 0;
		test.setNumSquareRoot(toBeRooted);
		test.setNumPercError(percentError);
		System.out.println(test.getInitGuess());
		double answerCalc = test.calcRoot(test.getInitGuess());
		System.out.println(answerCalc);
		
		System.out.println();
		
		//Test two
		//Test the square root of 9 with a 90% error
		SquareRoot testTwo = new SquareRoot();
		double findSquareRoot = 9;
		double percError = 90;
		testTwo.setNumSquareRoot(findSquareRoot);
		testTwo.setNumPercError(percError);
		//Prints out initial guess
		System.out.println(testTwo.getInitGuess());
		double calculatedAnswer = testTwo.calcRoot(testTwo.getInitGuess());
		//Prints out the result
		System.out.println(calculatedAnswer);
		
		System.out.println();
		
		//Test three
		//Test the square root of 4 with a 02% error
		SquareRoot testThree = new SquareRoot();
		double testThreeSquare = 4;
		double testThreePercError = 2;
		testThree.setNumSquareRoot(testThreeSquare);
		testTwo.setNumPercError(testThreePercError);
		//Prints out initial guess
		System.out.println(testThree.getInitGuess());
		double testThreeCalculatedAnswer = testThree.calcRoot(testThree.getInitGuess());
		//Prints out the result
		System.out.println(testThreeCalculatedAnswer);
		
		System.out.println();
		*/
		//Test four
		//Test the square root of 100 with a 50% error
		SquareRoot testFour = new SquareRoot();
		double testFourSquare = 100;
		double testFourPercError = 50;
		testFour.setNumSquareRoot(testFourSquare);
		testFour.setNumPercError(testFourPercError);
		//Prints out initial guess
		System.out.println(testFour.getInitGuess());
		double testFourCalculatedAnswer = testFour.calcRoot(testFour.getInitGuess());
		//Prints out the result
		System.out.println(testFourCalculatedAnswer);
		

		
		
	}//end of 
}// end of driver class
