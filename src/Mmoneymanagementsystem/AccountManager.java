package Mmoneymanagementsystem;    

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountManager implements Serializable {
	private static final long serialVersionUID = -8144201475895774259L;
	
	ArrayList<Accounts> account = new ArrayList<Accounts>();
	
	public ArrayList<Accounts> getList() {
		return account;
	}
	
	transient Scanner input;
	AccountManager(Scanner input){
		this.input = input;
	}
	
	public void addAccount(Accounts accounting) {
		account.add(accounting);
	}

	public void menuAccount() {
		System.out.println("1) SSA account");
		System.out.println("2) SSB account");
		System.out.println("3) SSC account");
		System.out.print("Choose number between 1 - 3 : ");
	}
	    
	public void deleteAccount(Scanner input) {
		System.out.print("Write Account number : ");
		int accname = input.nextInt();
		int index  = findingIndex(accname);
		removeAccount(index, accname);
	}
	
	public int findingIndex(int accname) {
		int index  = -1;
		for (int i = 0; i<account.size(); i++) {
			if (account.get(i).getAccname() == accname) { 
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removeAccount(int index, int accname) {
		if (index >= 0) {
			account.remove(index);
			System.out.println("Account " + accname + " is deleted");
			System.out.println();
			return 0;
		}
		else {
			System.out.println("Account hasn't been registered");
			System.out.println();
			return -1;
		}
	}
	    
	public void editAccount(Scanner input) {
		System.out.println("Write Account number : ");
		int accname = input.nextInt();
		for(int i = 0; i<account.size(); i++) {
			Accounts acc = account.get(i);
			if (acc.AccountNumbers() == accname) {
				int num = -1;
				while (num != 4) {
					showingEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1 :
						incomeAccount(acc, input);
						break;
					case 2 :
						spendAccount(acc, input);
						break;
					case 3 :
						savingAccount(acc, input);
						break;
					default :
						continue;
					}
					if (num == 1) {
						
					}
					else if (num == 2) {
						
					}
					else if (num == 3) {
						
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public int size() {
		return account.size();
	}
	
	public Accounts get(int index) {
		return account.get(index);
	}
	
	public void viewAccount(Scanner input) {
		for(int i = 0 ; i<account.size(); i++) {
			account.get(i).PrintInformations();
		}
	}
	
	public void incomeAccount(Accounts account, Scanner input) {
		System.out.print("Income money : ");
		int incomes = input.nextInt();
		account.SetIncome(incomes);
	}
	
	public void spendAccount(Accounts account, Scanner input) {
		System.out.print("Spend money : ");
		int spends = input.nextInt();
		account.SetSpend(spends);
	}
	
	public void savingAccount(Accounts account, Scanner input) {
		System.out.print("Saving money : ");
		int savings = input.nextInt();
		account.SetSaving(savings);
	}
	
	public void showingEditMenu() {
		System.out.println("### Account Editing Menu ###");
		System.out.println("1. Edit Income money");
		System.out.println("2. Edit Spend money");
		System.out.println("3. Edit Saving money");
		System.out.println("4. Exit");
		System.out.print("Select number between 1 - 4 : ");
	}
}
