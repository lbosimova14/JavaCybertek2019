package Ass03_MethodReplit;

public class extractNumber186 {
	
	public static String extractNum(String s) {
		String numberOnly= s.replaceAll("[^0-9]", "");
	    return numberOnly;
		  
	  }

	public static void main(String[] args) {
		  String str="aa2bbb3nnn4mmm";
				System.out.println(extractNum(str));
		
	}

}
/*a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only
example use:
extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10
hint:
you can use:
 Character.isDigit(ch)
 or conditions*/