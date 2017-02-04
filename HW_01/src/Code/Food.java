package Code;

public class Food extends Item {
	private int nutrition;
	private int quantity;
	
	public Food(){
		nutrition = -1;
		quantity = -1;
	}
	
	public Food(int newNutrition, int newQuantity){
		nutrition = newNutrition;
		quantity = newQuantity;
	}
}
