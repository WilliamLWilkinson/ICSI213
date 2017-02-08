package Code;

public class Weapon extends Item {
	//Variables
	private int damage;	// Damage of the weapon
	
	public Weapon(){
		//does nothing
	}// end of Weapon()
	
	public Weapon(int newDamage, String WeaponName, int newWeight){
		this.setName(WeaponName);
		this.setWeight(newWeight);
		damage = newDamage;
	}// end of Weapon(int newDamage)
	
	public int getDamage(){
		return damage;
	}// end of getDamage
	
	public void setDamage(int newDamage){
		damage = newDamage;
	}//end of setDamage()
	
	public String examin(){
		/*CHANGE OUTPUT*/
		String output= this.getName() + " has a weight of " + this.getWeight() + " and a damage of " + this.getDamage();
		return output;
	}// end of examin()
}// end of Weapons class
