package Lesson30_Collections;

import java.util.Set;

import Lesson06_Arrays.ForEachEnhancedforLoopArray;

import java.util.*;
public class Set_HashSet_methods {
     public static void main(String[] args) {
		
    	 Set<Long> hset= new HashSet<>(Arrays.asList(4l,5l,3l,9l,9l,9l,4l));
    	 System.out.println(hset);//[3, 4, 5, 9]
    	 System.out.println(hset.size());//4
    	 
    	 for (Long each : hset) {
    		 System.out.print(each+" ");//3 4 5 9 
    	 }
    		System.out.println();
    	 //addAll
    	 
    	 hset.addAll(Arrays.asList(2l,3l,6l,6l,6l,7l));
    		 System.out.println(hset);//[2, 3, 4, 5, 6, 7, 9]
    		 
    		 //remove
    		 hset.remove(4l);
    		 System.out.println(hset);//4 removed gone
    		 
    		 //UPDATE an ITEM
    		 hset.add(null);
    		 System.out.println(hset);//[null, 2, 3, 5, 6, 7, 9]
    		// check whether it already exists if so remove it then add item you want
    		 
    		 if(! hset.add(null)) {
    			 hset.remove(null);
    			 hset.add(0l);
    		 }
    		//no index, no insertion order,it doest not maintain insertion order,and this is the way we come up
		System.out.println(hset);//[0, 2, 3, 5, 6, 7, 9]
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
	
}
