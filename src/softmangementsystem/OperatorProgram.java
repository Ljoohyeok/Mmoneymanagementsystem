package softmangementsystem;

import java.util.Scanner;

public class OperatorProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("4���� �����ڰ� �ֽ��ϴ�. (+, -, *, /)");
		System.out.print("���� 2�� : ");
		int x = input.nextInt();
		int y = input.nextInt();
		int result;
		
		int number = input.nextInt();
		switch(number) {
		case 1 :
			result = x + y;
			System.out.printf("%d + %d �� ����� %d�Դϴ�", x, y, result);
			break;
		case 2 :
			result = x - y;
			System.out.printf("%d - %d �� ����� %d�Դϴ�", x, y, result);
			break;
		case 3 :
			result = x * y;
			System.out.printf("%d * %d �� ����� %d�Դϴ�", x, y, result);
			break;
		case 4 :
			result = x / y;
			System.out.printf("%d / %d �� ����� %d�Դϴ�", x, y, result);
			break;
		default :
			System.out.print("�߸� �Է��Ͽ����ϴ�");
		}
	}

}
