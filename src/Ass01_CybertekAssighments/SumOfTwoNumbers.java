package Ass01_CybertekAssighments;

/*Task
1.  Write a Java program that will print a sum of two numbers
Please use variables to store num1,num2,and sum
Sample output:
46 + 90 = 136
*/
public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int num1=46,num2=90,sum;
		sum=num1+num2;
		System.out.println("Sum of the "+num1+" and "+num2+" is "+sum);
		System.out.println();
/*
2.  
Write a Java program to convert Fahrenheit to 
Celsius  by using this formula F=9*C/5+32
 */
	
       double Fahrenheit, Celsius=38;
        Fahrenheit=(9*Celsius/5)+32;
       System.out.println( Celsius + " degree Celsius tempurature is equal to "
                           + Fahrenheit +" degree Fahrenheit");
       System.out.println();
/* 3. Write a Java program that converts mile to km 1 mile = 1.609344 km
 * 
 */
       double mile,km;
       System.out.println();
/*Task
1.   Write a Java program that displays the area and perimeter of a circle that has a radius 
of 5.5 using the following formulas:
perimeter = 2 * radius * P
area = radius * radius * P
 */
       // Or declare like that:double area = radius * radius * Math.PI;
       double perimeter,radius, aria,pi;
       radius=5.5;
       pi=3.14;
       
       perimeter=2*radius*pi;
       aria=radius*radius*pi;
       System.out.println("Aria of circle: "+ aria);
       System.out.println("Perimeter of circle: "+perimeter);
       System.out.println();
/*  Write a Java program that displays the area of a rectangle with a width of 4.5 and a 
height of 7.9 using the following formula:
area = width * height   float=35.55,    double with 4.5f,7.9f=35.55000429144,double without f=35.55000004,
int width and heitght casting(int) ans is 28.0 wrong answer
 */
       float width,height, ariaOfRectangle;
       width=  4.5f;
       height= 7.9f;
     
       ariaOfRectangle=width*height;
       System.out.println("Aria of rectangle is "+ ariaOfRectangle);
       System.out.println();
       
/*
 * 3.   Write a Java program that calculates the average of 3 numbers
 * 
 */
       double numb1= 64.3,numb2=78.8,numb3=97;
       double average=((numb1+numb2+numb3)/3);//80.033333333333
       //int average=(int) ((numb1+numb2+numb3)/3);//80
       //float average=(float) ((numb1+numb2+numb3)/3);//80.03333
       System.out.println("Average of 3 number is "+ average);
       System.out.println();
/*Task1                                                                                   
 * ans is 2.0 because both pies and people are int variables, 
 * result will be int,franctional part will be thrown away.
       int pies=10,people=4;
       double piesPerson;
       piesPerson=pies/people;
       System.out.println(piesPerson);
 Task2
 ans is 2.5 correct ans. we can use cast operator in order to gives correct result.
 as a double value: result should be 2.5
 
       int pies=10,people=4;
       double piesPerson;
       piesPerson=(double)pies/people;  // (double) converting to double
       System.out.println(piesPerson);
  
   Task3
   ans is 2.5, the same
   
       int pies=10,people=4;
       double piesPerson;
       piesPerson=pies/(double)people;
       System.out.println(piesPerson);
    Task4
    ans is syntax error
    
       int pies=10,people=4;
       double piesPerson;
       piesPerson= double (pies/people);
       System.out.println(piesPerson);
 *        
 */

       int pies=10,people=4;
       double piesPerson;
       piesPerson= (double)pies/people;
       System.out.println(piesPerson);
       
	}

}
