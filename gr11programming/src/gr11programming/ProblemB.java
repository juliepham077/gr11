package gr11programming;

/*
 * Julie Pham
 * ProblemB.java
 * 11/29/2022
 * 
 */
import java.util.*;
public class ProblemB {

	public static void main(String[] args) {
		Random rand = new Random();
		int numDice = 2;
		int[] roll = new int[13];//array for #of times the sum occurs
		int[] percent = new int[13];//array for percentage
		int count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0;//I couldn't simplify this, but this keeps tracks of how many times the sum occurs
		for (int time = 1; time <= 1000; time++) {//collects the sum of the dice and count the number of times it occurs
			if (sum(numDice) == 2) {//I don't know how to simplify this in a loop
				count2++;
			}
			if (sum(numDice) == 3) {
				count3++;
			}
			if (sum(numDice) == 4) {
				count4++;
			}
			if (sum(numDice) == 5) {
				count5++;
			}
			if (sum(numDice) == 6) {
				count6++;
			}
			
			if (sum(numDice) == 7) {
				count7++;
			}
			if (sum(numDice) == 8) {
				count8++;
			}
			if (sum(numDice) == 9) {
				count9++;
			}
			if (sum(numDice) == 10) {
				count10++;
			}
			if (sum(numDice) == 11) {
				count11++;
			}
			if (sum(numDice) == 12) {
				count12++;
			}
			
		}
			roll[2] = count2;//I'm stuck here.
			roll[3] = count3;
			roll[4] = count4;
			roll[5] = count5;
			roll[6] = count6;
			roll[7] = count7;
			roll[8] = count8;
			roll[9] = count9;
			roll[10] = count10;
			roll[11] = count11;
			roll[12] = count12;
			
			percent[2] = count2/10;//I'm stuck here.
			percent[3] = count3/10;
			percent[4] = count4/10;
			percent[5] = count5/10;
			percent[6] = count6/10;
			percent[7] = count7/10;
			percent[8] = count8/10;
			percent[9] = count9/10;
			percent[10] = count10/10;
			percent[11] = count11/10;
			percent[12] = count12/10;
			
			for (int i = 0; i < roll.length; i++) {
				System.out.print(i);
				System.out.print(" " + roll[i]);
				System.out.println(" " + percent[i] + "%");
			}
		}
	static int roll() {//rolls a random number
		Random rand = new Random();
		int roll = rand.nextInt(6) + 1;
		return roll;
	}
	static int sum(int numDice) {//I don't know why this doesn't work, it's supposed to collect the sum
		int total = 0;
		for (int i = 1; i <= numDice; i++) {
			total += roll();
		}
		return total;
	}
}