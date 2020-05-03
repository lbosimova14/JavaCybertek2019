package Lesson20_SuperKeyword;
/*this. : is not similar with super.
 *super. :it is used for calling instance(instance variable and method), that are from super class 
 *super keyword can only be used in the subclass
 *
 *this. VS super.:
 *     this.:used for calling the instances from class itself
 *             to use this. , we dont have inheritance
 *     super.: used for calling the instance from super class
 *             to use the super . Must  have super class and sub class
 *             
 *  Constaructor: craete object, sepetiaol method, in hereinace, it can not be inherinace automaticali, you need to manually
 *  at least one constructor from the siper class has to be called in the yhe sub class           
 */
//create class

class A{
	String name="Madina";
	//not only sub class
	public void methodA() {
		
	}
	//default constructor //if you inharitang this class,and create constructar manualli on sub class
    
    public A (int a) {
    	
    }
	
}

public class SuperKeyWord extends A {
//           sub                super
	
       // public A (int a) {} this constructor not called yet and that is why giving compile error,bc superclass cons didnt called
    // so , how to call it?    by using super() keyword
	//super(): used for calling cont from the super class
	//this(): used for calling the conr from the class itself
	
	// create sub class constructor and call super class constructor
	public SuperKeyWord() {
		super(10);//(int a)
	}
	
	
	
	
	//inharitang A can use features on su b class SuperKeyWord 
	//now this class has this features also
	//String name="Madina";
	// if I want to change name, I use super.
	
	public void method() {
		super.name="Muhtar";
		this.name="Ihsan";
		//call instance method by using this. keyword
		this.methodA();
	}
}
