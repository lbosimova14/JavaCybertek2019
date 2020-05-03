package Lesson10_ArrayListClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class A18_Review2 {

	public static void main(String[] args) {

		
	    
        // isEmpty(): checks if the size of the ARraylist is 0 or not, returns boolean expression
        ArrayList<Character> ch = new ArrayList<>();
            // ch.add('Y');
        
        System.out.println(ch.isEmpty()); // true
        
        
        // remove(primitives int): removes the index numbers
                        // not designed to be used within the loop
        
        ArrayList<Integer> price =  new ArrayList<>();
            price.add(1);  // 0
            price.add(2);  // 1
            price.add(3);  // 2
            
            price.remove( 1 );  //[1, 3]
        
            System.out.println(price);
            
        
        // removeAll(Interface):  removes all the matching objects  
    ArrayList<Integer>  nums = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,3,1));
        nums.removeAll( Arrays.asList( 1 , 2 ) );//removing 1 and 2 
    
        /*loop doest work in this remove method
            for(int i =0; i < nums.size(); i++) {
                if(nums.get(i) == 1 ) {
                    nums.remove(i);
                }           
            }
        */  
        System.out.println(nums);    // Iterables
    
        
        
        // addAll(Interface): adds multiple objects to the ArrayList
        
        ArrayList<String> n1 = new ArrayList<>();
        n1.addAll( Arrays.asList("Yasin", "Talha", "Ruslan") );
        
        System.out.println( n1 );
        
            
        
        // Collections.sort(ArrayList): sorts the arrayList in ascending order
        Integer[] arr = {1,2,3,4,5,5,5,100, -100, -9};
        
        ArrayList<Integer> lists = new ArrayList<>( Arrays.asList( arr ) );
        System.out.println(lists);
        
            Collections.sort(lists);
            System.out.println(lists);

}
}

