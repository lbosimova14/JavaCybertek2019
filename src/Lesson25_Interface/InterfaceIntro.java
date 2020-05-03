package Lesson25_Interface;

//first interface
public interface InterfaceIntro {
	//default variable
	int a=100;//variables: public, static, final by default gives  automatically
	public static final int b=22; //you can declare public static final,or not declari java declare by default
	      
	
	//abstract method
      public abstract void MethodA();
          //normal method(instance)
     // public void MethodC() {}  Error, Interface cannot have instance method
          //constractor
     //public  InrfaceIntro() {}Error, Interface cannot  have constractor,only class can have constractor
          //instance block
      //static {} //compile error,(its used for static inisilizer static variable)
      
        //static method: OK,no error, static belong to interface
      public static void MethodD() {
    	  System.out.println("static method in interface");
      }
    	  
      
}

//second interface
     interface Data{
	public void MethodB();
}
//class Test extends InterfaceIntro{// Error Interface not extends class

//class Test implements InterfaceIntro{//Error, class giving compile error,bc abstract method must override

class Test implements InterfaceIntro, Data {//using implements keyword
	//subtype           supertype,  supertype
	
	//anything in the interface will be in the class
	//one class can implements as many as interface,that is advantage of interface
	//if we use abstract, only we can extends one class
	
	
	//override interface
	@Override
	public  void MethodA() {
		System.out.println("MethodA Interface Intro");
	}
	 
	@Override
	public void MethodB() {
		System.out.println("MethodB Data");
	}
	
	
//	main method:
	public static void main(String[] args) {
		InterfaceIntro.MethodD();
		System.out.println(a);//variable are static by default
		//a=999;//variable are final by default,we cannot reassined
	}
	
	
}


/*
 * CLASS NOTES
 * two ways to achieve abstractions:
            1. Abstract class
            2. Interface
why do we need interface?
what we can have in interface?
what we cannot have in interface?
Interface: it's blueprint of class, but it's not a class
        public interface InterfaceName{
        }
        we can store abstract methods, and let classes implement abstract methods
        interface is meant to be implemented
    implements keyword: we use the implements keyword to implement abstract methods to the class
why do we need interface?
    A class can implement multiple interfaces
    A class can extend one class only
what we can have in Interface ?
        methods: Abstract methods, static methods, default method
        variables:  public static final ==> automatically
                variables are public, static and final by default 
What we cannot have in Interface?
        Constructor
        Instance methods
        instance variable
        instance block
        static block
interface we have used: 
                    WebDriver
                    WebElemnt
                    List
                    Set
                    Map
 */


/*
 * CLASS NOTES : 
 *             Abstract class VS Interface
            extends keyword vs implements keyword

Interface: used for achieving abstraction
            we can store abstract methods
        Interface is meant to be implemented, cannot be final
        we can implement multiple interfaces to the class by implements keyword
        When we override Interfaces' abstract methods, the access modifier needs to be more visible
            
        we cannot create object from both interface and abstract class, because object needs to be concrete
    Interface Can Have:
            methods: abstract method, static method, default method
                    public abstract void methods();
                    public void method();
                public access modifiers are given by default to all methods
            variables: public static final ==> automatically
    Interface Can Not Have:
            Methods: Constructor, instance methods
            variables: instance variable
            blocks: static initializer block, instance initializer block
Restrictions of abstract method:
                    cannot have body
                    cannot have private access modifiers 
                    cannot have static and final specifiers
                    MUST be created in abstract class or an Interface
Abstract class VS Interface:
            both can have abstract methods, used for achiving abstractiom
            cannot create object from them
            both of them cannot be final
            Abstract class: meant to be extended to the regular class, extends keyword
                    methods: abstract and all non-abstract methods
                    variables: any variables
                    blocks: both instance and static blocks
                sub class can only extend one abstract class
            Interface: meant to be implemnted to the regular class, implemnts keyword
                    methods: we can only have abstract, static, and defult methods
                    variables: public final static  by default
                    blocks: cannot have any blocks
                sub class can implemnet multiple interfaces
 */

