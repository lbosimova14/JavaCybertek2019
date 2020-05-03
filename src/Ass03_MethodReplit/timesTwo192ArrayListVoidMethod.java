package Ass03_MethodReplit;

import java.util.ArrayList;
import java.util.Arrays;

public class timesTwo192ArrayListVoidMethod {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		timesTwo(numbers);
	}
		//copied from slack
		public static void timesTwo (ArrayList<Integer> nums) {
		    int temp = 0;
		        for(int i = 0; i<nums.size(); i++) {
		          temp =nums.get(i);
		          temp=temp*2;
		          nums.set(i, temp);
		        }
		       //copied from slack, qisqartirib shunday topsa ham buladi
		          //     nums.set(i,2*nums.get(i)); 
		  
		    System.out.println(nums); //  [4, 6, 8, 10]
		    }
		
	
	}
	/*
  // this is didnt work on submitting time, but worked on eclipse fine
	//this is arraylistmi ajratayapti 4 6 8 10
	  public static void timesTwo(ArrayList<Integer> nums) {
		  for(int i=0;i<nums.size();i++) {
			  System.out.println(nums.get(i)*2);	
		  }  
	  }
}*/
/*Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.*/