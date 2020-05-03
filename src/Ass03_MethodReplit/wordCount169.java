package Ass03_MethodReplit;

public class wordCount169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(wordCount("foo bar"));
	}
	 
	  public static int wordCount(String words) {
		  String str[]=words.split(" ");//array split method ishlatib suzlarni tarqatib olish kk birinchi,
	    	return str.length;
	  }
}
/*This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")

returns 2


wordCount("one two three")

returns 3


wordCount("bla")

returns 1*/