package Ass02_ArrayReplit;

import java.util.Scanner;

public class has55_ContainsTwo5 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO Type your code below:
               boolean true_false=false;
		    for(int i = 0; i < nums.length-1; i++)
		    {
		    	if(nums[i] == 5 && nums[i+1] == 5) {
		    	     true_false=true;
		    	break;
		    	}else
		    		  true_false=false;
		    	 }
		  System.out.println(true_false);
	}
}

/*Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
 *  If no consecutive 5s or no 5s are detected in your code then print false.
nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false*/