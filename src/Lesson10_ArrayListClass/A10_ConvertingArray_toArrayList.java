package Lesson10_ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;

public class A10_ConvertingArray_toArrayList {
/*
 *     Arrays.asList(Object Array):  used for converting object arrays to List interface
                we will learn List Interface in future
            addAll(Interface): used for storing multiple objects to ArrayList
 */
	public static void main(String[] args) {
		// converting array to arraylist
        Integer[] arr = {1, 2, 3, 4, 5};
        
        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList( arr ) ); // A
                list2.add(100);
        
        System.out.println(list2);//[1, 2, 3, 4, 5, 100]
        
        
        
        
        String[] arr2 = { "Java", "Python", "C#", "C++"};
            
        
        ArrayList<String> list3 = new ArrayList<>( Arrays.asList(arr2) );
        
        // isEmpty(): checks if the arraylist is empty and returns boolean expression   
            System.out.println( list3.isEmpty() );
            list3.add("F");
            
            System.out.println(list3);  
            
    
            int[] arr3 = {1,2,3,4,5};
        //  ArrayList<Integer>  list4  =  new ArrayList<>( Arrays.asList(arr3));
                        // only the object arrays can be converted
                
        
        // addAll(InterFace): 
            String[] allaNames = { "Hakan", "Alexis", "Rahwa", "Erhan", "Holy"};
            
            ArrayList<String> names = new ArrayList<>();
                names.addAll(  Arrays.asList( "Almaz" , "Ibrohim" , "Tabi" )  );
                
                names.addAll( Arrays.asList(allaNames) );
                System.out.println(names);

	}

}
