package code;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalcButton implements ActionListener{
	private GuiClass _gui;
	
	
	//Default constructor
	public CalcButton(){/* Does nothing*/}
	
	public CalcButton(GuiClass newGui){
		_gui = newGui;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg){
		
	
		double results;
		
		try{
			if(_gui.getNumSqaureTF() == null|| _gui.getNumSqaureTF().isEmpty() ||_gui.getPercAccuracyTF()==null ||_gui.getPercAccuracyTF().isEmpty()){
				throw new TextFieldExceptions();
			}
			else if(containsLetters(_gui.getNumSqaureTF())||containsLetters(_gui.getPercAccuracyTF())){
				throw new LetterException();
			}
			else{
				//Tests to see if the user entered a positive number
				double squareRootNumber = Double.parseDouble(_gui.getNumSqaureTF());
				double percentError = Double.parseDouble(_gui.getPercAccuracyTF());
				
				if(squareRootNumber <0 ||percentError<0){
					
					throw new NegativeNumberException();
				}
				else{
					SquareRoot calculate = new SquareRoot();
					calculate.setNumPercError(percentError);
					calculate.setNumSquareRoot(squareRootNumber);
					results = calculate.calcRoot(calculate.getInitGuess());
					
					_gui.displayResults(results);
				
				}
				
				
			}
		}//end of try
		catch(LetterException d){
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame,
				    "DON'T ENTER A LETTER ONLY NUMBERS!!!",
				    "TextField Error",
				    JOptionPane.ERROR_MESSAGE);
		}
		catch(NegativeNumberException e){
			
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame,
				    "ENTER A POSITIVE NUMBER!!!",
				    "TextField Error",
				    JOptionPane.ERROR_MESSAGE);
			
			_gui.setNumSqaureTF("");
			
			_gui.setPercAccuracyTF("");
			_gui.setFocusonNumSquareTF();
			
		}//end of catch
		catch(TextFieldExceptions f){
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame,
				    "YOU LEFT A TEXTFIELD EMPTY",
				    "TextField Error",
				    JOptionPane.ERROR_MESSAGE);
			
			_gui.setNumSqaureTF("");
			_gui.setPercAccuracyTF("");
		}
		
		
	}//end of actionPerformed
	
	//Tests to see if the user entered a numerical value containing a number
	public boolean containsLetters(String string){
		boolean result = false;
		
		//Test to see if the string contains an Upper case letter
		if(string.contains("A")||string.contains("B")||string.contains("C")||string.contains("D")||string.contains("E")|| string.contains("F")||string.contains("G")||string.contains("H")||string.contains("I")||string.contains("J")||string.contains("K")||string.contains("L")||
		string.contains("M")||string.contains("N")||string.contains("O")||string.contains("P")||string.contains("Q")||string.contains("R")||string.contains("S")||string.contains("T")||string.contains("U")||string.contains("V")||string.contains("W")||string.contains("X")
		||string.contains("Y")||string.contains("Z")){
			result = true;
		}
		
		//Tests to see if the string contains a lower case letter
		if(string.contains("a")||string.contains("b")||string.contains("c")||string.contains("d")||string.contains("e")|| string.contains("f")||string.contains("g")||string.contains("h")||string.contains("i")||string.contains("j")||string.contains("k")||string.contains("l")||
		   string.contains("m")||string.contains("n")||string.contains("0")||string.contains("p")||string.contains("q")||string.contains("r")||string.contains("s")||string.contains("t")||string.contains("u")||string.contains("v")||string.contains("w")||string.contains("x")
		   ||string.contains("y")||string.contains("z")){
			result = true;
		}
		
		//Tests to see if the user entered some special symbol
		if(string.contains("!")||string.contains("@")||string.contains("#")||string.contains("$")||string.contains("%")||string.contains("^")||string.contains("&")||string.contains("*")||string.contains("(")||string.contains(")")||string.contains("_")||string.contains("+")
			||string.contains("=")||string.contains("`")||string.contains("~")||string.contains("[")||string.contains("]")||string.contains("|")||string.contains(";")||string.contains(":")||string.contains("'")||string.contains(",")||string.contains("<")||string.contains(">")
			||string.contains("?")||string.contains("/")){
			result = true;
		}
		
		return result;
	}
	
}//end of CalcButon actionhandler
