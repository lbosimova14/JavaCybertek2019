package Ass02_ArrayReplit;

import java.util.Arrays;
import java.util.Scanner;

public class printFirstLastCharater {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		    String [] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),
		    		           input.nextLine()};
		    String []str2=new String[5];
		    for(int i=0; i<5; i++) {
	         String str=words[i];
	         String str1=str.substring(0,1)+str.substring(str.length()-1,str.length());
	          str2[i]=str1;
	          }
	          System.out.println(Arrays.toString(str2));
	
	}

}
/*Given a String array words,
 *  iterate through each word and print first and last letter of each element in the format below.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]*/

/* //to find first and last character way by using loop  
for(int i=0; i<words.length;i++) {
String first=""+words[i].charAt(0);
String last=""+words[i].charAt(words[i].length()-1);
System.out.println(first+last);*/