package code;

public class PercentTooSmallException extends Exception{
	//Default constructor 
	public PercentTooSmallException(){/*Does nothing*/}
	
	//Throws message
	public PercentTooSmallException(String message){
		super(message);
	}
	

}
