package Mmoneymanagementsystem;      

import java.util.Scanner;  

public interface AccountInfo {   

	public void getInformation(Scanner input);
	
	public AccountKinds getKind();
	
	public void setKind(AccountKinds kind);
	
	public int getAccname();
	
	public void setAccname(int accname);
	
	public int getIncome();
	
	public void setIncome(int income);
	
	public int getSpend();
	
	public void setSpend(int spend);
	
	public int getSaving();
	
	public void setSaving(int saving);
	
	public int AccountNumbers();
	
	public void SetAccount(int accname);
	
	public void SetIncome(int income);
	
	public void SetSpend(int spend);
	
	public void SetSaving(int saving);
	
	public void add(Accounts account);
}
