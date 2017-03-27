package JavaBase_oob2;

import lombok.Getter;
import lombok.Setter;

public abstract class Pet {

	@Getter@Setter
	String petName;
	int health;
	int love;
	
	/*public void print(){
		System.out.println("name"+ name + "health" + health + "love" + love);
	}*/
	
	public Pet() {
		super();
	}
	
	public Pet(String petName) {
		super();
		this.petName =petName;
	}
	
	public Pet(String petName, int health, int love){
		super();
		this.petName =petName;
		this.health =health;
		this.love =love;
	}
	
	
	public String getName(String petName){
		return petName;
	}
	
	public int getHealth(int petHealth){
		return petHealth;
	}
	
	public int getLove(int petLove){
		return petLove;
	}
}
