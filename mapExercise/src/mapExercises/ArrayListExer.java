package mapExercises;

import java.util.*;

public class ArrayListExer {
	
	

	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		int listSize = 5;
		Scanner input = new Scanner(System.in);
		for (int i=0; i<listSize;i++) {
			numbers.add(fill(input,i));
		}
		input.close();
		System.out.println("The numbers in your ArrayList are: "+numbers);
		/*Collections.sort(numbers);
		System.out.println("The smallest number in your ArrayList is: "+numbers.get(0));
		System.out.println("The largest number in your ArrayList is: "+numbers.get(numbers.size()-1));*/
		System.out.println("The smallest number in your ArrayList is: "+Collections.min(numbers));
		System.out.println("The largest number in your ArrayList is: "+Collections.max(numbers));
		
		System.out.println("The sum of all the numbers in your ArrayList is "+sum(numbers));
		System.out.println("The product of all the numbers in your ArrayList is "+product(numbers));
	}
	
	public static int fill(Scanner input, int i){
		System.out.println(String.format("Please enter an integer for number %d in your ArrayList:", i+1));
		try {
			int next =input.nextInt();
			return next;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(String.format("Invalid input received. Number %d in your ArrayList is being set to 1.", i+1));
			return 1;
		}
	}
	
	public static int sum(ArrayList<Integer> all) {
		int sum = 0;
		for (int number:all) {
			sum += number;
		}
		return sum;
	}
	
	public static int product(ArrayList<Integer> all) {
		int product = 1;
		for (int number:all) {
			product *= number;
		}
		return product;
	}

	
}
