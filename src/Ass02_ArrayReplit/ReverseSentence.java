package Ass02_ArrayReplit;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		  
		    String []arr=sentence.split(" ");
		    

		    String reversed = "";

		    for(int i=arr.length-1; i>=0; i--){
		      reversed=reversed+arr[i]+" \n";
		    }

		     //End your code here. do not modify below statement

		    System.out.println(reversed.trim());

	}
}
/*Given a String variable sentence, write code to get each word and assign to String reversed
 *  in reverse order. 
Example:
sentence -> "Java is fun"
reversed -> "fun is Java"*/
/*  String []arr=sentence.split(" ");

String reversed = "";
//TODO: start your code here
for(int i=arr.length-1; i>=0; i--){
  reversed=reversed+arr[i]+" ";
}

 //End your code here. do not modify below statement

System.out.println(reversed);*/