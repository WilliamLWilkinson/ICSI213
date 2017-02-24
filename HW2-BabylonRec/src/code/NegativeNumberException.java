package code;

public class NegativeNumberException extends Exception{
	
	//default constructor 
	public NegativeNumberException(){/*Does nothing*/}

	//Throws message
	public NegativeNumberException(String message){
		super(message);
	}
}
