package Ass02_ArrayReplit;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack1 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);	    
	      int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }	    	    
		    		    
	    int day =0;
	    int[] temp = new int[inhabitants.length];
	    while(true) {
	    	
	    
	    for(int i =0;i<temp.length;i++) {
	    	temp[i]=inhabitants[i];
	    }
	    
	    System.out.println("Day " +day+" "+ Arrays.toString(temp));
	    int total =0;
    	for(int each:temp) {
    		total= total +each;
    	}
    	if(total==0) {
    		break;
    	}
	    	
	      if(inhabitants[1]==0) {
	    	  temp[0]=temp[0]/2;
	      }
	      if(inhabitants[6]==0) {
	    	  temp[7]= temp[7]/2;
	      }
	      for(int j=1;j<temp.length-1;j++) {
	    	  if(inhabitants[j+1]==0 || inhabitants[j-1]==0) {
	    		  temp[j]= temp[j]/2;
	    	  }
	      }
	      day++;
	      for(int i =0;i<temp.length;i++) {
		    	inhabitants[i]=temp[i];
		    }
	      
	    
	    
	    }
	    System.out.println("---- EXTINCT ----");
	}
}
/* A variable inhabitants represents a city and its respective populations.
 * City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. 
 * After each day, a city will lose half of its population.write a program to loop the city population
 * and make it lose half of its population until no humans left. Print the each day like below for each day:
example1- inhabitants is 6
Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
example2- inhabitants is 0
---- EXTINCT ----
example3- inhabitants is 20
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ---- */