package gr11programming;
/*calculator.java
Julie Pham
09/27/22
*/
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		int ans;
		int rAns;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first interger: ");
		num1 = input.nextInt();
		System.out.print("Enter the second interger: ");
		num2 = input.nextInt();
		input.close();
		ans = num1 + num2;
		System.out.println("The sum of these numbers is: " + ans);
		ans = num1 - num2;
		System.out.println("The difference of these numbers is: " + ans);
		ans = num1 * num2;
		System.out.println("The product of these numbers is: " + ans);
		ans = num1 / num2;
		rAns = num1 % num2;
		System.out.println("The quotient of these numbers is: " + ans + "R" + rAns);
	}
}
