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
		
		_gui.displayResults();
		/*
		double squareRootNumber = tryGetNumFromTxt("1");
		double percentError =tryGetNumFromTxt("1");
		
		try{
			if( isNumPos(squareRootNumber)&&isNumPos( percentError)){
			
			}//end of if
			else{
			throw new NegativeNumberException("You must enter an positive value");
			}
		}//end of try
		catch(NegativeNumberException e){
			
		}//end of catch
		*/
	}//end of actionPerformed
	
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

}//end of CalcButon actionhandler
