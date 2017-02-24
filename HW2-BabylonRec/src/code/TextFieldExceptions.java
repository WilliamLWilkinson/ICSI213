package code;

public class TextFieldExceptions extends Exception{
	//default constructor 
	public TextFieldExceptions(){
		//Does nothing
	}
	
	//Throws message
	public TextFieldExceptions(String exception){
		super(exception);
	}
	
}
