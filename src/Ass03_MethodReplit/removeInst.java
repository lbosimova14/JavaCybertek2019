package Ass03_MethodReplit;

import java.util.ArrayList;
import java.util.Arrays;

public class removeInst {

	public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
	//agar  value as int pass qilinganda edi: List.remove(int), which treats its argument as the index, 
//not the value we want to remove,that is why  correcting it by passing the value as Integer:
		 while (r.contains(n)) {
		        r.remove(n);//removing all numbers (agar int pass qilsa ham value ham index removing qilayapti)
		    }
		//r.remove(n);//removing only one number,not all
		 return r;
	  }
	  
	  public static void main(String[] args)
	  {
	  
	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,2,2,3,3};
	    arr.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(arr,3));
	   
	    
	  }//end main
}
/*This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.
It removes any instance of the number it gets from the arraylist.
for example:
romoveInst([1,1,2,3,1,4],1)
returns: [2,3,4]
romoveInst([3,4,3,3],4)
returns: [3,3,3]*/