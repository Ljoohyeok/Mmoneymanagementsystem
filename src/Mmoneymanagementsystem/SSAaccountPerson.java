package Mmoneymanagementsystem;  

import java.io.Serializable;  
import java.util.Scanner;

public class SSAaccountPerson extends Accounts implements Serializable {
	private static final long serialVersionUID = 8043004194754003713L;

	public SSAaccountPerson(AccountKinds kind) {
		super(kind);
	}
	
	
	@Override
	public void AccountInfo(Scanner input) {
		
	}
	
	public void PrintInformations() {
		System.out.println("Account : " + accname);
		System.out.println("Income money : " + income);
		System.out.println("Spend money : " + spend);
		System.out.println("Saving money : " + saving);
		System.out.println();
	}
}
