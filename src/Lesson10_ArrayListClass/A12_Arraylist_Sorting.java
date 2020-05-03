package Lesson10_ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A12_Arraylist_Sorting {

	public static void main(String[] args) {
		 // arrayList sorting:
        Integer[] array = {1000, 900, 80, 765, 123, 542};
        
    ArrayList<Integer> price = new ArrayList<>();
        price.addAll(  Arrays.asList(array) );
        
        System.out.println(price);
        
    Collections.sort( price );  // sorts the arrayList in ascending order
    
    System.out.println(price);

	}

}
