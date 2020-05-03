package Ass02_ArrayReplit;

import java.util.Scanner;

public class RepeatSeparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		 String separator = scan.next();
		 int count = scan.nextInt();
		   
		  
		 for(int i = 1; i<=count; i++){
		     for(int j =0; j<1;j++){
		       System.out.print(word);
		     }
		     if(i==count){
		       break;
		     }
		     System.out.print(separator);
		   }
		 
		 /* for(int i=1; i<=count-1; i++ ){
                System.out.print(word+separator);           
            }
        System.out.println(word);*/
/*
Given two strings, word and a separator sep,
Scanner scan = new Scanner(System.in);
String word = scan.next();
String separator = scan.next();
int count = scan.nextInt( );
return a big string made of count occurrences of the word, separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord
 
Example:
input: This
input: And
input: 2
output: ThisAndThis
 
Example:
input: This
input: And
input: 1
output: This*/
	}
}