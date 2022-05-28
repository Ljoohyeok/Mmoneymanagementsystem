package Mmoneymanagementsystem;    

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager moneyMng = getObject("moneyMng.ser");
        if (moneyMng == null) {
        	moneyMng = new AccountManager(input);
        }
        
        selectingMenu(input, moneyMng);
        putObject(moneyMng, "moneyMng.ser");
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
        			logger.log("add account");
        			break;
        		case 2 :
        			moneyMng.deleteAccount();
        			logger.log("delete account");
        			break;
        		case 3 :
        			moneyMng.editAccount();
        			logger.log("edit account");
        			break;
        		case 4 :
        			moneyMng.viewAccount();
        			logger.log("view account");
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
    
    public static AccountManager getObject(String filename) {
    	AccountManager moneyMng = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			moneyMng = (AccountManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return moneyMng;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return moneyMng;
    }
    
    public static void putObject(AccountManager moneyMng, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(moneyMng);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}