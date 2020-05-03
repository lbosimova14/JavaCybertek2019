package Lesson09_OverloadingMethod;

public class WarmUpRemoveDup_Count_Frequancy {

	public static void main(String[] args) {
		 /*
	     Warm up:
	    1. write  a return method that can remove duplicates from a string
	        Ex: RemoveDup("abcabc") ==> returns "abc";
	    2. write a return method that accepts two parameter Strings a and b, 
	            and returns the total numbers of apperence of string b in String a
	            
	                Ex: count("abcaba", "a")  ==> returns 3 ;
	    3. use the above two methods to write a new method that can find the frequency of characters
	        Ex: frequency("aabcabcabc") ==>a4b3c3
	   
	     */ 
	        //task01
	        String a = RemoveDup("abcabcdefdef");   
	        
	        System.out.println(a);// abcdef
	        System.out.println( RemoveDup("abcabcdefdef") );//// abcdef
	        
	        
	        // task02
	        int count  = count("abaacdabcdaaa", "c");
	        System.out.println(count);//2
	        
	        System.out.println( count("abaacdabcdaaa", "a"));	  //7      	        	        	        
	    }
	    	    
	    // task01
	    public static String RemoveDup(String str) {
	                                    //"abcabc"
	        String result = "";
	        for(int i=0; i < str.length(); i++) {
	            if( ! result.contains( str.substring(i, i+1) ) ) {
	                result += str.substring(i, i+1);
	            }
	        }
	        
	        return result;
	    }
	    
	    
	    // task02
	    public static int count(String str1, String str2) {
	                            // abab        a   ==>1
	                            // bab          a  ==. 2
	            
	        int count=0;  //  to count how many time b is appeared in a
	        
	        while(str1.contains(str2)) {
	            count++;
	            str1 = str1.replaceFirst(str2, "");
	        }
	            
	        return count;   
	        
	    }
	    
	    
	    // task03
	    public static String frequency(String str) {
	                                // "abcabcabc"  ==> "a3b3c3"
	                                    
	        String nonDup = RemoveDup(str); // "abc"
	        String result = "";  // to store the expected result
	        
	        for(int i=0; i < nonDup.length(); i++) {
	                int count = count( str ,  ""+nonDup.charAt(i) );
	                result += "" + nonDup.charAt(i) + count;
	        }
	            
	        return result;
	    }

	

}
