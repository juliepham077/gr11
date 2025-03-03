package gr11programming;
/*
 * RPS.java
 * Julie Pham
 * 10/14/22
 * Rock, paper, scissor game
 */
import java.util.*;
public class RPS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Let’s Play Rock Paper Scissors!!");
		System.out.println("================================");
		String again;
		boolean play = true;
		int user, comp = rand.nextInt(3) + 1;
		while (true) {
		System.out.println("\nChoose your throw: 1 = ROCK, 2 = PAPER, 3 = SCISSORS");
		System.out.print("Your choice: \n");
		user = input.nextInt();
		switch (user) {
		case 1:
			System.out.println("ROCK vs... ");
			break;
		case 2:
			System.out.println("PAPER vs... ");
			break;
		case 3:
			System.out.println("SCISSORS vs... ");
			break;
			}
		switch (comp) {
		case 1:
			System.out.println("ROCK!");
			break;
		case 2:
			System.out.println("PAPER!");
			break;
		case 3:
			System.out.println("SCISSORS!");
			break;
			}
		if (user == comp) {
			System.out.println("Tie.");
		}
		else if ((user == 1 && comp == 3) || (user == 2 && comp == 1) || (user == 3 && comp == 2)) {
			System.out.println("You win.");
			}
		else {
			System.out.println("You lose.");
		}
		while (play)
		System.out.print("Would you like to play again? [y]es or [n]o: ");
		again = input.next();
		if (again.equals("y"))
			play=true;
		if (again.equals("n")) {
			break;
		}
		}
		input.close();
		System.out.print("Thanks for playing!");
	}
}

