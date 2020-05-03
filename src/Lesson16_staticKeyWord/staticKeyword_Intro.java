package Lesson16_staticKeyWord;
/*
 * static:means that we can access the members through the class name
 * static members belongs to the class,also called class members
 * What can be static in java:
 * 1.static variables
 * 2.static methods
 * 3.static initializer block
 * 4. static inner class(nested class)
 * 
 * instance variable: created in the class outside any method, belongs to the object.each object will have its own copy,desnt change each other
 * doest effect each other. eg:  String name; obj1.name="Laylo";  obj2.name="Max";
 * Local variable: declared within the methods or blocks only accessible/visible within the method or block
 * 
 * STATIC VARIABLES:also called class variable,declariation similar as instance variable,diference of inst is
 * when you create static it's shared its class and all other objects of class,we can called through class name
 * eg: static int b=300;  call:sout(obj1.b) ONLY be one COPY, if   you have 100 variable all value is 300
 * 
 * Instance: local
   Static: global
 */
public class staticKeyword_Intro {
	  int a;   //instvariable,belong to object,not shared. hozir  value is 0
      static int b ;//changes all object,features are shared by class and all other objects can only one copy
      
  public static void main(String[] args) {
      
      staticKeyword_Intro obj1 = new staticKeyword_Intro();
          obj1.a = 100;   //creating first obj,value is 100 in the obj but inside class is value 0
          
      staticKeyword_Intro obj2 = new staticKeyword_Intro();
          obj2.a = 200;  //creating second object, waisting memory, geting memory twice
          
          System.out.println( obj1.a );  // 100
              // each object has its own copy of instance variables
          
          System.out.println( obj2.a ); //  200
     //   System.out.println(staticKeyword_Intro.a);  //Error cannot call through class name,always create obj
        //then call eg: obj5.a
     //but you can call instance method we can call through class name: eg:
          System.out.println(staticKeyword_Intro.b);//No error  dont need create object
      double num = 100.5;
      
      System.out.println( staticKeyword_Intro.b );//memory effitiont,gets memory just once
      System.out.println( obj1.b );
      System.out.println( obj2.b );
      
      System.out.println("=======================");
      
      staticKeyword_Intro obj3 = new staticKeyword_Intro();
              obj3.a = 100;
              System.out.println(obj3.a);    // 100
              
              
      staticKeyword_Intro obj4 = new staticKeyword_Intro();       
      System.out.println(  obj4.a );   //  0
      
      
      obj3.b = 400;
      System.out.println( obj3.b ); // 400  
      
      System.out.println( obj4.b );  
      System.out.println();
      
  }
}
/*
public class staticVariables {
static String name ;

public static void main(String[] args) {
    
    staticVariables obj1 = new staticVariables();
            obj1.name = "Omer";
    System.out.println( obj1.name );    // omer
            
    
    staticVariables obj2  = new staticVariables();  
            obj2.name = "Khurshed" ; 
            
    System.out.println(  obj2.name );  // khurshed
    
    System.out.println( obj1.name );   // khurshed*/