package Code;

public class Armor extends Item{
	private int defense;
	
	public Armor(){
		this.setName("Armor");
		this.setWeight(-1);
		defense =-1;
	}
	
	public Armor(int newDefense){
		defense = newDefense;
		
	}
	
	public int getDefense(){
		return defense;
	}
		
}
