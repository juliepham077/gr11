package gr11programming;
/*
 * SumToX.java
 * Julie Pham
 * 10/12/22
 */
import java.util.Scanner;
public class SumToX {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		int total = 0;
		for (int i = 1; i <= x; ++i) {
			System.out.println(i);
			total += i;
		}
		System.out.print("The sum is: " + total);
	}

}
