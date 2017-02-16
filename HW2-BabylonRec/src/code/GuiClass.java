package code;

import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiClass implements Runnable {
	private String _instructionOne;	//The first instruction for the user
	private String _instructionTwo;	//The second instruction for the user
	private JFrame _rootWindow;		//JFrame of the Babylonian square root gui 
	private JPanel _buttonPanel;	//JPanel to contain the buttons for calculations and reset
	private JPanel _instrucPanel;	//JPanel that contains the instructions and textfields
	private JButton _calcB;			//JButton which will calculate the 
	private JButton _resetB;		//JButton that will reset the gui to its beginning state
	private JLabel _directionsSRN; 	//
	private JLabel _directionsPA;	//
	private TextField _numSqaure;	//Textfield user will enter teh number they want to find the square root of 
	private TextField _percAccuracy;//Textfield user enters accuracy 

	// GuiClass default constructor
	public GuiClass(){
		_instructionOne = "Please enter the number you wish to find the square rood of";
		_instructionTwo = "Please enter the percent accuracy without the percent symbol";
		_rootWindow= new JFrame("Babylonian Square Root");	
		_buttonPanel = new JPanel();
		_instrucPanel = new JPanel();
		_calcB = new JButton("Find Square root");
		_resetB = new JButton("Reset");
		_directionsSRN = new JLabel(_instructionOne);	//Adds instructionsOne to JLabel
		_directionsPA = new JLabel(_instructionTwo);	//Adds instructionTwo to JLabel
		_numSqaure = new TextField();
		 _percAccuracy = new TextField();
		 
		 _rootWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 //Adds button to button panel
		 _buttonPanel.add(_calcB);
		 _buttonPanel.add(_resetB);
		 
		 //Adds 
		 //Adds panels to JFrame
		 _rootWindow.add(_buttonPanel);
		 _rootWindow.add(_buttonPanel);
	}// end of GuiClass()
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
