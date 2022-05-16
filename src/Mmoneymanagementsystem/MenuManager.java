package Mmoneymanagementsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager moneyMng = new AccountManager(input);
        selectingMenu(input, moneyMng);
       
    }
    
    public static void selectingMenu(Scanner input, AccountManager moneyMng) {
    	int number = 0;
		while (number != 5) {
			try {
				showingMenu();
				number = input.nextInt();
				switch(number) {
        		case 1 :
        			moneyMng.addAccount();
        			break;
        		case 2 :
        			moneyMng.deleteAccount();
        			break;
        		case 3 :
        			moneyMng.editAccount();
        			break;
        		case 4 :
        			moneyMng.viewAccount();
        			break;
        		default :
        			continue;
				}
	    
				if(number == 1) {
        		
				}
				else if(number == 2) {
        		
				}
				else if(number == 3) {
        		
				}
				else if(number == 4) {
        		
				}
				else {
        		
        		}
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter integer number");
				if (input.hasNext()) {
					input.next();
				}
				number = -1;
			}
        }
    }
    
    public static void showingMenu() {
    	System.out.println("### Account Management System Menu ###");
    	System.out.println("1. Add account");
    	System.out.println("2. Delete account");
    	System.out.println("3. Edit account");
    	System.out.println("4. View accounts");
    	System.out.println("5. Exit");
    	System.out.print("Select number between 1 - 5 : ");
    }
}