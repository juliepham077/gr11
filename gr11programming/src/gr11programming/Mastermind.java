package gr11programming;
import java.util.*;

public class Mastermind {

	/**
	 * Determines whether the secret code has been guessed or not.
	 * @param secret	The secret code
	 * @param guess		The player's guess
	 * @return	Return true if guess = secret; false otherwise
	 */
	static boolean checkWin(int[] secret, int[] guess) {
		boolean win = false;
		for (int i = 0; i < secret.length; i++) {
			if (guess[i] == secret[i]) win = true;
			else {
				win = false;	//at least one digit is incorrect
				break;
			}
		}
		if (win) return true;
		else return false;
	}//end checkWin(int[], int[])
	
	
	/**
	 * Creates and displays clues to the secret code based on the player's guess
	 * @param secret	The secret code.
	 * @param guess		The player's guess.
	 */
	static void getClues(int[] secret, int[] guess) {
		//counts how many pegs and colors the player has correct
		int pegs = 0, colors = 0;
		for (int i = 0; i < guess.length; i++ ) {
			if (guess[i] == secret[i]) {
				//Right color AND right position
				pegs++;
				colors++;
			} else {
				for (int j = 0; j < secret.length; j++) {
					if (i != j && guess[i] == secret[j]) {
						//Right color, wrong position
						colors++;
					}
				}
			}
		}
		System.out.println("You have " + pegs + " peg(s) correct and " + colors + " color(s) correct.");
	}//end getClues(int[], int[])
	
	
	/**
	 * Creates the secret code to be used in the game.
	 * @param nColor	The number of colors in the secret code
	 * @param secret	The empty array that stores the secret code
	 */
	static void getCode(int nColor, int[] secret) {
		Random r = new Random();	//for generating colors randomly
		boolean add = true;	//tracks whether we add a color to the code or not
		int index = 0;	//keeps track of position in secret
		
		//Add random colors to secret code. Ensure colors are unique.
		while (index < secret.length) {
			int num = r.nextInt(nColor) + 1;
			add = true;
			for (int i = 0; i < secret.length; i++) {
				if (num == secret[i]) {
					//check to see if that color has already been added to the code. If yes, don't add again.
					add = false;
					break;
				}
			}
			if (add) {
				//add a unique color to the code and go to the next index in secret
				secret[index] = num;
				index++;
			}
		}
	}//end getCode(int, int[])
	
	
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int numPegs, numColors;
		
		//Welcome and rules
		System.out.println("Welcome to the Game of Mastermind!\n\nI will create a secret code using different coloured pegs. You must guess the secret\n"
				+ "code in as few guesses as possible. After each guess you will get a clue for how many correct pegs and how many\n"
				+ "correct colors your guess contained.\n\n");
		
		/*
		 * Main Game
		 */

		//Prompt user for the number of pegs and number of colors
		System.out.print("Enter the number of pegs (2-8): ");
		numPegs = input.nextInt();
		System.out.print("Enter the number of colors (3-10): ");
		numColors = input.nextInt();
		
		//Determine the secret code
		int[] secret = new int[numPegs];
		getCode(numColors, secret);
		
		System.out.println();
		
		//Playing the Game. Loop until the player guesses the correct answer.
		int[] guess = new int[secret.length];
		int turn = 1;
		while (true) {
			//Get the player's guess
			System.out.println("Guess #" + turn);
			for (int i  = 0; i < numPegs; i++) {
				int num = i + 1;
				System.out.print("Color for peg " + num + ": ");
				guess[i] = input.nextInt();
			}
						
			//check for win. If player has not won, display the clues
			if (checkWin(secret, guess)) {
				System.out.println("You got it!");
				break;
			} else {
				getClues(secret, guess);
				turn++;
			}
			System.out.println();
		}
			
		System.out.println("\nYou guessed the code in "+turn+" turns.\nThanks for playing!");
		input.close();
		
	}//end main(String[])

}//end class Mastermind


