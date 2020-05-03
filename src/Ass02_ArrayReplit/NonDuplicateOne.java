package Ass02_ArrayReplit;

import java.util.Arrays;
import java.util.Scanner;

public class NonDuplicateOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	       
	        int size = nums.length;
	        int temp = 0;
	        int result = 0;
	       // boolean flag = true;
	       // int[] arr1 = new int[size];

	        for(int i=0;i<size;i++){
	            temp = nums[i];
	            int count=0;
	            for(int j=0;j<size;j++){
	                if(temp == nums[j]){
	                    count++;                   
	                }
	            }
	            if (count==1){
	               result=temp;
	               break;
	            }
	        }
	        System.out.println(result);
	    }
        }
    
  


	


/* 
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.
Example:
nums -> [1, 1, 2, 3, 4, 3, 4]

         2*/