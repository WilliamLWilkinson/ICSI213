package Code;

public class Food extends Item {
	// variables
	private int nutrition; // nutrition of the food item
	private int quantity;  // quantity of food item
	
	// Default constructor
	public Food(){
		// Does nothing
	}
	
	//Non-default constructor
	public Food(int newNutrition, int newQuantity, int newWeight, String newName){
		super.name=  newName;
		super.weight = newWeight;
		// calculates net weight, quantity * weight
		super.weight = super.weight * newQuantity;
		nutrition = newNutrition;
		quantity = newQuantity;
	}
	
	// get and set methods for Nutrition 
	public int getNutrition(){
		return nutrition;
	}
	
	public void setNutrition(int nutrition){
		
	}
	
	// get and set methods for Quantity 
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int newQuantity){
		quantity = newQuantity;
	}
	
	// Prints the description of the item including name, weight(Including quantity), and nutrition
	public String examin(){
		
		
		
		//CHANGE OUTPUT
		return "";
	}
}// end of Food class
