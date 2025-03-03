package gr11programming;
/*
CodingAssignment1.java
Julie Pham
10/06/22
User chooses from 8 math operations and inputs 1 or 2 numbers, program performs the operation.
 */
import java.util.Scanner;
import java.lang.Math;
public class CodingAssignment1 {

	public static void main(String[] args) {
		//Welcome user to program
		System.out.println("WELCOME TO THE SIMPLE CALCULATOR APPLICATION");
		System.out.println("=============================================");
		//List of operations
		System.out.println("1. Addition \t\t 5.Exponentation");
		System.out.println("2. Subtraction \t\t 6.Square Root");
		System.out.println("3. Multiplication \t 7.Sine");
		System.out.println("4. Division \t\t 8.Cosine");
		System.out.println("=============================================");
		Scanner input = new Scanner(System.in);
		//Ask user to choose operation
		System.out.print("Which operation would you like to perform? Please enter an integer.");
		int operation = input.nextInt(); //Collects choice as integer value
		System.out.println("=============================================");
		//If choice is from Addition to Exponents, then ask user for 2 integers
			if (operation <= 5 && operation >= 1) {
			System.out.print("Enter the first number: ");
			double num1 = input.nextDouble();
			System.out.print("Enter the second number: ");
			double num2 = input.nextDouble();
			switch (operation) {
			case 1:
				double addition = num1 + num2;
				System.out.println("The sum is: " + addition);
				break;
			case 2:
				double subtraction = num1 - num2;
				System.out.println("The difference is: " + subtraction);
				break;
			case 3:
				double multiplication = num1 * num2;
				System.out.println("The product is: " + multiplication);
				break;
			case 4:
				double division = num1 / num2;
				System.out.println("The quotient is: " + division);
				break;
			case 5:
				double pow = Math.pow(num1, num2);
				System.out.println("The answer is: " + pow);
				break;
			}
			}
			//If operation choice is Square Root, Sine, or Cosine, user only enters 1 number
			else if (operation >= 6 && operation <= 8) {
				System.out.print("Enter the first number: ");
				double num1 = input.nextDouble();
				switch (operation) {
				case 6:
					double sqrt = Math.sqrt(num1);
					System.out.println("The square root of " + num1 + " is: " + sqrt);
					break;
				case 7:
					double sin = Math.sin(Math.toRadians(num1));
					System.out.println("The answer is: " + sin);
					break;
				case 8:
					double cos = Math.cos(Math.toRadians(num1));
					System.out.println("The answer is: " + cos);
					break;
				}
	}
			else {
				System.out.print("Invalid choice");
			}
			input.close();
}
}
