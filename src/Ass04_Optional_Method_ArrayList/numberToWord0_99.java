package Ass04_Optional_Method_ArrayList;

import java.util.Scanner;
public class numberToWord0_99 {

	public static void main(String[] args) {			    
	            
	            Scanner scan= new Scanner(System.in);
	            System.out.println("Enter a number between 0-100");
	            int number= scan.nextInt();
	        
	            System.out.println(convertNumberToWord100(number));
	        }
				    
		        public static String units (int i) {
		                String[] units = { "Zero", "One", "Two", "Three", "Four",
		                "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
		                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
		                "Eighteen", "Nineteen" };
		        return units[i];
		        }
		        public static String tens(int i) {
		        
		        String[] tens = { "", "",   "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy","Eighty",    "Ninety" };
		        return tens[i];
		        }
		        	        
		        public static String convertNumberToWord100 ( int n) {		            	        
		                
		            if ( n < 20) {
		                return units(n);
		            }
		            else if( n<100) {
		                
		                return tens(n/10)+units(n%10);
		        //            89/10=8.9         89%10=9
		            }
		            
		            return "";
		    
		    }		        
		   
		}
	
	/*	int number= 2;
		
		System.out.println( numToWord(number));

	}

	
	public static String numToWord(int num) {
		​
				String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
				String[] numsTo20 = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
						"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
				
				String res = "";
			
				if (num < 20) {
					res = numsTo20[num];
				}
				else {
					res = tens[num / 10];
					if(num % 10 != 0) res += " " + numsTo20[num%10];
				}
				
				res = (res.charAt(0) + "").toUpperCase() + res.substring(1);
		​
				return res;
			}
	
}*/
/*Write a java program that can converts the number between 0~ 99  to words
Ex: 
input:  89
out put: Eighty nine
input: 75
output:  Seventy five*/