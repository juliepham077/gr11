package gr11programming;
/*
 * PrimeNumbers.java
 * Julie Pham
 * 10/12/22
 */
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		input.close();
		int factors = 0;
		for (int i = 1; i <= num; ++i) {
			int rem = num % i;
			if (rem == 0) {
				++factors;
			}
		}
		if (factors == 2) {
			System.out.println("Prime!");
		}
		else {
			System.out.println("Not prime!");
		}
	}

}
