package gr11programming;
/*
 * Julie Pham
 * Registration.java
 * Student Registration list
 * 12/16/2022
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Registration {
// declare registration as a global variable
static ArrayList<Student> registration = new ArrayList<Student>();

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	boolean run = true;
	//Main loop
	while (run) {
		
		//Main Menu
		System.out.println();
		System.out.print("""
				[1] Enroll a Student
				[2] Display All Student Information
				[3] Quit
				Choose Option: """);
		int option = input.nextInt();
		System.out.println();
		
		//Run option
		switch(option) {
			case 1:	//Collect student info and add to registration list
				String first, last, id, login;
				System.out.print("Enter first name: ");
				first = input.next();
				System.out.print("Enter last name: ");
				last = input.next();
				System.out.print("Enter ID number: ");
				id = input.next();
				login = last.substring(0,4) + first.charAt(0) + id.substring(0,3);
				Student info = new Student(first, last, id, login);
				registration.add(info);
				break;
			case 2: //print all student information
				printRegList();
				break;
			case 3: //stop program
				run = false;
				System.out.print("You stopped the program.");
				break;
		}
	}
	input.close();
}
	//Print all student information
	static void printRegList() {
		System.out.println("==================================");
		for (Student info : registration) {
			System.out.println(info.getFirst() + " " + info.getLast() + "  ID: " + info.getId());
			System.out.println("Login: " + info.getLogin());
			System.out.println("==================================");
		}
	}
}

