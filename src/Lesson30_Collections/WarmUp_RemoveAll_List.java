package Lesson30_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WarmUp_RemoveAll_List {

	public static void main(String[] args) {
		//write a program that can remove all even numbers from List Interface
		List <Integer> list1= new ArrayList<Integer>();
		//(for(initialazation; condition: Iterator)
		for(Iterator<Integer> it=list1.iterator();it.hasNext();) {
			//2. should be boolean and Itarator has  bolean .hasNext method
			//it is being false by itself, so no need increment part
			
			//it.next(); return Integer, and assign to int and it is unboxing happining
			//give coundation 
			//remove sepesific element/itaration
		}
		
        System.out.println();
        
        
        //Solution2 write a program that remove all the odd numbers from a list interface
        List<Integer> list2= new ArrayList<Integer>(Arrays.asList(1,5,7,8,9,0,9,8));
       Iterator<Integer> it2= list2.iterator();
       while(it2.hasNext()) {
    	   int oddNum=it2.next();
    	   if(oddNum %2 !=0) {
            it2.remove();
       }
       System.out.println(list2);
        
	}

	}
}
