package Ass03_MethodReplit;

public class Palindrome184 {

	public static void main(String[] args) {
		String str="Nurses Run";
		System.out.println(isPalindrome(str));

	}

	public static boolean isPalindrome(String check) {
		
		  String word = check.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String Reverse = "";                             
        int i = word.length()-1;
        while ( i >= 0 ) {
            Reverse += word.charAt(i);      
            i--;
        }              
        boolean result =word.equals(Reverse) ? true : false;   
		
		return result;
	}
}
/*Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and civic are both palindromes
- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.

Examples:

isPalindrome("Noon") ==> true


isPalindrome("I am not palindrome") ==> false


isPalindrome("wooden") ==> false


isPalindrome("Nurses Run") ==> true*/