package Lesson08_Method_Return;
/* write a return method that accepts String and returns the unique 
	    values from the String
	    Ex: Unique("AABBCDEEE")  ==> "CD"	            
	     */
public class UniqueValueReturnMethod {

	public static void main(String[] args) {
		
		String str2=UniqueValue("AABBCCDHHHYKKKK");
		System.out.println(str2);//DY

	}
 public static String UniqueValue(String str) {
	 //                            "AABBCCDHHHYKKKK"===>"DY"
	 String result="";
	 for(int j=0;j<str.length();j++) {
	 int count=0; //to count number of appearance
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i)==str.charAt(j)) {
			 count++;
		 }
	 }
	 if(count==1)  result+=""+str.charAt(j);
	 
	 }
	 return result;
	 }//method ends
           
 }//class ends
        
/* using only one loop
    int i = 0;
    while (i < str.length()) {
        if (str.substring(i+1).contains(str.substring(i, i+1)))
            str = str.replaceAll(str.substring(i, i+1), "");
        else
            i++;
    }
        
    return str
 * 
 */
