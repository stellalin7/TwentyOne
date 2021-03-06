package twentyOne;

import java.util.*;

//v1: no face cards, and computer cannot draw more cards
//v2: add back face cards
//v3: computer can draw more than 2 cards

public class TwentyOne {
	
	static boolean keepPlaying = true;
	static int playerTotal = 0;
	static int compTotal = 0;
	static String[] cards = {"Ace","Deuce","Trey","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	static int[] values = {1,2,3,4,5,6,7,8,9,10,10,10,10};
	static String hiddenCard = null;
	
	public static void main(String[] args) {
		compTotal = dealerHand();
		playerTotal = playerHand();
		if (playerTotal <= 21) {
			while (keepPlaying) {
				keepPlaying = check();
			}
			if (compTotal <= 21 && playerTotal <=21) {
				compareHands(compTotal, playerTotal);
			}
		}
		else {
			System.out.println("You lost.  Your total is "+playerTotal);
		}
	}
	
	public static boolean compareHands(int computer, int player) {
		/*v1-v2
		if(player>21) {
			System.out.println("Computer wins.");
		}else {*/
		boolean houseWins = true;
			if (player > computer) {
				System.out.println(String.format("You won.  Your total was %d, and the dealer's was %d.", player, computer));
				System.out.println("Dealer's hidden card was a "+hiddenCard);
				houseWins = false;
			}
			else {
				System.out.println(String.format("You lost.  Your total was %d, and the dealer's was %d.", player, computer));
				System.out.println("Dealer's hidden card was a "+hiddenCard);
				if (computer == player) {
					System.out.println("(Dealer wins ties.)");
				}
			}
		//}
		return houseWins;
	}
	
	public static boolean check() {
		
			System.out.println("Would you like another card? Y/N");
			Scanner input = new Scanner(System.in);
			String choice = input.nextLine();
			switch (choice) {
				case ("Y"):
				case ("y"):
				case ("Yes"):
				case ("yes"): 
				case ("Yeah"):
				case ("yeah"):
				case ("Yep"):
				case ("yep"):
				case ("Hit me"):
				case ("hit me"):
					playerTotal = nextCard(playerTotal);
					//force computer to draw another card as long as they are not already at 21 if player takes another card without going bust
					if (playerTotal > 21) {
						System.out.println("Sorry, you went over 21.  Your total is "+playerTotal);
						keepPlaying = false;
					}
					else {
						if (compTotal < 21) {
							compTotal = dealerNext(compTotal);
						}
						if (compTotal> 21) {
							System.out.println("You win.  Dealer's total is "+compTotal);
							System.out.println("Dealer's hidden card was a "+hiddenCard);
							keepPlaying = false;
						}
						else {
							System.out.println("Your total so far is "+playerTotal);
							keepPlaying = true;
						}
					}
					break;
				default:
					System.out.println("OK, let's see who won.");
					input.close();
					keepPlaying = false;
				}
		
		return keepPlaying;
	}
	
	
	/*v1
	public static int dealerHand() {
		int visibleCard = getCard();
		int hiddenCard = getCard();
		System.out.println("Computer's visible card is "+visibleCard);
		return visibleCard+hiddenCard;
	}*/
	
	public static int dealerHand() {
		boolean dealerAce = false;
		String [] hand = new String [2];
		int [] value = new int [2];
		int total = 0;
		int index=0;
		
		for (int i = 0; i <2; i++) {
			index=getIndex();
			value[i] = values[index];
			hand[i] = cards[index];
			if(index == 0) {
				if(!dealerAce) {
					value[i] = 11;
					dealerAce = true;
					//force first Ace drawn by dealer to be 11
				}
				else {
					value[i] = 1;
					//second Ace drawn by dealer is 1 (to avoid automatically going over 21)
				}
			}
			if (i==0) {
				hiddenCard = hand[i];
			}
			else {
				System.out.println("Dealer's visible card is a "+hand[i]);
			}
			total += value[i];	
		}
		
		return total;
		
	}
	
	public static int playerHand() {
		String [] hand = new String [2];
		int [] value = new int [2];
		int total = 0;
		int index=0;
		for (int i = 0; i <2; i++) {
			index=getIndex();
			value[i] = values[index];
			hand[i] = cards[index];
			System.out.println(String.format("Your card %d is a %s", i+1, hand[i]));
			if(index == 0) {
				value[i] = getAceValue();
			}
			total += value[i];	
		}
		//input.close();
		System.out.println("Your total so far is "+total);
		return total;
	}
	
	public static int getAceValue() {
		System.out.println("What would you like to be the value of this ace?  Please enter 1 or 11.");
		Scanner input = new Scanner(System.in);
		try {
			int ace = input.nextInt();
			if (ace == 1 || ace ==11) {
				return ace;
			}
			else {
				System.out.println("Invalid value. The value of this ace will be set to 1.");
				return 1;
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Invalid value. The value of this ace will be set to 1.");
			return 1;
		}
	}
	/* v1
	public static int playerHand() {
		int playerCard1 = getCard();
		System.out.println("Your first card is "+ playerCard1);
		
		if (playerCard1 == 1) {
			
			
		}
		
		int playerCard2 = getCard();
		System.out.println("Your second card is "+ playerCard2);
		return playerCard1 + playerCard2;		
	}*/
	
	
	public static int nextCard (int total) {
		int index=getIndex();
		int nextValue = values[index];	
		System.out.println("Your next card is a " + cards[index]);
		if(index == 0) {
			nextValue = getAceValue();
		}
		return total + nextValue;
	}
	
	public static int dealerNext(int comp) {
		int index=getIndex();
		int nextValue = values[index];	
		System.out.println("Dealer's next card is a " + cards[index]);
		if(index == 0) {
			if(comp<=10) {
				nextValue = 11;
				System.out.println("Value of dealer's ace is 11");
			}
			else {
				nextValue = 1;
				System.out.println("Value of dealer's ace is 1");
			}
		}
		return comp + nextValue;
	}
	
	
	public static int getIndex() {
		Random rand = new Random();
		//v2
		return rand.nextInt(13); 
		
		/*v1
		return rand.nextInt(9)+2;  */
	}

}
