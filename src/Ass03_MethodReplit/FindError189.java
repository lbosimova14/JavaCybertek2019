package Ass03_MethodReplit;

public class FindError189 {

	public static void main(String[] args) {
		String str="three four error";
		System.out.println(isError(str));

	}
	public static boolean isError(String line)  {
	if(line.startsWith(("error")))
		return true;
	return false;
	  }
}
/*it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string
example use:
isError("foo bar")
returns : false
isError("error foo bar")
returns : true
isError("error one two")
returns : true
isError("three four error")
returns : false
hint: check the string methods in the java doc. one of them is helpful for this.
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html*/