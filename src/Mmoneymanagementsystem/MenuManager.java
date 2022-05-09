package Mmoneymanagementsystem;

import java.util.Scanner;

public class MenuManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager moneyMng = new AccountManager(input);
        int number = 0;
		
        while (number != 5) {
        	System.out.println("### Account Management System Menu ###");
        	System.out.println("1. Add account");
        	System.out.println("2. Delete account");
        	System.out.println("3. Edit account");
        	System.out.println("4. View accounts");
        	System.out.println("5. Exit");
        	System.out.print("Select number between 1 - 5 : ");
        	number = input.nextInt();
	    
        	if(number == 1) {
        		moneyMng.addAccount();
        	}
        	else if(number == 2) {
        		moneyMng.deleteAccount();
        	}
        	else if(number == 3) {
        		moneyMng.editAccount();
        	}
        	else if(number == 4) {
        		moneyMng.viewAccount();
        	}
        	else {
        		continue;
        	}
        }
    }
}