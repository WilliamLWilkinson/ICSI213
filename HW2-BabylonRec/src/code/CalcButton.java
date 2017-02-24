package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButton implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent arg){
		
	}//end of actionPerformed
	
	public int tryGetNumFromTxt(String txtFieldString){
		try{
			double txtNumber = Double.parseDouble(txtFieldString);
			
			if(txtNumber <0)
				throw new 
		}
		catch(){
			
		}
		catch(TextFieldExceptions e){
			
		}
		
	}//end of tryGetNumFromTxt

}//end of CalcButon actionhandler
