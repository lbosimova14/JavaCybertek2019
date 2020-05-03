package Lesson13_Constractor;

public class C01_Constructor_Intro {
	    /*
	     decleration of constructor:
	            access-modifer  className(){
	                    statements;
	            }
	     */
	    
	    public C01_Constructor_Intro() {
	        
	        System.out.println("Hello World");
	        System.out.println("I am a default constructor");
	        
	        // return "aaa";   there is no return type in constructor
	    }
	    
	    public C01_Constructor_Intro(int num) {
	        
	        System.out.println("Hello world");
	        System.out.println("I am a constructor with an argument of int: "+num);
	        
	    }
	    
	    public static void main(String[] args) {            
	    //  ConstructorMethods obj = new  ConstructorMethods( "A" ); 
	                        // object was not created with exisiting constructor
	        
	    	C01_Constructor_Intro  obj2 = new C01_Constructor_Intro(8);
	          
	                method1();                
	                
	    }    
	    
	    public static void method1() {	        
	    	C01_Constructor_Intro  obj2 = new C01_Constructor_Intro(8);
	    }}
