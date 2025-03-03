package gr11programming;
/*
 * TestScores.java
 * Julie Pham
 * 10/13/22
 */

import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double score;
		double sum = 0.0;
		double num = 0.0;
		double avg;
		while (true) {
		System.out.print("Enter a test score (999 to quit): ");
		score = input.nextInt();
		if (score < 0) continue;
		else if (score == 999) break;
		sum += score;
		++num;
		}
		input.close();
		avg = sum/num;
		System.out.print("The average test score is: " + avg);

	}

}
