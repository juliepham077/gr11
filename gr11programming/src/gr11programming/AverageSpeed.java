package gr11programming;
/*AverageSpeed.java
Julie Pham
09/28/22
*/
import java.util.Scanner;
public class AverageSpeed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int km, hour;
		System.out.print("Distance travelled (in km): ");
		km = input.nextInt();
		System.out.print("Time taken (in hours): ");
		hour = input.nextInt();
		input.close();
		km /= hour;
		System.out.println("Average speed: " + km + " km/h");
	}

}
