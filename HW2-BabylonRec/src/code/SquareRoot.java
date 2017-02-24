package code;

public class SquareRoot {
	private double _numSquareRoot;
	private double _numPercError;
	private double _initGuess;
	
	//Default constructor
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
		if(_numSquareRoot -(newGuess*newGuess)==0 || percentError(newGuess)<_numPercError ){
			//System.out.println(newGuess);
			
			return newGuess;
		}//end of if
		else{
			//Calculate newGuess
			return calcRoot(calcNewGuess(newGuess));
		}//end of else
		
	}//end of calcRoot
	
	public double percentError(double guess){
		return 100*(((guess*guess) - _numSquareRoot)/_numSquareRoot);
	}
	
	public double calcNewGuess(double guessGuess){
		return (.5*(guessGuess + (_numSquareRoot/guessGuess)));
	}
	
	public void calcInitGuess(double numToSquare){
		_initGuess = numToSquare /2;
	}


}//end of SquareRoot
