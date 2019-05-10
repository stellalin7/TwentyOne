package mapExercises;

import java.util.*;

public class carHashMap {

	static HashMap<String,String> inventory = new HashMap<String,String>();
	
	public static void main(String[] args) {
		addToInventory("Prius","Toyota");
		addToInventory("Civic","Honda");
		addToInventory("Miata","Mazda");
		addToInventory("Camry","Toyota");
		addToInventory("Accord","Honda");
		String model = askModel();

	}
	
	public static void addToInventory (String model, String make){
		inventory.put(model,make);	
	}
	
	public static String askModel () {
		System.out.println("What model are you looking for?");
		Scanner input = new Scanner(System.in);
		String model = input.nextLine();
		input.close();
		return model;
	}
	
	

}
