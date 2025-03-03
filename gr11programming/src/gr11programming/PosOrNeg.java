package gr11programming;

import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = input.nextDouble();
		input.close();
		if (num >= 0) {
			if (num == 0) {
				System.out.println("it's neutral!");}
				else {
					System.out.println("it's positive!");
				}
			}
		else {
			System.out.println("it's negative!");
		}
	}
	

}
