package Lesson10_ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;

public class A11_RemoveAll_Interface {

	public static void main(String[] args) {
		  
        //RemoveAll(InterFace): 
            ArrayList<Integer> numbers = new ArrayList<Integer>();
                numbers.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,4,4));
                //                           0 1 2 3 4 5 6 7 8
                //            removing                1       2   sonini, not index
                numbers.removeAll( Arrays.asList(1,2) );
                
                System.out.println(numbers);//[3, 3, 3, 4, 4]
                
                
                // removed() method not designed to be used with in loop
                
        
            /*  
            ArrayList<Integer> lis = new ArrayList<>();
            lis.addAll(Arrays.asList(1,1,1,2,2,3,3,4,2,1) );
            
            for(int i =0; i <lis.size(); i++ ) {
                if(lis.get(i) == 1) {
                    lis.remove(i);
                }
            }
            
                System.out.println(lis);
            */ 

	}

}
