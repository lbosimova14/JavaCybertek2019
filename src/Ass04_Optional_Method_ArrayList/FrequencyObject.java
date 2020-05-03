package Ass04_Optional_Method_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class FrequencyObject {

	public static void main(String[] args) {
ArrayList<String> cars =new ArrayList<>(Arrays.asList("Toyota", "BMW", "bMw", "TOYOTA", "ToYoTa", "Tesla", "TESLA", "tEsLa"));
     String str="Toyota";
    System.out.println(FrequencyObjects(cars,str));
     
     
	}
   public static int FrequencyObjects(ArrayList<String> A, String B) {
	
	   String temp = B;
	   int count = 0;
	   for ( String  each :  A ) {
	     if(each.equalsIgnoreCase(temp)) {
	          count++;
	   }
	   }
	   return count;
   }
	   
}
/*Write a return method that accepts an String ArrayList list A  and  a String variable B,
 *  and the returns the total number of appearance of string B in the ArrayList A.
EX:
if   ArrayList cars ===> {"Toyota", "BMW", "bMw", "TOYOTA", "ToYoTa", "Tesla", "TESLA", "tEsLa" };
Frequency ( cars,  "toyota")  ===>  returns 3
Frequency ( cars, "BMW") ===> returns  2*/