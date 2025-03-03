package gr11programming;
/*
 * GuessMe.java
 * Julie Pham
 * 10/11/22
 * 
 */
import java.util.Random;
public class GuessMe {

	public static void main(String[] args) {
		int guessMe = 7, num;
		Random rand = new Random();
		do {
		      num = rand.nextInt(10)+ 1;
		      System.out.println("Guess: " + num);
		      if (num < guessMe) {
		    	  System.out.println("Too low!");
		      }
		      else if (num > guessMe) {
		    	  System.out.println("Too high!");
		      }
		} while (num != guessMe);
		System.out.println("found it!");
		
		
	}

}
