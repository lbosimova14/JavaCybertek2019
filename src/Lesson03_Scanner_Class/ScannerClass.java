package Lesson03_Scanner_Class;
import java.util.Scanner;
//keyboard+package+class
//package name:java.util
//class name: Scanner
public class ScannerClass {
//Scanner:its a class that provides the methods to get user inputs
// Scanner class presented in package "java.util" package
	// in order to use scanner class, the scanner class Must be imported: import java.util.Scanner;
	//the import statement Must be placed between package and class 
	public static void main(String[] args) {
	
//declaration of Scanner: Scanner VariableName=new Scanner(System.in);
//new Scanner(System.in): creates objects of the scanner class
//methods of the scanner
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a Byte Value 1");
	byte byteNum=input.nextByte();
	System.out.println("You entered:"+ byteNum);
	
	System.out.println("Enter a Byte Value 2");
	      byte byteNumber2=input.nextByte();
	System.out.println("You entered 2:"+ byteNumber2);
		
		
	 System.out.println();
	 //largest number
     
     System.out.println("Enter num1");
        double n1 = input.nextDouble(); 
        
     System.out.println("Enter num2");
         double n2 = input.nextDouble();
         
     System.out.println("Enter num3");
         double n3 = input.nextDouble();
         
         double Largest = (n1 > n2 && n1 >n3) ? n1
                          : (n2 > n1 && n2 > n3) ? n2
                          : n3 ;
     
     System.out.println("Largest number is "+Largest);
     // add 2 numbers 
     System.out.println("Enter the first number");
     int N1 = input.nextInt();
     
System.out.println("Enter the second number");
     int N2 = input.nextInt();
     
System.out.println("The sum is: " + (N1+N2) );
// Write a prg that asks user to enter first name and then last name. at the end system should display user full name
System.out.println("Enter your first name");
String FirstName=input.nextLine();

System.out.println("Enter your last name");
String LastName=input.nextLine();
 System.out.println("Full name "+LastName+" "+FirstName);
 
 input.close();
	}

}
