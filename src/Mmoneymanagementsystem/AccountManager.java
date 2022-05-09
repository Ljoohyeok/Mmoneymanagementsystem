package Mmoneymanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	ArrayList<Accounts> account = new ArrayList<Accounts>();
	Scanner input;
	AccountManager(Scanner input){
		this.input = input;
	}
	
	public void addAccount() {
		Accounts accounting;
		int accnum = 0;
		while(accnum != 1 && accnum != 2 && accnum != 3) {
			System.out.println("1) SSA account");
			System.out.println("2) SSB account");
			System.out.println("3) SSC account");
			System.out.print("Choose number between 1 - 3 : ");
			
			accnum = input.nextInt();
			
			if (accnum == 1) {
				accounting = new SSAaccountPerson(AccountKinds.SSAaccount);
				accounting.getInformation(input);
				account.add(accounting);
			}
			
			else if (accnum == 2) {
				accounting = new SSBaccountPerson(AccountKinds.SSBaccount);
				accounting.getInformation(input);
				account.add(accounting);
			}
			
			else if (accnum == 3) {
				accounting = new SSCaccountPerson(AccountKinds.SSCaccount);
				accounting.getInformation(input);
				account.add(accounting);
			}
			
			else {
				System.out.println("Enter a number between 1 - 3");
			}
		}
	}
	    
	public void deleteAccount() {
		System.out.print("Write Account number : ");
		int accname = input.nextInt();
		int index  = -1;
		for (int i = 0; i<account.size(); i++) {
			if (account.get(i).getAccname() == accname) { 
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			account.remove(index);
			System.out.println("Account " + accname + " is deleted");
			System.out.println();
		}
		else {
			System.out.println("Account hasn't been registered");
			System.out.println();
			return;
		}
	}
	    
	public void editAccount() {
		System.out.println("Write Account number : ");
		int accname = input.nextInt();
		for(int i = 0; i<account.size(); i++) {
			Accounts acc = account.get(i);
			if (acc.AccountNumbers() == accname) {
				int num = -1;
				while (num != 4) {
					System.out.println("### Account Editing Menu ###");
					System.out.println("1. Edit Income money");
					System.out.println("2. Edit Spend money");
					System.out.println("3. Edit Saving money");
					System.out.println("4. Exit");
					System.out.print("Select number between 1 - 4 : ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Income money : ");
						int incomes = input.nextInt();
						acc.SetIncome(incomes);
					}
					else if (num == 2) {
						System.out.print("Spend money : ");
						int spends = input.nextInt();
						acc.SetSpend(spends);
					}
					else if (num == 3) {
						System.out.print("Saving money : ");
						int savings = input.nextInt();
						acc.SetSaving(savings);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewAccount() {
		for(int i = 0 ; i<account.size(); i++) {
			account.get(i).PrintInformations();
		}
	}
}
