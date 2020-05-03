package Ass02_ArrayReplit;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmailArray108 {

	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		    
		    //Write your code below
		    String[] result = email.split("@");
		    if (result.length == 2){
		      System.out.println("Email id: " + result[0]);
		      System.out.println("Email domain: " + result[1]);
		    }
		    else
		      System.out.println("invalid email");
		    
		  }
		}
/*Given a String variable email, write code using split method to print email id and domain in separate lines.
Example:
email -> info@cybertekschool.com
Print:  
Email id: info
Email domain: cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:
email -> hello-gmail.com
print:  
invalid email
email -> my@fancy@email.com
print:  
invalid email*/