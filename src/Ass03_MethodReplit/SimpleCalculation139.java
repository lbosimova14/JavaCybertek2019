package Ass03_MethodReplit;

import java.util.Scanner;

public class SimpleCalculation139 {

	public static void main(String[] args) {	  
		      
		      plus();
		  }
		  
		  public static void plus(){
		     
		    //your code here
		    Scanner scan=new Scanner(System.in);
		    int number1,number2,result;
		    System.out.println("enter first number:");
		    number1=scan.nextInt();
		    System.out.println("enter second number:");
		    number2=scan.nextInt();
		    result=number1+number2;
		    System.out.println(result);
		  }
		  
		}