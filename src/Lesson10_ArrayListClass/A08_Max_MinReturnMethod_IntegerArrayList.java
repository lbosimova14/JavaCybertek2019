package Lesson10_ArrayListClass;

import java.util.ArrayList;

public class A08_Max_MinReturnMethod_IntegerArrayList {
	//1. write a return method that can find the maximum number from an Integer arrayList   (DO NOT use sort methods of Collections class)
	//2. write a return method that can find the minimum number from an Integer arrayList     (DO NOT use sort methods of Collections class)
	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
         list.add(-100);
         list.add(20);
         list.add(0);
         list.add(30);
 
  int maxnum = maximum(list);  // 30
  System.out.println(maxnum);
 
  
 int minnum  = minimum(list); //0
 System.out.println(minnum);

	}//main method ending

	 // task01:
    public static int maximum ( ArrayList<Integer>  list) {
        int max = Integer.MIN_VALUE;
        
        for( int each :  list) {
            if(each > max ) {
                max = each;
            }       
        }
            return max;
    }
    
    
    // task02:
    public static int minimum( ArrayList<Integer>  list ) {
        int min = Integer.MAX_VALUE;
        
        for( int each :  list) {
            if(each < min ) {
                min = each;
            }       
        }
            return min;
    }
}
