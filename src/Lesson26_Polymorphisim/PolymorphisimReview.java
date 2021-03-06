package Lesson26_Polymorphisim;
/*
 * 
 */
class A{
	protected void methodA() {
		System.out.println("Method A from a class");
	}
	
	public static void methodC() {
		System.out.println("method c from A class");
	}
	
}
class B extends A{
	//child   parents
	public void methodB() {
		System.out.println("Method B");
	}
	public void methodA() {
		System.out.println("method a from B class");
	}
	public static void methodC() {
		System.out.println("method C from B class");
	}
}

abstract class C{
	
}
class D extends C implements E{
	
}
interface E{
	
}
abstract class F implements E{

	
}
public class PolymorphisimReview {
	public static void main(String[] args) {
		A obj =new A() ;
	//	A obj2 = new B(); //Error bc, not extended,not is Relation yet,make parents of sub class
		A obj2= new B(); // as soon as extends B class to A class error gone	
		   
		obj2.methodA();
		//   obj2.methodB();//Polymorphisim occurs when a super class/ interface is reference and object from is creaed from child class
		   
		//only parent can be reference, child class cannot be reference of parents class
		//B obj3 = new A(); //Error
		//child        parent
		
	//	C obj4 = new C();//Error: abstract class is not concrete, cannot create obj from absract class or interface
		C obj5=new D(); //now D created and extends to C abstract class,and you can create obj
		//if we make abst class as reference, obj MUST be created from sub class(non abstract)
		
		//E obj6= new D();//Error not is relation 
		
		//now implementing D and C
		E obj6=new D();
		//D obj7 = new E(); we cannot create obj from interface
		//C obj8 = new E(); // we cannot create obj from interface
		
		  A obj11 = new B();  
          obj11.methodA();   //method a from B class
      //  if a method is exist in both reference type and object, the overridden one gets executed
          
          obj11.methodC();//method c from A class
          // if the method is not being overriddedn, then the reference type' method gets executed
		
	}

}
/*
 * Class NOTES:
 * Topic: Polymorphisim Reveiw
       Type Castings:
                UpCasting
       OOP Summary
Agenda:
    Morning: Java
    Afternoon : Selenium
package name: day56_Polymorhisim
Polymorphisim:  occures when a super class/interface is reference and object from is created from child class
            A   extends   B
            sub          super
            B        obj       =   new     A()
        ref-type   ref-name           object
        reference type decides what can be accessbile
        child class cannot be the reference to parent class' object.
        if we make the abstract class as reference, object MUST be creatd from sub class(non abstract)
        if we make the interface as reference, object MUST be created from the classes(Non Abstract) that's impleenting the interface 
        A obj11 = new B();  
            obj11.methodA();   // from B clas
        //  if a method is exist in both reference type and object, the overridden one gets executed
            
        obj11.methodC();
            // if the method is not being overriddedn, then the reference type' method gets executed
            
        WebDriver driver = new ChromeDriver();
                driver.get("URL")  // opens the chrome browser,  overridden
interface: WebDriver, WebElemnet, JavaScriptExecuter, TakeScreenShot...
IS A: inherited/implemneted relation between class
        
        Dog extends Animal
        PitBull extends Dog
        Dog IS An Animal
        Pitbull IS A Dog
        PitBull IS An Animal
Has A:
        class Car{
            Engine obj = new Engione();
        }
        Car HAS An Engine
        class Zoo {
            Lion li = new Lion();
            Tiger ti = new Tiger();
            ....
        }
        Zoo Has A lion
        Zoo Has A tiger
method Overriding: same method name , same parameter
            only the instance method can be overridden
            HAS to be overridden in the sub class
            Cannot be private, static, final
            access modifier needs to be same or more visible
            return-type HAS to be same
            @Override has to be applicable
*/
