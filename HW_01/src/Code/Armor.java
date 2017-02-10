package Code;

public class Armor extends Item{
	private int defense;	//Defense value of the armor
	
	// Default constructor
	public Armor(){
		//does nothing
	}//end of Armor constructor
	
	// Non-default constructor 
	public Armor(int newDefense, String newName, int newWeight){
		defense = newDefense;
		super.setName(newName);
		super.setWeight(newWeight);
	}// end of Armor non-default constructor
	
	//get method 
	public int getDefense(){
		return defense;
	}// end of getDefense()
	
	//set method
	public void setDefense(int newDefense){
		defense = newDefense;
	}// end of setDefense
	
	public String examin(){
	
		String output = super.examin();
		output = " and a defense of "+ Integer.toString(defense);
		
		return output;
	}// end of examine for armor class
		
}// end of Armor class
