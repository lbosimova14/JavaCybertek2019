package Lesson16_staticKeyWord;
//static memory only accepts class members
// non static can only be called through the object in the static method
public class staticPractice {

	  static long num1;
      long num2; //get memory twice,waste memory

public static void main(String[] args) {
   
   System.out.println( num1 );// 0 we can call static variable just by name OR
   System.out.println( staticPractice.num1 );//  0  OR call by classname.variable name(both works)
   
//  System.out.println( num2 ); but we cannot call inst variable by itself, must create obj first
//  System.out.println( staticPractice.num2 );Error,because not static, agar static variable bulgabda chaqirsa 
   //buladi,chunki main method is static and static main method can call static variable
   
   
   staticPractice.method1();//A
   
   // staticPractice.method2(); Error create obj first
   
   staticPractice obj = new staticPractice();
       obj.method2();//B
       
       obj.method1(); //A  //can be call with obj, but not prefered,sariq warning beradi,should call classname.
}


public static void method1() {
   System.out.println("A");
}

public void method2() {
   System.out.println("B");
}

	
}
