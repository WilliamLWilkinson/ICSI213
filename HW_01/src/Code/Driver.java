package Code;


public class Driver {
	public static void main(String[] args) {
		/*
		These tests have minimal error handling  
		*/
		
		//Tests item class
		
		// Tests weapons class and examine method using Non-default constructor
		int damage = 2;
		int weight = 10;
		Weapon sword = new Weapon(damage,"sword", weight);
		System.out.println(sword.examin());
		
		// Tests Weapon default constructor
		String weaponName = "Spear";
		int spearDamage = 5;
		int spearWeight = 10;
		Weapon spear = new Weapon();
		spear.setName(weaponName);
		spear.setDamage(spearDamage);
		spear.setWeight(spearWeight);
		System.out.println(spear.examin());
		
		//Tests Food class Non-default constructor
		Food toast = new Food();
		toast.setName("Toast!");
		toast.setNutrition(10);
		toast.setWeight(2);
		toast.setQuantity(40);
		toast.setWeight(1);
		System.out.println(toast.examin());
		
		//Tests Food class default constructor
		Food waffle = new Food(12, 20, 2,"WAFFLES");
		System.out.println(waffle.examin());
		
		//Tests Armor class Non-default constructor
		Armor helmet = new Armor();
		helmet.setName("Cool Helmet");
		helmet.setWeight(10);
		helmet.setDefense(64);
		System.out.println(helmet.examin());
		//Tests Armor class default constructor
		Armor tophat = new Armor(0,"Tophat",12);
		System.out.println(tophat.examin());
		
		
	}// end of main method
}// end of driver calss
