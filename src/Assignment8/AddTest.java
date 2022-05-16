package Assignment8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddTest {
	public static void main (String[] args) {
		try {
			int number = getNumber1();
		}
		catch (InputMismatchException e) {
			System.out.println("Please enter number");
		}
		finally {
			System.out.println("Program end");
		}
	}

	public static int getNumber1() throws InputMismatchException {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println(x + y);
		return x + y;
	}
}
