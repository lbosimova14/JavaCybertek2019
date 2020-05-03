package Ass03_MethodReplit;

import java.util.Arrays;
import java.util.Scanner;
//copyied from slack
public class SplitPerson146 {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		 System.out.println("enter string");
		    String s = inp.next();
		    person(s) ;
		  }
		  
		   public static void person(String info) 
		   {		//your code here
			   String [] str = info.split(",");//input kiritgada comma bn kirit
			 
			System.out.println("person name: "+str[0]+" last name: "+str[1] +" age: "+str[2]);
			
			}//end person
		  
		}

	


/*The method person get a string with this format : "name,last name,age"
for example: 

person("jon,doe,30");


the output is:
 

person name: jon last name: doe age: 30


hint: use the split method to split the string to a string array where there is a "," char*/