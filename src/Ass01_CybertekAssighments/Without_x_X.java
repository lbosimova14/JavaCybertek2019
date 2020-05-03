package Ass01_CybertekAssighments;

import java.util.Scanner;

public class Without_x_X {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter word");
		    String word = scan.next();
	 
	  if((word.charAt(word.length()-1)=='X') && (word.charAt(0)=='x')){       //xkioX
		  System.out.println(word.substring(1, word.length()-1));                //kio 
	   
	  }else if((word.charAt(word.length()-1)=='x') && (word.charAt(0)=='x')){  //xkiox
			 System.out.println(word.substring(1, word.length()-1));               //kio
		
	  }else if((word.charAt(word.length()-1)=='X') && (word.charAt(0)=='X')){  //XkioX
		     System.out.println(word.substring(1, word.length()-1));              //kio 
			 
	  }else if(word.charAt(word.length()-1)=='X') {                            //ijuX
    	  System.out.println(word.substring(0, word.length()-1));              //iju
      
      }else if(word.charAt(0)=='x') {                                           //xkiio
    		  System.out.println(word.substring(1));                             //kiio
     
      }else if(word.charAt(0)=='X') {                                            //Xoiu
		  System.out.println(word.substring(1));                                 //oiu
      
      }else if (word.charAt(word.length()-1)=='x') {                              //olix
    	  System.out.println(word.substring(0, word.length()-1));                 //oli
      
    
      }else if(!(word.charAt(word.length()-1)=='X') && !(word.charAt(0)=='x')) {   // if apple
 		  System.out.println(word);                                                 // apple
	  }
	
	
	
	
	}
      }

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
otherwise print the string unchanged. 
Example: 
input: xHiX 
output: Hi
Example:
input: apple 
output: apple
input: xUxL
output: UxL
input: JavaX
output: Java*/