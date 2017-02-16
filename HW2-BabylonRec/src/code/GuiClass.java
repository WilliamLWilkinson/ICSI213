package code;

import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiClass implements Runnable {
	private String _instructionOne;
	private String _instructionTwo;
	private JFrame _rootWindow;
	private JPanel _buttonPanel;
	private JPanel _instrucPanel;
	private JButton _calcB;
	private JButton _resetB;
	private JLabel _directionsSRN;
	private JLabel _directionsPA;
	private TextField _numSqaure;
	private TextField _percAccuracy;

	
	public GuiClass(){
		_instructionOne = "Please enter the number you wish to find the square rood of";
		_instructionTwo = "Please enter the percent accuracy without the percent symbol";
		_rootWindow= new JFrame("Babylonian Square Root");	
		_buttonPanel = new JPanel();
		_instrucPanel = new JPanel();
		_calcB = new JButton("Find Square root");
		_resetB = new JButton("Reset");
		_directionsSRN = new JLabel();
		_directionsPA = new JLabel();
		_numSqaure = new TextField();
		 _percAccuracy = new TextField();
		 
		 _rootWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
