package Lesson08_Method_Return;
/* write a return method that accepts a String and removes duplicate  values from the String
Eg RemoveDuplicate("aaabbbccc") ==> "abc */

public class RemoveDuplicateReturnMethod {
	public static void main(String[] args) {
		String string= RemoveDuplicate("aabbbcccccdddd"); //this string local variable only aplicable for main method
		System.out.println(string);//abcd
		
	}

	public static String RemoveDuplicate (String str) {//str applicable only this method, local string name
		                            //"aaabbbcccdddd"===>"abcd"  
	String remove="";//store non-duplicate value
	for(int i=0;i<str.length();i++) {
		if(!remove.contains(""+str.charAt(i))){
			remove+=""+str.charAt(i);
		}
	}
	return remove;
}
}

/*by using Scanner class:
 * Scanner scan= new Scanner(System.in);  
        System.out.println("enter a string");
        String str= scan.nextLine();
        str=removeDuplicate(str);
        System.out.println(str);
 */
