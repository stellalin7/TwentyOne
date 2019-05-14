package classExercise3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*Create Team Class
    - name
    
methods
    - create the teams
        - scanner to take user input
    - list out teams
        - System.out.println()
    - pair the teams 1&4 + 2&3 and determine winner
        - team1.getRanking();
        - randomize winner
    - exit the program
        - System.out.println("Thanks for plaing");
        break out of loop

noticeable actions
    - loop to create the selections
        - scanner to take menu selection*/

public class Tournament {
	
	public static ArrayList <String> seededTeams = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);
		boolean cont = true;
		while (cont)
			cont = menu(menu);
		
	}
	
	public static boolean menu(Scanner menu) {
		boolean cont = true;
		System.out.println("Welcome to the My Tournament Generator.  Please select from the choices below:");
		System.out.println("Enter 1 to enter teams into the tournament.");
		System.out.println("Enter 2 to list the teams in the tournament.");
		System.out.println("Enter 3 to list the matchups in the tournament.");
		System.out.println("Enter 0 to exit the tournament.");
		System.out.println("Please enter the number for your selection:");
		int selection = menu.nextInt();
		switch (selection) {
		case (1):
			enterTeams();
			break;
		case(2):
			System.out.println("The teams in your tournament, in order of seeding from top to bottom are: "+seededTeams);
			break;
		case(3):
			matchUps();
			break;
		case(0):
			System.out.println("Thank you for playing.");
			menu.close();
			cont = false;
			break;
		default: 
			System.out.println("Unrecognized input.  Exiting program.");
			menu.close();
			cont = false;
		}
		return cont;
	}
	
	public static void enterTeams () {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of the top-seeded team in your tournament:");
		seededTeams.add(input.nextLine());
		System.out.println("Please enter the name of the next-seeded team in your tournament:");
		seededTeams.add(input.nextLine());
		boolean cont = true;
		while (cont) {
			System.out.println("Would you like to enter more teams into the tournament? Please enter 1 to continue adding teams, or 0 to exit to the main menu.");
			int selection = input.nextInt();
			switch (selection) {
			case (1):
				Scanner in = new Scanner(System.in);
				System.out.println("Please enter the name of the next-seeded team in your tournament:");
				String nextTeam = in.nextLine();
				seededTeams.add(nextTeam);
				continue;
			case(0):
				cont = false;
				break;
			default: 
				System.out.println("Unrecognized input.  Exiting to main menu.");
				cont = false;
			}	
		}
		//input.close();
	}
	
	public static void matchUps() {
		int numberTeams = seededTeams.size();
		int numberMatchups = numberTeams/2;
		System.out.println(numberMatchups+ " match-ups for " +numberTeams + " teams in the tournament.");
		if (numberTeams%2 ==1) {
			System.out.println("The top-seeded team "+seededTeams.get(0)+" gets a bye because there is an odd number of teams in the tournament.");
			for (int i = 0; i< numberMatchups; i++) {
				System.out.println(seededTeams.get(i+1) + " will play "+seededTeams.get(numberTeams-(i+1)));
				if (play()) {
					System.out.println(seededTeams.get(i+1)+ " was the winner.");
					System.out.println("These two teams' seeds remain unchanged.");
				}
				else {
					System.out.println(seededTeams.get(numberTeams-(i+1))+ " was the winner.");
					String oldTop = seededTeams.get(i+1);
					String oldBottom = seededTeams.get(numberTeams-(i+1));
					seededTeams.remove(i+1);
					seededTeams.add(i+1,oldBottom);
					seededTeams.remove(numberTeams-(i+1));
					seededTeams.add(numberTeams-(i+1), oldTop);
					System.out.println(seededTeams.get(i+1) + " is now seed "+(i+2)+" and "+ seededTeams.get(numberTeams-(i+1))+ " is now seed "+ (numberTeams-i));
				}	
			}
		}else {
			for (int i = 0; i< numberMatchups; i++) {
				System.out.println(seededTeams.get(i) + " will play "+seededTeams.get(numberTeams-(i+1)));
				if (play()) {
					System.out.println(seededTeams.get(i)+ " was the winner.");
					System.out.println("These two teams' seeds remain unchanged.");
				}
				else {
					System.out.println(seededTeams.get(numberTeams-(i+1))+ " was the winner.");
					String oldTop = seededTeams.get(i);
					String oldBottom = seededTeams.get(numberTeams-(i+1));
					seededTeams.remove(i);
					seededTeams.add(i,oldBottom);
					seededTeams.remove(numberTeams-(i+1));
					seededTeams.add(numberTeams-(i+1), oldTop);
					System.out.println(seededTeams.get(i) + " is now seed "+(i+1)+" and "+ seededTeams.get(numberTeams-(i+1))+ " is now seed "+ (numberTeams-i));
				}	
			}
		}
	}
	
	public static boolean play() {
		boolean topWinner = true;
		Random rand = new Random();
		if (rand.nextInt(2) == 0)
			topWinner=false;
		return topWinner;
	}
	
	
}
