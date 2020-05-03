package Lesson05_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsReview_FromSlack {

	public static void main(String[] args) {
		   Scanner scan=new Scanner(System.in);
	        System.out.print("Please enter a number: ");
	        int num=scan.nextInt();
	        for (int i = 1; i <= num; i++) {
	            
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j+" ");
	            }
	            System.out.println("");
	        }
	        for (int i = 1; i < num; i++) {
	            for (int j = 1; j <= num-i; j++) {
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }
	        int[] nums=new int[7];
	        
	        for (int i = 0; i < nums.length; i++) {
	            nums[i]=(int)(Math.random()*100);
	        }
	        System.out.println(Arrays.toString(nums));
	        
	        for (int i = 0; i < nums.length; i++) {
	            
	            for (int j = 0; j < nums.length; j++) {
	                if(nums[j]>nums[i]) {    // For switching from ascending order to decsending one, just replace the "<" with ">"...
	                int temp=nums[i];
	                nums[i]=nums[j];
	                nums[j]=temp;
	                }
	            }
	        
	            
	        }
	        System.out.println(Arrays.toString(nums));
	        
	        String[] str= {"ksdhasakhd","msdbdbjkds","jhh","hgdjh","asasadsa","rewee","rewrewrew"};
	        int count=0;
	        
	        for (int i = 0; i < str.length; i++) {
	            if(str[i].contains("h")) {
	                count++;
	                System.out.println(str[i]);
	            }
	            
	        }
	        //
	        
	        
	        
	        String[] str2=new String[count];
	        int num1=0;
	        for (int i = 0; i < str.length; i++) {
	            if(str[i].contains("h")) {
	                str2[num1++]=str[i];
	                
	            }
	        }
	        System.out.println(Arrays.toString(str2));
	}
}
