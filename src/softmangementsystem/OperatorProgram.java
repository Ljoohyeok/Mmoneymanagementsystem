package softmangementsystem;

import java.util.Scanner;

public class OperatorProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("4개의 연산자가 있습니다. (+, -, *, /)");
		System.out.print("정수 2개 : ");
		int x = input.nextInt();
		int y = input.nextInt();
		int result;
		
		int number = input.nextInt();
		switch(number) {
		case 1 :
			result = x + y;
			System.out.printf("%d + %d 의 결과는 %d입니다", x, y, result);
			break;
		case 2 :
			result = x - y;
			System.out.printf("%d - %d 의 결과는 %d입니다", x, y, result);
			break;
		case 3 :
			result = x * y;
			System.out.printf("%d * %d 의 결과는 %d입니다", x, y, result);
			break;
		case 4 :
			result = x / y;
			System.out.printf("%d / %d 의 결과는 %d입니다", x, y, result);
			break;
		default :
			System.out.print("잘못 입력하였습니다");
		}
	}

}
