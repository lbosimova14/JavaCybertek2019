package Lesson16_staticKeyWord;

import java.util.Scanner;
//static method: method taht we call it through the class name
//ex: Webdriver driver=WebDriverFactory(class).getDriver;
//
//    static method only accepts class members(static)
//non statics can only be called through the object
public class staticMethod {
	
    static  Scanner scan =new Scanner(System.in);//both located in same class and you dont have call through class name
   // call itself (int a=scan.nextInt();) in static method
      int a;
	
	
	public static void main(String[] args) {
		staticMethod objA=new staticMethod();
		System.out.println(objA.num1);
		staticMethod.method1(); //static method we can call it through class name  //Open the browser
		staticMethod.printHello();//hello cybertek
	}
	int num1; //instance variable belong to object/ 
    static int num2; 
	
	public static void method1() {
		int a=scan.nextInt();
		System.out.println("Open the browser"); 
		//just like Arrays.ToString
	}
	//custom method with static keyword
	public static void printHello() {
		int a=scan.nextInt();
		System.out.println("hello cybertek");
	}
}
//how do we call static method in non static method:in order to call none static in a static method we MUST call it though the object