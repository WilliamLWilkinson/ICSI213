package Code;


public class Item {
	// Variables 
	private String name;	// Name of an item 
	private int weight;		// Weight of an item
	
	// Default constructor 
	public Item(){
		//Does nothing
	}// end of Item default constructor 
	
	// Non-Default constructor 
	public Item(int newWeight, String newName){
		name = newName;
		weight = newWeight;
	}// end of Item non-default constructor 
	
	public String getName(){
		return name;
	}//end of getName()
	
	public void setName(String newName){
		name = newName;
	}//end of setName(String newName)
	
	public int getWeight(){
		return weight;
	}// end of getWeight()
	
	public void setWeight(int newWeight){
		weight =newWeight;
	}
	
	public String examin(){
		String output = name + " has a total weight of "+ Integer.toString(weight);
		
		return output;
	}// end of examin

}// End of Item class
