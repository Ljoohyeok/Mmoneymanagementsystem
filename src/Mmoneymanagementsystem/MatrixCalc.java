package Mmoneymanagementsystem;

import java.util.Scanner;

public class MatrixCalc {
	
    public static void main(String[] args) {
	    int[] calc1 = new int[6];
	    int[] calc2 = new int[6];
	    int matrix1, matrix2, matrix3, matrix4;
	      
	    Scanner input = new Scanner(System.in);
	    System.out.print("matrix 1 입력 : ");  
	    
	    for(int a = 0; a < 6; a++) {
	    	calc1[a] = input.nextInt();
	    }
	    
	    System.out.print("matrix 2 입력 : ");  
	    
	    for(int b = 0; b < 6; b++) {
	    	calc2[b] = input.nextInt();
	    }
	      
	    matrix1 = (calc1[0] * calc2[0]) + (calc1[1] * calc2[2]) + (calc1[2] * calc2[4]);
	    matrix2 = (calc1[0] * calc2[1]) + (calc1[1] * calc2[3]) + (calc1[2] * calc2[5]);
	    matrix3 = (calc1[3] * calc2[0]) + (calc1[4] * calc2[2]) + (calc1[5] * calc2[4]);
	    matrix4 = (calc1[3] * calc2[1]) + (calc1[4] * calc2[3]) + (calc1[5] * calc2[5]);
	      
	    System.out.printf("%d %d\n",matrix1, matrix2);
	    System.out.printf("%d %d",matrix3, matrix4);
	      
    }

}