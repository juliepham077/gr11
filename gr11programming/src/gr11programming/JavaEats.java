package gr11programming;

import java.util.Scanner;

/*JavaEats.java
 Julie Pham
 09/29/22 
 */

public class JavaEats{
public static void main(String[] args) {
		System.out.println("Welcome to Java Eats!");
		System.out.println("=======================");
		System.out.println("Let’s get your order together for you. "
				+ "Please indicate how many of each food item you would like to order. "
				+ "If you do not want an item, please enter 0. \n");
		System.out.println("Options:");
		System.out.println("=======================");
		Scanner input = new Scanner(System.in);
		double burger, rice, salad, pizza, drinks, total;
		double TAX = 1.13;
		double DEV = 5.00;
		System.out.print("Cheeseburger and Fries:");
		burger = input.nextDouble();
		System.out.print("Falafel and Rice Plate:");
		rice = input.nextDouble();
		System.out.print("Greek Salad Supreme:");
		salad = input.nextDouble();
		System.out.print("Personal Pizza:");
		pizza = input.nextDouble();
		System.out.print("Drinks:");
		drinks = input.nextDouble();
		input.close();
		total = ((8.99*burger)+(9.99*rice)+(8.49*salad)+(7.99*pizza)+(2.49*drinks))*TAX + DEV;
		System.out.println("With tax and delivery, your order total is $" +total);
		System.out.println("\nThank you for ordering with Java Eats!");
	}

}
