package gr11programming;
/*
StellarWeights.java
Julie Pham
10/05/22
 */
import java.util.Scanner;
public class StellarWeights {

	public static void main(String[] args) {
		double mass, newton, weight;
		String planet;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight (kg): ");
		mass = input.nextDouble();
		newton = mass * 9.81;
		System.out.print("Choose a planet (Vulcan, Cybertron, Kryton, Alderaan): ");
		planet = input.nextLine();
		input.close();
		if (planet.equals("Vulcan")) {
		weight = newton *0.091;
		System.out.print("Your weight on " + planet + " is " + weight);
		} else if (planet.equals("Cybertron")) {
			weight = newton *4.612;
			System.out.print("Your weight on " + planet + " is " + weight);
		} else if (planet.equals("Kryton")) {
			weight = newton *0.720;
			System.out.print("Your weight on " + planet + " is " + weight);
		} else if (planet.equals("Alderaan")) {
			weight = newton *0.643;
			System.out.print("Your weight on " + planet + " is " + weight);
		} else {
			System.out.print("Your planet is invalid (first letter must be capitalized)");
		}
		
	}

}
