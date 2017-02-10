package Code;

public class Food extends Item {
	// variables
	private int nutrition; // nutrition of the food item
	private int quantity;  // quantity of food item
	
	// Default constructor
	public Food(){
		// Does nothing
	}//end of Food() default constructor
	
	//Non-default constructor
	public Food(int newNutrition, int newQuantity, int newWeight, String newName){
		super.setName(newName);
		// calculates net weight, quantity * weight
		super.setWeight(newWeight*newQuantity);
		nutrition = newNutrition;
		quantity = newQuantity;
	}// end of Food(int, int, int. string) non-default constructor
	
	// get and set methods for Nutrition 
	public int getNutrition(){
		return nutrition;
	}//end of getNutrition()
	
	public void setNutrition(int newNutrition){
		nutrition = newNutrition;
	}//end of setNutrition 
	
	// get and set methods for Quantity 
	public int getQuantity(){
		return quantity;
	}// end of getQuantity
	
	public void setQuantity(int newQuantity){
		quantity = newQuantity;
	}//end of setQuantity
	
	// Prints the description of the item including name, weight(Including quantity), and nutrition
	public String examin(){
		// Can only be called when nutrition, name, weight, and quantity contain values other than garbage and null
		String output = super.examin();// output get the name and weight
		output = " , nutritional value of " + Integer.toString(nutrition)+" and you hold a quantity of "+ Integer.toString(quantity) ;
		
		//CHANGE OUTPUT
		return output;
	}//end of examine()
	
}// end of Food class
