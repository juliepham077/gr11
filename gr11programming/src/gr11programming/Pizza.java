package gr11programming;
/*Pizza.java
09/30/22
Julie Pham
 */
import java.util.Scanner;
import java.lang.Math;
public class Pizza {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double s, m, l, xl, MTL, LABOR, RENT, total, ns, nm, nl, nxl;
		MTL = 0.05;
		s = 8;
		m = 12;
		l = 16;
		xl = 18;
		LABOR = 0.75;
		RENT = 1.00;
		System.out.println("Welcome to Perfect Pizza!");
		System.out.print("# of small pizzas: ");
		ns = input.nextDouble();
		System.out.print("# of medium pizzas: ");
		nm = input.nextDouble();
		System.out.print("# of large pizzas: ");
		nl = input.nextDouble();
		System.out.print("# of extra large pizzas: ");
		nxl = input.nextDouble();
		input.close();
		total = MTL*(ns*Math.pow(s, 2)+nm*Math.pow(m, 2)+nl*Math.pow(l, 2)+nxl*Math.pow(xl, 2)) + LABOR + RENT;
		System.out.print("Your total is: " + total);
	}
}
