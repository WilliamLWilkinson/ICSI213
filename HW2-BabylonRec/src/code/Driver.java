package code;

import javax.swing.SwingUtilities;

public class Driver {
public static void main(String[] args){
		
		//SwingUtilities.invokeLater( new GuiClass());
	
	
		SquareRoot test = new SquareRoot();
		double toBeRooted = 9;
		double percentError = 0;
		test.setNumSquareRoot(toBeRooted);
		test.setNumPercError(percentError);
		System.out.println(test.getInitGuess());
		double answerCalc = test.calcRoot(test.getInitGuess());
		System.out.println(answerCalc);
		
		System.out.println();
		
		SquareRoot testTwo = new SquareRoot();
		double findSquareRoot = 9;
		double percError = 90;
		testTwo.setNumSquareRoot(findSquareRoot);
		testTwo.setNumPercError(percError);
		System.out.println(testTwo.getInitGuess());
		double calculatedAnswer = testTwo.calcRoot(testTwo.getInitGuess());
		System.out.println(calculatedAnswer);
		
		System.out.println();
		
		SquareRoot testThree = new SquareRoot();
		double testThreeSquare = 4;
		double testThreePercError = 2;
		testThree.setNumSquareRoot(testThreeSquare);
		testTwo.setNumPercError(testThreePercError);
		System.out.println(testThree.getInitGuess());
		double testThreeCalculatedAnswer = testThree.calcRoot(testThree.getInitGuess());
		System.out.println(testThreeCalculatedAnswer);
		
		System.out.println();
		
		SquareRoot testFour = new SquareRoot();
		double testFourSquare = 100;
		double testFourPercError = 50;
		testFour.setNumSquareRoot(testFourSquare);
		testFour.setNumPercError(testFourPercError);
		System.out.println(testFour.getInitGuess());
		double testFourCalculatedAnswer = testFour.calcRoot(testFour.getInitGuess());
		System.out.println(testFourCalculatedAnswer);
		
		
	}//end of 
}// end of driver class
