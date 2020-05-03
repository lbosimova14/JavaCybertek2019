package Lesson04_DecisionStructure_StringMethods;
import java.util.Scanner;




public class WarmUpTask {
	public static void main(String[] args) {
		
		/*int yourNumber;
		   	 	Scanner keyboard = new Scanner(System.in);
		   	 	
		   	 	System.out.println("Enter the number from 1 to 10");
		   	 	yourNumber=keyboard.nextInt();
		   	 	
		   	 	if (yourNumber < 1 ||  yourNumber > 10)
		   	 	{
		   	 		System.out.println( "Run the program and enter number from 1 to 10");
		   	  	}
		   	 	else if (yourNumber==1)
		   	 		    {
		   	 			System.out.println(yourNumber + " in roman numerals is I");
		   	 	    	}
		   	 	else if (yourNumber ==2)
		   	 			{
		   	 				System.out.println(yourNumber + " in roman numeral is II");
		   	 			}
		   	 		
		   	 	else if (yourNumber ==3)
		   	 			{
		   	 				System.out.println(yourNumber + " in roman numeral is III");
		   	 			}
		   	 	else if (yourNumber ==4)
		   	 			{
		   	 				System.out.println(yourNumber + " in roman numeral is IV");
		   	 			}
		   	 	else if (yourNumber ==5)
		   	 			{
		   	 				System.out.println(yourNumber + " in roman numeral is V");
		   	 			}
		   	 			
		         else if (yourNumber ==6)
		   	 			{
		   	 				System.out.println(yourNumber + " in roman numeral is VI");
		   	 			}
		   	 			
		   	     else if (yourNumber ==7)
		   	 			{
		   	 				System.out.println(yourNumber + " in roman numeral is VII");
		   	 			}
		         else if (yourNumber ==8)
		   	 			{
		   	 				System.out.println(yourNumber + " in roman numeral is VIII");
		   	 			}
		   	     else if (yourNumber ==9)
		   	 			{
		   	 				System.out.println(yourNumber + " in roman numeral is IX");
		   	 			}
		   	 				
		            else if (yourNumber ==10)
		   	 			{
		   	 				System.out.println(yourNumber + " in roman numeral is X");
		   	 		
		   	 			}*/
		   	 			System.out.println("------------------");
		   	
//warm up task 1		   	 			
		   	int year=2000; //leap
		   	boolean LeapYear=year%4==0;
		   	if (year%4 == 0) {
		   		System.out.println(year + " Year is leap year");
		   		}
		   		else {
		   			System.out.println("Not Leap");
		   		}
		   	System.out.println("-------------------------------");
	
		   	//warm up task2  grade calculator, using boolean,short way. 
		   	int grade=85;
		   	boolean A= grade>=90 && grade <=100;
		   	boolean B=grade>=80 && grade <90;
		   	boolean C=grade>=70 && grade<80;
		   	boolean D=grade>60 && grade<70;
		   	boolean VAlidGrade=grade>=0 && grade <=100;
		   
		   	if(VAlidGrade) //{System.out.println("valid");  //nested if
		   	if(A) {
		   		System.out.println("You made A");
		   	}
		   	//else {System.out.println("Invaliddd");}   error, doest excute
		   	else if(B) {
		   		System.out.println("You made B");
		   	}
		   	else if(C) {
		   		System.out.println("You made C");
		   	}
		   	else if(D) {
		   		System.out.println("You made D");
		   	}
		   	else {
		   		System.out.println("You made F");
		   	}
		   	
		   else {
		   		System.out.println("Invalid");
		   		}
		   	
		   	System.out.println("----------------------------------");
	//warm up task. nasted if
		   	
	//if(condition){//A}
	//if(condition2){//B}
	
	
	int age=60;
	boolean GoodPerson=true;
	//age>=18 ===cigra
	//age >=21===> hoohen
	//age>=25===>alcohol
	//age<18===> milk
			//age23
	//else bad for health
	if(age>=18) {
		
		if(GoodPerson) {System.out.println("Alcohol is bad health");}
		else//GoodPerson is false
              {System.out.println("You can buy ciger");}
		     if(age>=21) {
		    	 System.out.println("You can buy Hakun");}
		     if(age>=25) {System.out.println("You can buy alcohol");}
		     }
			else {System.out.println("buy milk");}

	/*write prog that can find the number of days in a month
	 * assume that feb has 28
	 * int month
	 * 
	 */System.out.println("------------------");
	
	/*int month=28;
	String result="Jan ,Apr,Jun,SEp Now";
	String result2="March,May,Aug,Oct,Dec";
	String result3="Feb";		
	 if (month==30 && month==31) {}   
	if(month==30) {
	        System.out.println(result2);}
	if(month==28) {  System.out.println(result3);}
	else {}*/
	
	System.out.println("-----------------");
	int month=7;
	
	if(month>0 && month<13) {
	 if(month==1) {
		 System.out.println("31");
	 }
	 else if(month==2) {
		 System.out.println("28");}
		 
        else if(month==3) {
			 System.out.println("31");}

			 else if(month==4) {
				 System.out.println("30");}

				 else if(month==5) {
					 System.out.println("31");}
				    else if (month%2==0) {//month greater than 7,if its even number===>31 days
					 System.out.println("31");
				    }
				      else {
				       	 System.out.println("30");//month greater than 7,if its odd number===>30 days
				 }
	 
	}
	else {System.out.println("Invalid");}	 
	
	//now, lets similar way by grouping
	int Month2=19;
	int Year =2000;
	if(month>0 && month<13) {
	if(Month2==2) {
		if(Year%4==0)//condition leap
			{System.out.println("29 year days");}
	else
	{System.out.println("28 days");}
	}
	else if(Month2==4 || Month2==6) {
		System.out.println("30 days");
	}
	else if (Month2==9 || Month2==11) {
		System.out.println("30 days");}
		else {
			System.out.println("31 days");
			}
	}
	else {
		System.out.println("Invalid Enry");
	}
	
	System.out.println("===================================");
	
	if(false) {
		System.out.println("hello");}
		else if(true) {
			System.out.println("Cyber");
		}
		
		
	else {
		System.out.println("Batch12");
	}
	System.out.println("----------------------");
	
	int number1=8,number2=9,number3=4;
	
	if (number1==number2 && number1!=number3)
	{System.out.println("Number1 and number2 is equal");}
	 
	else if(number2==number3 && number2 !=number1)
	{System.out.println("Number2 and number3 is equal");}
	
	else if(number3==number1 && number1 !=number3)
	{System.out.println("Number3 and number1 is equal");}
	else {System.out.println("not equal");}
	
	System.out.println("secand wayyyyyyyyyyyyyyy");
	int numbe1=8,numbe2=9,numbe3=5;
	
	if(numbe1==numbe2  && numbe2==numbe3)
	{System.out.println("All equal");}
	else if(numbe1==numbe2)
	{ System.out.println("numbe1 equal to number2");}
	else if(numbe2==numbe3)
	{ System.out.println("number2 equal to number3");}
	else if(numbe1==numbe3)
	{ System.out.println("number1 equal to number3");}
	else System.out.println("none of them eqaul");
	
	System.out.println("nested ifffffffffffffffffff");
 int nu1=0,nu2=5,nu3=5;
 if ( nu1==nu2  && nu2==nu3) {//all ==
	 System.out.println("All equals");
	 }
 else {//not all eqial
	 if (nu1==nu2) {
		 System.out.println("nu1 and nu2 is equals");
	 }
	 else if (nu1==nu3) {
		 System.out.println("nu2==nu3");
	 }
	 else if (nu2==nu3) {
		 System.out.println("nu2 and nu3 is equal");
	 }
 
	 else {
		 System.out.println("none of them equal");}
	 }
	
 /*
 
 60~70 => D
 70 ~ 80 => C
 80 ~90 => B
 90 ~ 100 => A  done
 0~59 =>F
  
  grade must be: 0~100
  */
 int gradee =59;
if(gradee >=0 && gradee <= 100) {
 if(gradee >= 60) {
     if(gradee >= 90) {
         System.out.println("A");
     }
     else if(gradee >= 80) {
         System.out.println("B");
     }
     else if (gradee >=70 ) {
         System.out.println("C");
     } else {
         System.out.println("D");
     }   
 }else {
     System.out.println("Failed");
 }
} else {
 System.out.println("Invalid Entry");
}
 
 
//Q2
String ta="A";
ta=ta.concat("B");
String tb ="C";
ta=ta+tb;
ta.replace('C', 'D');
ta=ta+tb;
System.out.println(ta);

//Q3
String Str="Hello Word";
//Str.trim();
int z=Str.indexOf("Hel");
System.out.println(z);

//Q5
String stR="Batch 12";
int Z=stR.trim().length();

System.out.println(Z);


//Q8
String s1="abc";
String s2 ="abc";

System.out.println(  s1==s2+"sdfgg");

 
 
 
	}
		   	 
}

