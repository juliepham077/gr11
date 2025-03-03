package gr11programming;
/*
 * ChoHan.java
 * Julie Pham
 * 10/09/22
 * Game of Cho Han
 */
import java.util.*; //import the whole util package
public class ChoHan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("The Game of Cho-Han");
		System.out.println("======================================================");
		
		// Game instructions
		System.out.println("HOW TO PLAY:");
		System.out.println("2 dice are rolled. You must choose whether you think\r\n"
				+ "the total is even (cho) or odd (han). If you are\r\n"
				+ "correct, you will win 10 points. If you are incorrect,\r\n"
				+ "you lose 10 points.");
		
		// Declaring and Initializing variables
		int dice1 = rand.nextInt(6) + 1, dice2= rand.nextInt(6) + 1; // initialize variable for 2 dice, assign random number from 1-6 for each
		int sum; // sum of the dice
		int score = 50; // score of the player
		int evenOdd = 0; // player choice of even (cho) or odd (han), as an integer (mod2)
		String play = "y"; // does the player want to play? start with [y]es
		double game = 0.0, wins = 0.0, losses = 0.0; // number of games played, wins
		int choNum = 0, hanNum = 0; // number of cho and han
		
		// start game
		while (play.equals("y") && score > 0) {
		game ++;
		System.out.println("======================================================");
		System.out.println("You have " + score + " points"); // display current score
		System.out.print("You swirl the cup and hear the rattle of dice...\r\n"
				+ "You slam the cup on the floor, still covering the dice.\r\n");
		
		//collect guess of player
		do {
		System.out.print("CHO (even) or HAN (odd): ");
		String guess = input.next();
		if (guess.equals("CHO") || guess.equals("cho") || guess.equals("Cho")) {
			evenOdd = 0; // convert even (cho) to mod2=0
			choNum ++;
			break;
		}
		else if (guess.equals("HAN") || guess.equals("han") || guess.equals("Han")) {
			evenOdd = 1; // convert odd (han) to mod2=1
			hanNum ++;
			break;
		}
		else {
			System.out.println("Please enter a valid input.");
			play = "invalid";
		}
		} while (play.equals("invalid")); // if input is invalid, repeat question until valid input as CHO or HAN is given
		
		// show die values:
		System.out.println("You lift the cup to reveal...");
		dice1 = rand.nextInt(6) + 1; // randomize the first dice
		dice2 = rand.nextInt(6) + 1; // randomize the second dice
		sum = dice1 + dice2; // sum of the 2 die
		System.out.println(dice1 + "+" + dice2 + "=" + sum);
		
		// determine win or lose
		int remainder = sum%2; // mod2 of the sum to determine if even or odd
		if (remainder == evenOdd) { // if mod2 sum = mod2 player's guess, add 10 points
			System.out.println("You win 10 points!");
			score += 10;
			wins ++;
		}
		else { // if mod2 sum does not = mod2 player's guess, minus 10 points
			System.out.println("You lose 10 points");
			score -= 10;
			losses ++;
		}
		
		// ask if player would like to play again
		do {
		System.out.print("Would you like to play again [y/n]:");
		play = input.next();
		if (play.equals("y")) continue; // repeat if y
		else if (play.equals("n")) break; // quit if n
		else {
			System.out.println("Please enter a valid input.");
			play = "invalid";
		}
		} while (play.equals("invalid")); // if invalid input, ask question again until receive valid response
	}
		
		// when player finishes game:
		input.close();
		System.out.println("======================================================");
		System.out.println("FINAL STATISTICS");
		System.out.println("======================================================");
		System.out.println("Final Score: " + score + " points");
		System.out.println("Total Games Played: " + game);
		double winPer = (wins/game)*100;
		System.out.println("Win: " + winPer + "%");
		double losePer = (losses/game)*100;
		System.out.println("Lose: " + losePer + "%");
		if (choNum > hanNum) {
			System.out.println("Most Common Move: CHO");
		}
		else if (hanNum > choNum) {
			System.out.println("Most Common Move: HAN");
		}
		else {
			System.out.println("Most Common Move: tie");
		}
		System.out.println("Thank you for playing Cho-Han.");
}
}
