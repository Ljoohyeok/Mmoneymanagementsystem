package Mmoneymanagementsystem;   

import java.util.Scanner;   

public abstract class SSAaccounts extends Accounts {
	
	public void getInformation(Scanner input) {
		System.out.print("Write SSA account number : ");
		int accname = input.nextInt();
		this.SetAccount(accname);
		System.out.print("Income money : ");
		int income = input.nextInt();
		this.SetIncome(income);
		System.out.print("Spend money : ");
		int spend = input.nextInt();
		this.SetSpend(spend);
		System.out.print("Saving money : ");
		int saving = input.nextInt();
		System.out.println();
		this.SetSaving(saving);
	}
}
