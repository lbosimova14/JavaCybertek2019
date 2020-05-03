package Lesson07_MethodVoid;

public class PDFtasks {

	public static void main(String[] args) {
		
		Calculator(6,3,"+");
		Age(2000);
		Greatest(10,30,40);
	
	}
//1. Write a method that accepts 3 parameters
public static void Calculator(int a,int b, String operator) {
	int calc=0;
 if(operator=="+") {
	calc=a+b;
 }else if(operator=="-") {
	 calc=a-b;
 }else if(operator=="/") {
	 calc=a/b;
 }else if(operator=="*") {
		 calc=a*b;
 }System.out.println("calculator("+a+","+b+",\""+operator+"\") "+calc);	 //calculator(6,3,"+") 9
}
//2.Write a method that accepts birthyear and displays the age in the console

public static void Age(int birthYear) 
{
	if(birthYear<=2000) {
		System.out.println("Your are 18 years old");
	}else
		System.out.println("Your are old");
}
//3. Write a method that accepts 3 numbers and displays the greatest one in the console. 

public static void Greatest(int x,int y,int z) {
	
	if(x>y && x>z) {
		System.out.println(x+" x is bigger");
	}else if(y>x && y>z) {
		System.out.println(y+" y is bigger");
	}else
		System.out.println(z+ " z is bigger");
}
}//class ending
