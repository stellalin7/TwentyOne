package playRockPaperScissors;

import java.util.*;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		String computer = getCompHand();
		String user = getUserHand();
		decide(computer, user);
	}
	
	public static String getCompHand() {
		String hands[]= {"rock","paper","scissors"};
		Random rand = new Random();
		int i = rand.nextInt(99)%3;
		return hands[i];
	}
	
	public static String getUserHand() {
		System.out.println("Please enter 'rock', 'paper', or 'scissors'.");
		Scanner input = new Scanner(System.in);
		String playerHand = input.nextLine();
		input.close();
		return playerHand;
	}
	
	public static void decide(String compChoice, String player) {
		
		System.out.println("You entered: " +player +".");
		System.out.println("Computer picked " +compChoice + ".");
		
		switch(player) {
			case("rock"):
			case("Rock"):
				switch (compChoice){
					case "rock":
						System.out.println("It's a tie.");
						break;
					case "paper":
						System.out.println("You win.  Paper covers rock.");
						break;
					case "scissors":
						System.out.println("You lose.  Rock beats scissors.");
						break;
					}
				break;
			case("paper"):
			case("Paper"):
				switch (compChoice){
					case "rock":
						System.out.println("You win.  Paper covers rock.");
						break;
					case "paper":
						System.out.println("It's a tie.");
						break;
					case "scissors":
						System.out.println("You lose.  Scissors cuts paper.");
						break;
					}
					break;
			case("scissors"):
			case("Scissors"):
				switch (compChoice){
				case "rock":
					System.out.println("You lose.  Rock beats scissors.");
					break;
				case "paper":
					System.out.println( "You win.  Scissors cut paper.");
					break;
				case "scissors":
					System.out.println( "It's a tie.");
					break;
				}
				break;
			default:
				System.out.println( "Please try again.");		
		}	
	}
}
