package Code;

public class Food extends Item {
	// variables
	private int nutrition; // nutrition of the food item
	private int quantity;  // quantity of food item
	
	public Food(){
		// Does nothing
	}
	
	public Food(int newNutrition, int newQuantity){
		nutrition = newNutrition;
		quantity = newQuantity;
	}
	
	public int getNutrition(){
		return nutrition;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int newQuantity){
		quantity = newQuantity;
	}
	
	
	
	public String examin(){
		
		
		
		//CHANGE OUTPUT
		return "";
	}
}// end of Food class
