package Code;

public class Item {
	
	// Variables 
	private String name;	// Name of an item 
	private int weight;		// Weight of an item
	
	// Default constructor 
	public Item(){
		/*
		 Pre: Name and weight are declared but are undefined
		 Post: Name and weight are set to default values. 
		 Purpose: instantiates previously undefined values
		*/
		name = " ";
		weight = -1;
	}// end of Item default constructor 
	
	// Non-Default constructor 
	public Item(int newWeight, String newName){
		/*
		 Pre: Name and weight are declared but are undefined
		 Post: Name and weight are set to values from the argument list 
		 Purpose: instantiates previously undefined values
		*/
		name = newName;
		weight = newWeight;
	}// end of Item non-default constructor 
	
	public String getName(){
		/*
		 Pre: 
		 Post: 
		 Purpose:
		*/
		return name;
	}//end of getName()
	
	public void setName(String newName){
		name = newName;
	}//end of setName(String newName)
	
	public int getWeight(){
		/*
		 Pre: 
		 Post: 
		 Purpose:
		*/
		return weight;
	}// end of getWeight()
	
	public void setWeight(int newWeight){
		weight =newWeight;
	}
	
	public String examin(){
		String output = name + " has a weight of "+ weight;
		
		return output;
	}// end of examin

}// End of Item class
