package gr11programming;
/*volume.java
Julie Pham
09/27/22
*/
import java.util.Scanner;
import java.lang.Math;
public class volume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Calculate volume of prism:");
		double length, width, height;
	    double ans;
	    System.out.print("Enter the length: ");
	    length = input.nextDouble();
	    System.out.print("Enter the width: ");
	    width = input.nextDouble();
	    System.out.print("Enter the height: ");
	    height = input.nextDouble();
	    input.close();
	    ans = length * width * height;
	    System.out.print("The volume is: " + ans);
	    
	}

}