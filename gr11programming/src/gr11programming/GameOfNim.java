package gr11programming;
/*
 * GameOfNim.java
 * Julie Pham
 * 11/21/22
 */
import java.util.*;
public class GameOfNim {

	public static void main(String[] args) {
		// Random and Scanner objects
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		//Welcome and Rules of the Game
		System.out.println("Welcome to the game of Nim.");
		System.out.println("There will be 15 - 30 stones selected for a game.");
		System.out.println("You will take turns with your opponent drawing stones. Whomever draws the last stone loses.");
		System.out.println("You can draw 1, 2, or 3 stones. You cannot draw more stones than there are left in the game.");
		
		boolean play = true;	//true to play, false to quit
		
		//Main Game Loop
		while (play) {
			//Choose 15 - 30 stone at random for a new game
			int numStones = rand.nextInt(15) + 15;
			System.out.println("-------------------------------------------------------------------------------------\n");
			
			/*
			 * Players take turns drawing stones. After each turn, check to see if the player drew the last stone or not
			 * If the player drew the last stone, they lose the game. Otherwise, play moves to the other player.
			 */
			while (true) {
				//The user's move. Check to see if they've drawn the last stone or not
				numStones = playerDraw(numStones);
				if (checkLoss(numStones)) {
					System.out.println("You took the last stone - you lose!");
					break;
				}
				
				//The computer's move. Check to see if they've drawn the last stone or not
				numStones = compDraw(numStones);
				if (checkLoss(numStones)) {
					System.out.println("Your opponent took the last stone - you win!");
					break;
				}
			}
			//Determine if the player would like another round. If not, exit the program
			System.out.print("Would you like to play again? Press Q to quit: ");
			String again = sc.next();
			if (again.equals("Q") || again.equals("q")) play = false;
			
		}
		sc.close();
		System.out.println("-------------------------------------------------------------------------------------\n");
		System.out.println("\nThanks for playing!");
	}
	
	/**
	 * Simulates the player's turn
	 * @param numStones	The int number of stones left in the game
	 * @return	The updated value of stones after the player has made their draw
	 */
	static int playerDraw(int numStones) {
		Scanner sc = new Scanner(System.in);
		int draw;
		while (true) {
			System.out.print("There are " + numStones + " left. How many would you like? ");
			draw = sc.nextInt();
			if (isValidMove(numStones, draw)) {
				break;
			} else {
				System.out.println("Invalid - You can only draw 1, 2, or 3 stones, and your draw must be less than " + numStones);
			}
		}
		numStones -= draw;
		return numStones;
	}
	
	/**
	 * Simulates the opponent's turn
	 * @param numStones	The int number of stones left in the game
	 * @return	The updated value of stones after the opponent has made their draw
	 */
	static int compDraw(int numStones) {
		Random r = new Random();
		int draw;
		do {
			draw = r.nextInt(3) + 1;
		} while (!isValidMove(numStones, draw));
		System.out.println("There are " + numStones + ". Your opponent takes " + draw + " stones.");
		numStones -= draw;
		return numStones;
	}
	
	
	/**
	 * Determines if the player is making a valid draw. Can only draw 1, 2, 3 stones, and no more than numStones
	 * @param numStones	The int number of stones left in the game
	 * @param draw	The int number of stones the player wants to draw
	 * @return	Return true if the move is valid, false otherwise.
	 */
	static boolean isValidMove(int numStones, int draw) {
		if (draw < 1 || draw > 3) return false;
		else if (draw > numStones) return false;
		return true;
	}
	
	
	/**
	 * Checks to see if the player has drawn the last stone from the game
	 * @param numStones	The number of stones left in the game
	 * @return	Returns True if there are no stones left, false otherwise
	 */
	static boolean checkLoss(int numStones) {
		if (numStones <= 0) return true;
		else return false;
	}

}
