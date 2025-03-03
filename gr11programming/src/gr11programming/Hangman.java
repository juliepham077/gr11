package gr11programming;

import java.util.Scanner;
public class Hangman {

	/**
	 * Displays the appropriate ASCII art Hangman image
	 * @param incorrectGuess	The count of how many wrong guesses were made
	 */
	static void showHangman(int incorrectGuess) {
		String hangman = "";
		switch(incorrectGuess) {
		case 0:
			hangman = """
					 +--+
					 |  |
					    |
					    |
					    |
					    |
					=====
					""";
			break;
		case 1:
			hangman = """
			 +--+
			 |  |
			 O  |
			    |
			    |
			    |
			=====
			""";
			break;
		case 2:
			hangman = """
			 +--+
			 |  |
			 O  |
			 |  |
			    |
			    |
			=====
			""";
			break;
		case 3:
			hangman = """
			 +--+
			 |  |
			 O  |
			/|  |
			    |
			    |
			=====
			""";
			break;
		case 4:
			hangman = """
			 +--+
			 |  |
			 O  |
			/|\\ |
			    |
			    |
			=====
			""";
			break;
		case 5:
			hangman = """
			 +--+
			 |  |
			 O  |
			/|\\ |
			/   |
			    |
			=====
			""";
			break;
		case 6:
			hangman = """
			 +--+
			 |  |
			 O  |
			/|\\ |
			/ \\ |
			    |
			=====
			""";
			break;
		default:
			hangman = "Oops, something went wrong.";
		}
		System.out.println(hangman);
		
	}//end showHangman()
	
	
	public static void main(String[] args) {
		//Setup objects and variables for the game
		Scanner input = new Scanner(System.in);
		int incorrectGuess = 0;	//Counts number of incorrect Guesses
		String missedLetters = "";	// Stores a list of all incorrectly guessed letters
		char guess; //for storing the user's guessed letters
		SecretWord secret = new SecretWord();	//the secret word to be guessed in the game
		
		//Welcome and Rules
		System.out.println("Welcome to Hangman!");
		System.out.println("I've thought of a secret word. You have to try and guess it one letter at a time.");
		System.out.println("If you're right, I'll update the clue. If you're wrong, I add a piece to the picture.");
		System.out.println("If you guess all the letters in the word before you hang the man, you win!\n");
		
		//Main game loop
		while (incorrectGuess < 7) {
			showHangman(incorrectGuess);
			if (incorrectGuess == 6) {
				//You've hanged the man, so game over!
				System.out.println("You've hanged the man - you lose!");
				System.out.println("The secret word was: " + secret.getWord());
				break;
			}
			
			//We play a round if the player hasn't yet lost
			
			//Display the missed letters
			System.out.println("\nMissed Letters: " + missedLetters);
			
			//Display the clue
			secret.displayClue();
			
			//Get the user's guess and check if it is in secret word or not. Update clue and missedLetters accordingly.
			System.out.print("Guess a letter: ");
			String temp = input.next();	// read the input as a String because we can't read in a char
			temp = temp.toUpperCase();	// convert the input to uppercase
			guess = temp.charAt(0);	//take the first character of string as a char data type
			/*
			 * You could also do:
			 * guess = input.next().toUpperCase().charAt(0);
			 */
			
			if (secret.guessedLetterInWord(guess) ) {
				//If the letter guessed was correct, update the clue
				secret.updateClue(guess);
				if (secret.checkWin() ) {
					//Player has guessed ALL the correct letters
					System.out.println("That's it! The secret word was " + secret.getWord());
					System.out.println("You Win!!");
					break;
				}
			} else {
				//Guessed letter was incorrect. Update missedLetters and incorrectGuess count
				missedLetters += String.valueOf(guess) + " ";
				incorrectGuess++;
			}
		}//end while
		
		System.out.println("GAME OVER - Thanks for playing!");
		input.close();

	}//end main()

}//end class Hangman
