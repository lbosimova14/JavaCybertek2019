package Ass02_ArrayReplit;

import java.util.Arrays;
import java.util.Scanner;

public class shortestWordArray120 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//you enter input 6 times
	    String[] str = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
	    				        	      
      //create String variable to assign array string,array string should starts from zero index,that is why give zero in braket
	   //like:as we assign usual int ===> int x=0;
            String shortWord= str[0];//
       //put array string length in loop for iterate
            for(int i=0;i<str.length;i++) {
      //give condition:if input 6 word is less than shortWord      	
            	if(str[i].length()<shortWord.length()) {
            		shortWord=str[i];
            	}
            }
            System.out.println(shortWord);
	}

}
/*Write a program that will print the shortest word in the given array str. 

input: java, cable, red, vivid, remedy, grace

output: red*/


/* //copyied from slack
String myShort = str[0]; //assign it to the first word for now.
for(String Shortest : str)
{
if(Shortest.length() < myShort.length())
myShort = Shortest;
}
System.out.println(myShort);*/