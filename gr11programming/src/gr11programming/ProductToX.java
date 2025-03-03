package gr11programming;
/*
 * ProductToX.java
 * Julie Pham
 * 10/12/22
 */
import java.util.Scanner;
public class ProductToX {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		input.close();
		int total = 1;
		for (int i = 1; i <= x; ++i) {
			total *= i;
		}
		System.out.print("The product is: " + total);
	}

}

