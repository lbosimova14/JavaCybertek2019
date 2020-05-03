package Ass03_MethodReplit;

import java.util.ArrayList;

public class Search_ArrayListMethod {
//Copied from Sara slack
	public static void main(String[] args) {
		 
	    ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("foo bar");
	    arr.add("abc");
	    
	  
	    String find_tst = search(arr,"foo bar");
	    System.out.print(find_tst);//foo bar

	}
	 public static String search(ArrayList<String> r, String find) 
	  {
		    for (String each : r) {
		      if(each.contains(find)) {
		        return each;
		    }
		    
		    }
		  return "search failed";
		
	  }//end wineSeller
}
/*search method accepts ArrayList of Strings and String find. 
and returns a String.
It will look for an element within ArrayList that contains value of find
if it finds it, methods needs to return whole Element value.
if  an instance of find doesn't exist return:"search failed"
for example:
search(["one apple","two orange","four banana"],"four")
returns:
"four banana"
("four banana" contains "four" so method returns "four banana")
search(["hello","world"],"goodbye")
returns:
"search failed"
(no "goodbye" in any element)
hint:
use contains string method to test if element has word value in it.

*/