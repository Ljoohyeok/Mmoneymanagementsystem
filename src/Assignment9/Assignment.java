package Assignment9; 

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import java.io.IOException;

public class Assignment {
	public static void main(String[] args) {   
	    Scanner input = new Scanner(System.in);
	    
	    String sentence1 = input.nextLine();
	    String sentence2 = input.nextLine();
	    String sentence3 = input.nextLine();
	    String sentence4 = input.nextLine();
	    
	    Date dates = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	       
	    try {
	        PrintWriter pw = new PrintWriter("Logging.txt");
			pw.print(sdf.format(dates) + "   ");
			
			pw.println(sentence1);
			pw.print(sdf.format(dates) + "   ");
			
			pw.println(sentence2);
			pw.print(sdf.format(dates) + "   ");
			
			pw.println(sentence3);
			pw.print(sdf.format(dates) + "   ");
			
			pw.println(sentence4 + "   ");
			
			pw.close();
			
	    } catch (IOException e) {
	          System.out.print(e.getMessage());
	    }
    }
}
