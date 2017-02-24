package code;

import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiClass implements Runnable {
	//Strings
	private String _instructionOne;	//The first instruction for the user
	private String _instructionTwo;	//The second instruction for the user
	private String _resultString;
	//JFrame
	private JFrame _rootWindow;		//JFrame of the Babylonian square root gui 
	//JPanels
	private JPanel _buttonPanel;	//JPanel to contain the buttons for calculations and reset
	private JPanel _instrucPanel;	//JPanel that contains the instructions and textfields
	private JPanel _container;
	//JButtons
	private JButton _calcB;			//JButton which will calculate the 
	private JButton _resetB;		//JButton that will reset the gui to its beginning state
	private JButton _quitButton;			//JButton to quit the GUI
	//JLabel
	private JLabel _directionsSRN; 	//Tells user to enter number to be squared
	private JLabel _directionsPA;	//Tells user to enter percent accuracy
	private JLabel _resultsLabel;	//Tells the user where the result is displayed 
	//TextFields
	private TextField _numSqaure;	//Where the user will enter the number they wish to find the square root of 
	private TextField _percAccuracy;//Where the user enters number for percent error
	private TextField _resultsTF;	//Where the result will be displayed 
	
	// GuiClass default constructor
	public GuiClass(){
		_instructionOne = "Please enter the number you wish to find the square rood of:";
		_instructionTwo = "Please enter the percent accuracy without the percent symbol:";
		_resultString = "The square root of your number is:";
		
		_rootWindow= new JFrame("Babylonian Square Root");	
		
		_buttonPanel = new JPanel();
		_instrucPanel = new JPanel();
		_instrucPanel.setLayout(new BoxLayout(_instrucPanel, BoxLayout.Y_AXIS));
		_container = new JPanel();
		_container.setLayout(new BoxLayout(_container, BoxLayout.Y_AXIS));
		
		_calcB = new JButton("Find Square root");
		_resetB = new JButton("Reset");
		_resetB.setEnabled(false);
		_quitButton = new JButton("Quit");
		
		_directionsSRN = new JLabel(_instructionOne);	//Adds instructionsOne to JLabel
		_directionsPA = new JLabel(_instructionTwo);	//Adds instructionTwo to JLabel
		_resultsLabel = new JLabel(_resultString);
		
		_numSqaure = new TextField();
		_numSqaure.requestFocus();
		_percAccuracy = new TextField();
		_resultsTF = new TextField();
		_resultsTF.setEditable(false);// sets textfiled to false so users can't enter data on their results
		 
		_rootWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		//Adds button to button panel
		_buttonPanel.add(_calcB);
		_buttonPanel.add(_resetB);
		_buttonPanel.add(_quitButton);
		 
		//Adds labels and textfields 
		_instrucPanel.add(_directionsSRN);
		_instrucPanel.add(_numSqaure);
		_instrucPanel.add(_directionsPA);
		_instrucPanel.add(_percAccuracy);
		_instrucPanel.add(_resultsLabel);
		_instrucPanel.add(_resultsTF );
		 
		_container.add(_instrucPanel);
		_container.add(_buttonPanel);
		//Adds panels to JFrame
		_rootWindow.add(_container);
		//_rootWindow.add(_buttonPanel);
	}// end of GuiClass()
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		_rootWindow.setVisible(true);
		_rootWindow.setFocusable(true);
		_rootWindow.requestFocus();
		
		_quitButton.addActionListener(new QuitGuiHandler());
		
		_rootWindow.pack();
		_rootWindow.setLocationRelativeTo(null);
		
		
	}

}
