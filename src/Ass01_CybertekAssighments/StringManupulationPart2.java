package Ass01_CybertekAssighments;

import java.util.Scanner;

public class StringManupulationPart2 {

	public static void main(String[] args) {
// Task 1 "Make Sandwich"		
/*Ask user to enter two words. 
* If the first word has even number of characters, print the first half of the first word, 
* print the second word and print the second half of the first word.
		Input:
		banana
		apple
		Output:
		banappleana*/		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two word:");
		String word1=scan.nextLine();
		String word2=scan.nextLine();
		
		  
	        if (word1.length() % 2 == 0) //even string character
	        {
	          
	           String length = word1.substring(0, word1.length()/2);
	        
	            System.out.println(length+word2+(word1.substring(word1.length()-3)));
	        }
	        else
	        {
               System.out.println("Word has not even number of characters");

	          
	        }

//Task 2 "Ignore the first ones"	        
/* Ask user to enter two words.
 *  Print first word without its first character then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana 
 */
            System.out.println("Enter two word:");
            String W1=scan.nextLine();
            String W2=scan.nextLine();
            
            String str=W1.substring(1, W1.length());
            String str2=W2.substring(1, W2.length());
            System.out.println(str.concat(str2));
  
 /* Task 3 "Same or not 1"
Ask user to enter a word.
Print true is the first and last characters of the string are same characters, print false otherwise.
Input:
abba
Output:
true
  */ System.out.println("Enter a word:");
     String aWord=scan.nextLine();
    int FirstCharacter=aWord.charAt(0);
    int LastCharacter= aWord.charAt(aWord.length()-1);
     if(FirstCharacter == LastCharacter)
    	 System.out.println(true);
     else
    	 System.out.println(false);
     
 /* Task 4 "Same or not 2"
  * Ask user to enter two words. 
  * Print true is the first two characters of the first word and
  *  last two characters of the second word are same characters,print false otherwise.
Input:
banana
abba
Output:
true
  */
     System.out.println("Enter 2 words:");
     String Word1=scan.nextLine();
     String Word2=scan.nextLine();
   String CharFirst= Word1.substring(0,2);
   String CharLast= Word2.substring(Word2.length()-2,Word2.length());

     if(CharFirst.equals(CharLast))
    	 System.out.println(true);
     else
    	 System.out.println(false);

  /*Task 5  "Seriously???"
  * Ask user to enter a word. Print "really?" 
  *  if the word ends with ly, print "never mind" otherwise.
Input:
Seriously
Output:
really?
  */ System.out.println("Print a word" );
        String input=scan.nextLine();
        if(input.endsWith("ly"))
        	System.out.println("really?");
        else
        	System.out.println("never mind");
  
 // Task 6. "Make them equal"
 /*Ask user to enter two words. If they are equal length, print them together.
  If one is longer than the other one, print equal number of characters from the long one.
     		Input:
     		book
     		pen
     		Output:
     		boopen
     		 */   
        System.out.println("Enter Two Words Please");
        String word_1=scan.nextLine();
        String word_2=scan.nextLine();
        int Size;
     		 if(word_1.length()==(word_2.length())) {
     		     System.out.println(word_1.concat(word_2));
     		     
     		  } else if(word_1.length()>word_2.length()) {
     		    	  Size = word_2.length();			
     		      System.out.println(word_1.substring(0,3)+(word_2.substring(0,Size)));

     		  }else if(word_2.length()>word_1.length()) {
                     Size = word_1.length();
                     System.out.println(word_1.substring(0,3)+(word_2.substring(0,Size)));
     			
     		    }
     
     
  //Task 8 'Three times'
/*Ask user to enter a word. If the word has 2 more more characters, 
print first 2 characters of the word three times Input:
apple
Output:
apapap
	 */
	   System.out.println("Please enter a word");
       String WORD=scan.nextLine();
     
       
       String Str=WORD.substring(0,2);
      
       System.out.println(Str.concat(Str)+Str);
       
}}