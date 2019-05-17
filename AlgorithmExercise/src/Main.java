import java.util.ArrayList;

public class Main {
	
	/*
	 * given number1 = 23
	 * and an array containing [34444, 5234, 23, 89, 0, 77777777, 9, 6094]
	 * search - find number1 in the array
	 * sort - from greatest to least
	 * sort - from least to greatest
	 * update - wherever in the array it says 0, replace it with 1
	 * bonus update algorithm replaces all displayed 0s
	 * 
	 */
	
	static int[] numberArray = {34444, 5234, 23, 89, 0, 77777777, 9, 6094};
	
	public static void main(String[] args) {
		int givenNumber = 23;
		System.out.println("The index of "+givenNumber+" in the array is "+searchArray(givenNumber));
		sortArrayAscending();
		sortArrayDescending();
		givenNumber = 1;
		search0Replace(givenNumber);
	}
	
	public static int searchArray(int find) {
		int index =0;
		for (index =0; index< numberArray.length; index++) {
			if (numberArray[index]==find) {
				break;
			}
		}
		return index;
	}
	
	public static void search0Replace(int replace) {
		int index =0;
		for (index =0; index< numberArray.length; index++) {
			if (numberArray[index]==0) {
				numberArray[index]=replace;
			}
		}
		System.out.println("The numbers in the array with 0 replaced by "+replace+" are: ");
		for (int i=0; i<numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}
		
	}
	
	
	
	public static void sortArrayAscending() {
		for(int i=0;i<numberArray.length;i++) {
			for(int j=0; j<numberArray.length-1; j++) {
				int hold = numberArray[j];
				if(numberArray[j]<numberArray[j+1]) {
					numberArray[j]=numberArray[j+1];
					numberArray[j+1]=hold;
				}	
			}
		}
		System.out.println("The numbers in the array sorted from greatest to least are:");
		for (int index=0; index<numberArray.length; index++) {
			System.out.println(numberArray[index]);
		}
	}
	
	public static void sortArrayDescending() {
		for(int i=0;i<numberArray.length;i++) {
			for(int j=0; j<numberArray.length-1; j++) {
				int hold = numberArray[j];
				if(numberArray[j]>numberArray[j+1]) {
					numberArray[j]=numberArray[j+1];
					numberArray[j+1]=hold;
				}	
			}
		}
		System.out.println("The numbers in the array sorted from least to greatest are:");
		for (int index=0; index<numberArray.length; index++) {
			System.out.println(numberArray[index]);
		}
	}
}
