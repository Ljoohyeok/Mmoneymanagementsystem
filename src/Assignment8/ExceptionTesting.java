package Assignment8;

import java.util.Scanner;

public class ExceptionTesting {
	public static void main (String[] args) {
		try {
			int number = getNumber2();
		}
		catch (MyException e) {
			System.out.println("This number is odd number");
		}
		finally {
			System.out.println("Program end");
		}
	}

	public static int getNumber2() throws MyException {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num %2 != 0) {
			throw new MyException();
		}
		return num;
	}
}
