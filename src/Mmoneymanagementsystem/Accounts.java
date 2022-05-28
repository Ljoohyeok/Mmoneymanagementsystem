package Mmoneymanagementsystem; 
  
import java.io.Serializable;
import java.util.Scanner;

public abstract class Accounts implements AccountInfo, Serializable {
	protected AccountKinds kind = AccountKinds.SSAaccount;
	
	public AccountKinds getKind() { 
		return kind;
	}

	public void setKind(AccountKinds kind) {
		this.kind = kind;
	}

	public int getAccname() {
		return accname;
	}

	public void setAccname(int accname) {
		this.accname = accname;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getSpend() {
		return spend;
	}

	public void setSpend(int spend) {
		this.spend = spend;
	}

	public int getSaving() {
		return saving;
	}

	public void setSaving(int saving) {
		this.saving = saving;
	}

	protected int accname;
	protected int income;
	protected int spend;
	protected int saving;
	
	public Accounts() {
		
	}
	
    public Accounts(int accname, int income, int spend, int saving) {
    	this.accname = accname;
		this.income = income;
		this.spend = spend;
		this.saving = saving;
	}
    
	public Accounts(AccountKinds ssaaccount) {
		
	}

	public abstract void PrintInformations();
	
	public int AccountNumbers() {
		return accname;
	}
	
	public void SetAccount(int accname) {
		this.accname = accname;
	}
	
	public void SetIncome(int income) {
		this.income = income;
	}
	
	public void SetSpend(int spend) {
		this.spend = spend;
	}
	
	public void SetSaving(int saving) {
		this.saving = saving;
	}

	public void AccountInfo(Scanner input) {
		
	}

	public void getInformation(Scanner input) {
		
	}

	public void add(Accounts account) {
		
	}
}