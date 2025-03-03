package gr11programming;
import java.util.Random;
public class SecretWord {
	//class variables
	private static final String[] WORD_BANK = {"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", 
			  "CASE", "CATCH", "CHAR", "CLASS", "CONST",
			  "CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE", 
			  "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY",
			  "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", 
			  "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
			  "LONG", "NATIVE", "NEW", "NULL", "PACKAGE", 
			  "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			  "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", 
			  "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
			  "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE"};
	private static String word;
	private static char[] clue;
	static Random r = new Random();
	
	/**
	 * Constructor
	 * Chooses a secret word at random, then generates the clue for that word
	 */
	SecretWord() {
		int index = r.nextInt(WORD_BANK.length);
		word = WORD_BANK[index];	//selects secret word at random
		
		//Generate a clue of '_' of same length as word
		clue = new char[word.length()];
		for (int i = 0; i < clue.length; i++) {
			clue[i] = '_';
		}
	}//SecretWord()
	
	/**
	 * checks to see if user's guessed letter is in the secret word
	 * @param guess	char letter user has guessed
	 * @return Return true if guess in word, false otherwise.
	 */
	boolean guessedLetterInWord(char guess) {
		char[] letters = word.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == guess) return true;
			else continue;
		}
		return false;
	}//end guessedLetterInWord(char)
	
	/**
	 * If the guessed letter is in the clue, update it to include that letter
	 * @param guess	char letter the user has guessed.
	 */
	void updateClue(char guess) {
		if (guessedLetterInWord(guess)) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == guess) {
					clue[i] = guess;
				}
			}
		}
	}//end updateClue()
	
	/**
	 * Returns the value for word
	 * @return	Returns the value for word.
	 */
	String getWord() {
		return word;
	}//end getWord()
	
	/**
	 * Prints out the value of clue for the user to see
	 */
	void displayClue() {
		for (int i = 0; i < clue.length; i++) {
			System.out.print(clue[i] +  " ");
		}
		System.out.println();
	}//end displayClue()
	
	/**
	 * Checks to see if the user has guessed all letters in the secret word.
	 * @return	Returns true if all letters have been guessed, false otherwise.
	 */
	boolean checkWin() {
		if (word.equals(String.valueOf(clue))) return true;
		else return false;
	}//end checkWin()
	
}

