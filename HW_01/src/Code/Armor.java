package Code;

public class Armor extends Item{
	private int defense;
	
	// Default constructor
	public Armor(){
		//does nothing
	}
	
	// Non-default constructor 
	public Armor(int newDefense){
		defense = newDefense;
		
	}
	
	//get method 
	public int getDefense(){
		return defense;
	}
	
	//set method
	public void setDefense(int newDefense){
		defense = newDefense;
	}
	
	public String examin(){
	
		
		
		//CHANGE OUTPUT
		return "";
	}
		
}// end of Armor class
