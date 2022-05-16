package Mmoneymanagementsystem;

import java.util.Scanner;

public class SSCaccountPerson extends Accounts {
	
	public SSCaccountPerson(AccountKinds kind) {
		super(kind);
	}

	public void getInformation(Scanner input) {
		System.out.print("Account number : ");
		int accname = input.nextInt();
		System.out.print("Income money : ");
		int income = input.nextInt();
		System.out.print("Spend money : ");
		int spend = input.nextInt();
		System.out.print("Saving money : ");
		int saving = input.nextInt();
		System.out.println();
		this.SetAccount(accname);
		this.SetIncome(income);
		this.SetSpend(spend);
		this.SetSaving(saving);
	}

	@Override
	public void AccountInfo (Scanner input) {
		
	}
	
	public void PrintInformations() {
		System.out.println("Account : " + accname);
		System.out.println("Income money : " + income);
		System.out.println("Spend money : " + spend);
		System.out.println("Saving money : " + saving);
		System.out.println();
	}
}
