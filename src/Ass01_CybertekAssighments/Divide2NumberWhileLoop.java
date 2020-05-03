package Ass01_CybertekAssighments;

import java.util.Scanner;

public class Divide2NumberWhileLoop {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Divident: ");//20
		int ans1 = scan.nextInt();
		System.out.print("Enter Divisor: ");//6
		int ans2 = scan.nextInt();
		//reduse bug
		
		int count=0;
		if(ans2!=0) {
		while(ans1>=ans2)
		{
		ans1=ans1-ans2; //(Iterator)  substruct until ans1 less then ans2
		count++;
		}
		
		System.out.println(count); //result after dividing the two numbers
		System.out.println(ans1); //reminder   3 is reminder keyin reminderni count qiladi
        System.out.println(20/6);    //3.333
		
		}else {
			System.out.println("Invalid entr");
		}
		
	
	}

}/* 
I can subtruct 3 times ans1  from ans2 

15-6=9 only two time I am able to devide, and result will be 2 
 /9-6=3
  * */
 
 // qushumcha task if both number negative or one negative , fix all bug
//2 and 9, 
//int a,b //a/b
//if(num1>num2{
//a=num1
//b=num2}
//if(num2>num1{
	//a=num1
     //b=num2}


// Muhtar Way
/**
     1. Write a program that can divide two numbers without 
     using division operator
     
    public static void main(String[] args) {
        int a = 15;
        int b = 6;
        System.out.println( a/b );
        
       
         10 - 3 = 7
         7 - 3 = 4
         4 - 3 =1
         
        
        
         15 - 6 = 9
         9 - 6 = 3
         
        
        int x = 20; 
        int y = 6;
        int count = 0; 
        while(x>=y) {
            x -= y;
            count++;
        }
        
        System.out.println( count );  // result after diving the two numbers
        System.out.println( 20 /6 );
        System.out.println(  x );   // remainder
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result =0;
        
        int A, B;  // A/B
        if(num1 > num2) {
            A =num1;
            B = num2;
        }
        if(num2 > num1) {
            A =num2;
            B =num1;
        }
        
        
        if(num2!=0) {
                //10       3    
            while(num1 >= num2) {
                num1 -= num2;
                result++;
            }
            
        System.out.println("devision is "+result+" with a remainder of "+num1);
            
        }else {
            System.out.println("Invalid Entry");
        }*/ 




