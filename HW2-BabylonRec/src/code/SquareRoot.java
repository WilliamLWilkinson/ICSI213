package code;

public class SquareRoot {
	private double _numSquareRoot;	//Number that you're finding the square root
	private double _numPercError;	//The acceptable error
	private double _initGuess;		//Initial guess calculate (X/)
	
	//Default constructor, sets all the variables to zero
	public SquareRoot(){
		_numSquareRoot =0;
		_numPercError = 0;
		_initGuess = 0;
	}
	
	// Non-default constructor 
	public SquareRoot(double newNumSquareRoot, double newNumPercError){
		_numSquareRoot = newNumSquareRoot;
		_numPercError = newNumPercError;
		calcInitGuess(newNumSquareRoot);
	}
	
	//gets and sets for _numSquareRoot
	public double getNumSquareRoot(){
		return _numSquareRoot;
		
	}
	
	public void setNumSquareRoot(double newNumSquareRoot){
		_numSquareRoot = newNumSquareRoot;
		calcInitGuess(newNumSquareRoot);
	}
	
	//gets and sets for _numPercError
	public double getNumPercError(){
		return _numPercError;
	}
	
	public void setNumPercError(double newNumPercError){
		_numPercError = newNumPercError;
	}
	
	//gets and sets for initial guess
	public void setInitGuess(double newInitGuess){
		_initGuess = newInitGuess;
	}
	
	public double getInitGuess(){
		return _initGuess;
	}
	
	public double calcRoot(double newGuess){
		//if the guess is the square root of the number, calculated by multiplying the guess by itself then subtracting it
		//from the user entered value or if the percent error was reached
		if(_numSquareRoot -(newGuess*newGuess)==0 || percentError(newGuess)<=_numPercError ){
			//System.out.println(newGuess);
			return newGuess;
		}//end of if
		else{
			//Calculate newGuess
			return calcRoot(calcNewGuess(newGuess));
		}//end of else
		
	}//end of calcRoot
	
	//Calculates the percent error of the guess
	public double percentError(double guess){
		return 100*(((guess*guess) - _numSquareRoot)/_numSquareRoot);
	}
	
	//Calculates the new guess using the formula 
	//newGuess = *0.5(initial guess +(the number you're trying to the number of/ initial guess))
	public double calcNewGuess(double guessGuess){
		return (.5*(guessGuess + (_numSquareRoot/guessGuess)));
	}
	
	//calculates the initial guess
	//initial guess = the number you wish to find the square of/2;
	public void calcInitGuess(double numToSquare){
		_initGuess = numToSquare /2;
	}


}//end of SquareRoot
