package Code;

public class Weapon extends Item {
	//Variables
	private int damage;	// Damage of the weapon
	
	public Weapon(){
		//does nothing
	}// end of Weapon()
	
	public Weapon(int newDamage, String WeaponName, int newWeight){
		this.setName(WeaponName); //Set the weapons name using the super class set method
		this.setWeight(newWeight); //Sets the weapons weight using the super class set method
		damage = newDamage; //
	}// end of Weapon(int newDamage)
	
	// get and set methods for damage
	public int getDamage(){
		return damage;
	}// end of getDamage
	
	public void setDamage(int newDamage){
		damage = newDamage;
	}//end of setDamage()
	
	public String examin(){
		/*CHANGE OUTPUT*/
		String output= super.examin() + " and has a damage of " + Integer.toString(damage);
		return output;
	}// end of examine()
}// end of Weapons class
