package softmangementsystem;

import java.util.Scanner;

public class MoneyProgram {

	public static void main(String[] args) {
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		while (number != 6) {
			System.out.println("1. My total money");
			System.out.println("2. Income money");
			System.out.println("3. Spending money");
			System.out.println("4. Saving money");
			System.out.println("5. Showing menu");
			System.out.println("6. Exit");
			number = input.nextInt();
			if (number == 1) {
				System.out.print("money : ");
				int money1 = input.nextInt();
				System.out.printf("Total money : %d", money1);
				System.out.println();
			}
			else if (number == 2) {
				System.out.print("total money : ");
				int money1 = input.nextInt();
				System.out.print("Income : ");
				int money2 = input.nextInt();
				System.out.printf("Total money : %d", money1+money2);
				System.out.println();
			}
			else if (number == 3) {
				System.out.print("total money : ");
				int money1 = input.nextInt();
				System.out.print("Speding : ");
				int money3 = input.nextInt();
				System.out.printf("Total money : %d", money1-money3);
				System.out.println();
			}
			else if (number == 4) {
				System.out.print("total money : ");
				int money1 = input.nextInt();
				System.out.print("Saving moeny1 : ");
				int save1 = input.nextInt();
				System.out.print("Saving money2 : ");
				int save2 = input.nextInt();
				System.out.printf("Total saving money : %d", save1+save2);
				System.out.println();
				System.out.printf("Total money : %d", money1+save1+save2);
				System.out.println();
			}
				
		}
		
    }

}