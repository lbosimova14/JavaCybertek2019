package Ass03_MethodReplit;

import java.util.Scanner;

public class FibonacciNumber155 {

	public static void main(String[] args) {
	
		   Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		  }
		  
	  public static void fib(int num){
			  int a = 0, b = 1, c; 
		        if (num == 0) 
		            System.out.println( a); 
		        for (int i = 2; i <= num; i++) 
		        { 
		            c = a + b; 
		            a = b; 
		            b = c; 
		        } 
		        System.out.println(b);  
		    //WRITE YOUR CODE HERE
	  }
}
/*    Complete a method fib() that will compute Fibonacci numbers

In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 21*/

/*
slack version:
return method:
public static int fibonacci(int n) {
​
  if(n==0) return 0;
  if(n==1) return 1;
  else return fibonacci(n-1)+fibonacci(n-2);
​
}
void Method:
public static void fib(int num){
	System.out.println(fibonacci(num));
*/