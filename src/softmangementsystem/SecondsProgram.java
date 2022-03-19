package softmangementsystem;

import java.util.Scanner;

public class SecondsProgram {

	public static void main(String[] args) {
		int seconds = 100000;
		int days = (int)(seconds/86400);
		int hours = (int)(seconds/3600);
		int minutes = (int)(seconds/60);
		
		Scanner input = new Scanner(System.in);
		System.out.print("1에서 4까지의 숫자중 하나를 입력하세요 : ");
		int number = input.nextInt();
		
		switch (number) {
		case 1:
			System.out.printf("10만 초는 약%d일 입니다", days);
			break;
		case 2:
			System.out.printf("10만 초는 약%d시간 입니다", hours);
			break;
		case 3:
			System.out.printf("10만 초는 약%d분 입니다", minutes);
			break;
		case 4:
			System.out.printf("10만 초는 %d초 입니다", seconds);
			break;
		default:
			System.out.print("범위를 벗어난 숫자입니다");
		}

	}

}
