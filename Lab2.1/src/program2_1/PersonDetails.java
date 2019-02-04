package program2_1;
import java.util.Scanner;
public class PersonDetails {
	private static Scanner input;

	public static void main(String args[]) {
		input = new Scanner(System.in);
		System.out.println("Enter person Details: ");
		System.out.print("First name: ");
		String fName=input.nextLine();
		System.out.print("Last name: ");
		String lName=input.nextLine();
		System.out.print("Gender: ");
		String gender=input.nextLine();
		System.out.print("Age: ");
		String age=input.nextLine();
		System.out.print("Weight: ");
		String weight=input.nextLine();
		System.out.println("Person Details:\n---------------");
		System.out.println("First name: " + fName);
		System.out.println("Last name: " + lName);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
	}

}
