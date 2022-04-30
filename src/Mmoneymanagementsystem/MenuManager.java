package Mmoneymanagementsystem;

import java.util.Scanner;

public class MoneyManagement {

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
	    if(number == 1) {
		mytotalmoney();
	    }
	    else if(number == 2) {
		incomemoney();
	    }
	    else if(number == 3) {
		spendingmoney();
	    }
	    else if(number == 4) {
		savingmoney();
	    }
	}
		
    }
	
    public static void mytotalmoney() {
	Scanner input = new Scanner(System.in);
	System.out.print("Total Money : ");
	int totalmoney = input.nextInt();
	System.out.println(totalmoney);
	System.out.println();
    }
    public static void incomemoney() {
	Scanner input = new Scanner(System.in);
	System.out.print("Total Money : ");
	int totalmoney = input.nextInt();
	System.out.println(totalmoney);
	System.out.print("Income : ");
	int incomemoney = input.nextInt();
	System.out.println(incomemoney);
	System.out.print("Total : ");
	System.out.println(totalmoney + incomemoney);
	System.out.println();
    }
    public static void spendingmoney() {
	Scanner input = new Scanner(System.in);
	System.out.print("Total Money : ");
	int totalmoney = input.nextInt();
	System.out.println(totalmoney);
	System.out.print("Spending : ");
	int spendmoney = input.nextInt();
	System.out.println(spendmoney);
	System.out.print("Total : ");
	System.out.println(totalmoney - spendmoney);
	System.out.println();
    }
    public static void savingmoney() {
	Scanner input = new Scanner(System.in);
	System.out.print("Total Money : ");
	int totalmoney = input.nextInt();
	System.out.println(totalmoney);
	System.out.print("Saving Money1 : ");
	int saving1 = input.nextInt();
	System.out.println(saving1);
	System.out.print("Saving Money2 : ");
	int saving2 = input.nextInt();
	System.out.println(saving2);
	System.out.print("Total Saving Money : ");
	System.out.println(saving1 + saving2);
	System.out.print("Total : ");
	System.out.println(totalmoney + saving1 + saving2);
	System.out.println();
    }

}