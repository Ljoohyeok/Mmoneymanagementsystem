package Mmoneymanagementsystem;

public class Mmoneys {
	int T1, T2, T3;
	int total;
	int income;
	int spend;
	int saving1;
	int saving2;
	
	public Mmoneys() {
	}
	
    public Mmoneys(int total, int income, int spend, int saving1, int saving2) {
		this.total = total;
		this.income = income;
		this.spend = spend;
		this.saving1 = saving1;
		this.saving2 = saving2;
	}
    
	public void printInfo1() {
		System.out.println("Total money(Income) : " + T1);
		System.out.println("Total money(Income+Spending) : " + T2);
		System.out.println("Total money(Income+Spending+Saving) : " + T3);
		System.out.println();
	}

}