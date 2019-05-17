package smoothie;

import java.util.Scanner;

public class MakeSmoothie {

	public static void main(String[] args) {
		String [] smoothieSpecs = ask();
		makeSmoothie(smoothieSpecs);
	}
	
	public static String[] ask() {
		String [] smoothieSpecs = new String[2];
		System.out.println("What flavor smoothie would you like?");
		Scanner input =  new Scanner(System.in);
		smoothieSpecs[0]=input.nextLine()+" is a whole lotta";
		System.out.println("What size smoothie would you like?");
		smoothieSpecs[1]="is a whole lotta "+input.nextLine();
		input.close();
		return smoothieSpecs;	
	}
	
	public static void makeSmoothie(String[] flavorSize) {
		System.out.println("Making a "+flavorSize[1]+" size "+flavorSize[0]+" flavor smoothie for you now.");
	}

}
