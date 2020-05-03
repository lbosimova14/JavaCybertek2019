package Ass01_CybertekAssighments;
import java.util.Scanner;
public class StartEndWords {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first word");
	String word1=scan.nextLine();
	System.out.println("Enter the second word");
	String word2=scan.nextLine();
	
	int Wfirst=word1.length();
	int Wsecond=word2.length();
	
	if((Wfirst==5) &&( Wsecond==5)) {
		if( (word1.charAt(word1.length()-1)) == (word2.charAt(0))) {
		System.out.println("Fizz");
		}else
			
		{System.out.println( "Buzz - did not match");
			
			}}else
		System.out.println( " Need to be exactly 5 chars length");
	}

}
/* 
 * Write a program StartEndWords:
you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
if either one not 5 chars length:    print "need to be exactly 5 chars length"
if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
if they do not match:  print "Buzz - did not match
 */




