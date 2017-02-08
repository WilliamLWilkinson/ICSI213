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
	
	// get and set methods for damge
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
	}// end of examin()
}// end of Weapons class
