package softmangementsystem;

import java.util.Scanner;

public class SecondsProgram {

	public static void main(String[] args) {
		int seconds = 100000;
		int days = (int)(seconds/86400);
		int hours = (int)(seconds/3600);
		int minutes = (int)(seconds/60);
		
		Scanner input = new Scanner(System.in);
		System.out.print("1���� 4������ ������ �ϳ��� �Է��ϼ��� : ");
		int number = input.nextInt();
		
		switch (number) {
		case 1:
			System.out.printf("10�� �ʴ� ��%d�� �Դϴ�", days);
			break;
		case 2:
			System.out.printf("10�� �ʴ� ��%d�ð� �Դϴ�", hours);
			break;
		case 3:
			System.out.printf("10�� �ʴ� ��%d�� �Դϴ�", minutes);
			break;
		case 4:
			System.out.printf("10�� �ʴ� %d�� �Դϴ�", seconds);
			break;
		default:
			System.out.print("������ ��� �����Դϴ�");
		}

	}

}
