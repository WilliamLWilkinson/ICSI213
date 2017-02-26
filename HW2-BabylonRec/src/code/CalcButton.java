package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		catch(NegativeNumberException e){
			_gui.setNumSqaureTF("ENTER A POSITIVE NUMBER!!!");
			_gui.setPercAccuracyTF("ENTER A POSITIVE NUMBER!!!");
			
		}//end of catch
		catch(TextFieldExceptions f){
			_gui.setNumSqaureTF("ENTER A POSITIVE NUMBER!!!");
			_gui.setPercAccuracyTF("ENTER A POSITIVE NUMBER!!!");
		}
		
		
	}//end of actionPerformed
	
	/*
	public double tryGetNumFromTxt(String txtFieldString){
		double txtNumber;
		try{
			txtNumber = Double.parseDouble(txtFieldString);
			throw new TextFieldExceptions("The value you entered was not a double");
		}
		catch( TextFieldExceptions e){
			
			txtNumber = -1;
		}
		
		return txtNumber;
		
	}//end of tryGetNumFromTxt
	
	
	public boolean isNumPos(double number){
		return number>=0;
	}//end of 
	 */
	
}//end of CalcButon actionhandler
