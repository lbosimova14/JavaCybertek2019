package Ass03_MethodReplit;

import java.util.Arrays;

public class CountAppears156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String [] some_array = {"a","foo","bar","foo","bla"};
         String some_string = "foo";
         
       int x =count_appearance(some_array,some_string);
        System.out.println(x);
	}
	public static int  count_appearance(String[] arr,String t) {
    String key = t;
    int count = 0;
        for ( String  e :  arr ) {
                 if(e == key) {
                         count++;
                       }
            }
   return count;
}
	}

/*Create a method that gets an array of strings and a string, the method returns an int.

It counts how many times a string appears in the array and returns the count.

for example (pseudo code):

some_array = ["a","foo","bar","foo","bla"]


some_string = "foo"


count_appearance(some_array ,some_string )


will return 2 because some_array  has 2 appearances of "foo" string.*/