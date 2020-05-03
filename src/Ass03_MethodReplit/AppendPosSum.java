package Ass03_MethodReplit;

import java.util.ArrayList;
import java.util.Arrays;

public class AppendPosSum {
//coppied from slack
	 public static void main(String[] args) {
	        // creating an ArrayList
	        ArrayList<Integer> alist=new ArrayList<Integer>(Arrays.asList(4,-6,3,-8,0,4,3));	        
	        System.out.println(appendPosSum(alist));
	                    
	    }
	    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
	        // iterating positive elements to new  ArrayList
	        ArrayList<Integer> posList=new ArrayList<Integer>();
	        for(int i=0;i<list.size();i++) {
	        if(list.get(i)>0) {
	            posList.add(list.get(i));
	        }
	        
	    }
	        //sum all of positive elements and iterating to new ArrayList
	        ArrayList<Integer> sumOfList=new ArrayList<Integer>();
	        Integer sum=0;
	        for(int i=0;i<posList.size();i++)
	            sum+=posList.get(i);	        	        
	        posList.add(sum);
	        return (posList);
	        
	    }
}
/*Create a static method that:
is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers
This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element
For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
 the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  
 The original ArrayList should remain unchanged.*/