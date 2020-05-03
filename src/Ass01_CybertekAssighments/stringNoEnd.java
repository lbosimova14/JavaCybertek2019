package Ass01_CybertekAssighments;

import java.util.Scanner;

public class stringNoEnd {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   System.out.println("Enter text");
		    String txt = s.next();
		    //your code here
		// char last=txt.charAt(txt.length()-1);
		// String last.replace((txt.charAt(txt.length()-1),"");
		 //String a.replace(last,"");
		   // System.out.println("Enter text");
		  // System.out.println(txt.substring(0, txt.charAt(txt.length())-1));
		  // if (txt != null && txt.length() > 0 && txt.charAt(txt.length() - 1) == 'x') {
		       // txt = txt.substring(0, txt.length() - 1);
		  //  }
		    // System.out.println(txt);
		    
		  //  if (txt == null || txt.length() == 0) {
		    //    System.out.println(txt);
		   // }
		    System.out.println(txt.substring(0, txt.length()-1)); 

	}

}
/*In this exercise you get a string called txt .
output txt without its last letter.
for example:
txt = "foo"
output will be:
fo*/