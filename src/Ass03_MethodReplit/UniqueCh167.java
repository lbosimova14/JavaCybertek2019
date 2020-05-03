package Ass03_MethodReplit;

public class UniqueCh167 {

	  public static void main(String[] args) {
		    //test your code
		    System.out.println( uniqueChars("java") ) ;
		  }
		  
		  public static String uniqueChars(String str) {

				String remove="";//store non-duplicate value
				for(int i=0;i<str.length();i++) {
					if(!remove.contains(""+str.charAt(i))){
						remove+=""+str.charAt(i);
					}
				}
				return remove;
			}
			}
/*uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"


uniqueChars("mama") ==> "ma"


uniqueChars("spoon") ==> "spon"*/