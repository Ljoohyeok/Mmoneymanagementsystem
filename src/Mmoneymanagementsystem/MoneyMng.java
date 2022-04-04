package Mmoneymanagementsystem;

import java.util.Scanner;

public class MoneyMng {
	Mmoneys mmoneys;
	Scanner input;
	MoneyMng(Scanner input){
		this.input = input;
	}
	
	public void mytotalmoney() {
		mmoneys = new Mmoneys();
		System.out.print("Total Money : ");
		mmoneys.total = input.nextInt();
		System.out.println();
	}
	
	public void incomemoney() {
	    mmoneys = new Mmoneys();
		System.out.print("Total Money : ");
		mmoneys.total = input.nextInt();
		System.out.print("Income : ");
		mmoneys.income = input.nextInt();
		System.out.print("Total : ");
		System.out.print(mmoneys.total + mmoneys.income);
		mmoneys.T1 = (mmoneys.total + mmoneys.income);
		System.out.println();
	}
	    
	public void spendingmoney() {
	    mmoneys = new Mmoneys();
		System.out.print("Total Money : ");
		mmoneys.T1 = input.nextInt();
		System.out.print("Spending : ");
		mmoneys.spend = input.nextInt();
		System.out.print("Total : ");
		System.out.print(mmoneys.T1 - mmoneys.spend);
		mmoneys.T2 = (mmoneys.T1 - mmoneys.spend);
		System.out.println();
	}
	    
	public void savingmoney() {
		System.out.print("Total Money : ");
		mmoneys.T2 = input.nextInt();
		System.out.print("Saving Money1 : ");
		mmoneys.saving1 = input.nextInt();
		System.out.print("Saving Money2 : ");
		mmoneys.saving2 = input.nextInt();
		System.out.print("Total Saving Money : ");
		System.out.println(mmoneys.saving1 + mmoneys.saving2);
		System.out.print("Total : ");
		System.out.println(mmoneys.T2 + mmoneys.saving1 + mmoneys.saving2);
		mmoneys.T3 = (mmoneys.T2 + mmoneys.saving1 + mmoneys.saving2);
		System.out.println();
	}
	
	public void reference() {
		mmoneys.printInfo1();
	}

}
