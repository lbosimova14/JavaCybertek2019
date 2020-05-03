package Ass03_MethodReplit;

public class Limit171 {

	public static void main(String[] args) {
		
		String str =limit("bla bla",3);
		System.out.println(str);

	}
	  public static String limit(String text, int maxLength) {
		  String str =text.substring(0,maxLength);
		  return str;
	  }
}
/*This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a creating number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)

*/