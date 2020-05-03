package Lesson04_DecisionStructure_StringMethods;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class example {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String string=scan.nextLine();

	 int i = 0;
	  while (true) {
	    int found = string.indexOf("name:", i);
	    if (found == -1) break;
	    int start = found + 5; // start of actual name
	    int end = string.indexOf(":", start);
	    System.out.println(string.substring(start, end));
	    i = end + 1;  // advance i to start the next iteration
	  }

	
	
	}
	
	}


