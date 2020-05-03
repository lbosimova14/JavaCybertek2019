package Lesson05_Loops;

import java.util.Scanner;

public class MaxMinForLoop {
	// write program that ask user enter number 5 times
//find the sum of  those 5 inputs
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		int sum=0;
		for(int i=1; i<=5; i++) {
		
		System.out.println("Enter number");//place  scanner within loop, uzi repeat qiladi, you just enter number
		                                   // what ever number you want, and ask you 5 time to enter smth according to condition
		int inputNum=scan.nextInt();
		sum+=inputNum;
		}
		
		System.out.println("sum is:"+sum);*/
		
// write program that asks user enter number 5 times		
//task 2 find the maximum number and the minimum number
		
		int maxNumber=-999999999;
		for(int i=1; i<=5; i++) {
		
		System.out.println("Enter number");		
		int inputNum=scan.nextInt();//user enter 1,2,3
		if(inputNum>maxNumber) {
			maxNumber=inputNum;//make it inputnumber as a maximum number
		}
		
		}
     System.out.println("Max value "+maxNumber);
  // write program that asks user enter number 5 times		
   //task 2 find the minimum number and the minimum number
   		
   		int minNumber=99999999;//store the minimum user input value
   		//min=100, min 50,-999
   		
   		for(int i=1; i<=5; i++) {
   		System.out.println("Enter number");		
   		int input=scan.nextInt();//user enter 100,50,200(false),-999
   		if(input<minNumber) {
   			minNumber=input;
   		}
   		
   		}
   System.out.println("Min value "+minNumber);   




	}

}
