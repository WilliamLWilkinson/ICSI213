package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetGui implements ActionListener{
	private GuiClass _gui;
	
	
	public ResetGui(){/*Does nothing*/}
	
	public ResetGui(GuiClass newGui){
		_gui = newGui;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg){
	_gui.resetGui();
	}//end of actionPerformed

}
