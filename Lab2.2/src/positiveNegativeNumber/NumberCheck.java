package positiveNegativeNumber;
import java.util.Scanner;
public class NumberCheck {
	private static Scanner input;

	public static void main(String args[]) {
		input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		float number=input.nextFloat();
		if(number>=0) {
			System.out.print("Number is positive.");
		}
		else {
			System.out.print("Number is negative");
		}
	}

}
