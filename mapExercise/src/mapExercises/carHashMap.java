package mapExercises;

import java.util.*;

public class carHashMap {

	static HashMap<String,String> inventory = new HashMap<String,String>();
	
	public static void main(String[] args) {
		addToInventory("Prius","Toyota");
		addToInventory("Civic","Honda");
		addToInventory("Miata","Mazda");
		addToInventory("Six","Mazda");
		addToInventory("Camry","Toyota");
		addToInventory("Accord","Honda");

	}
	
	public static void addToInventory (String model, String make){
		inventory.put(model,make);	
	}

}
