package Mmoneymanagementsystem;

import java.util.Scanner;

public class CoinsChoosing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("동전 선택 (H or T):");
	String coins = input.nextLine();
		
	int computers = (int)(Math.random() * 2);
		
	if(coins.equals("H")) {
	    if(computers == 0) {
                System.out.println("Correct!");
	    }
	    else if(computers == 1) {
	        System.out.println("Incorrect!");
	    }
	}
	else if(coins.equals("T")) {
	    if(computers == 0) {
	        System.out.println("Correct!");
	    }
	    else if(computers == 1) {
		System.out.println("Incorrect!");
	    }
	}
	else {
	    System.out.println("Please, Re-enter!");
        }
    }

}