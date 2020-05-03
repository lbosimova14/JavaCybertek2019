package Lesson26_Polymorphisim;

class Animal {
    public void method1() {
    }
}
    class Dog extends Animal {
        public void method2() {
        }
    }
public class UpCasting {
    public static void main(String[] args) {
        System.out.println((double) 10);
        
        //Upcasting : casting subclass to superior type
        Dog obj = new Dog();
        Animal obj2 = (Animal)obj;
        
        Animal obj3 = new Animal();
        
        //Dog obj4 = (Dog)obj3; // not allowed
        
        System.out.println("Hello");
        
        
    }
	}

/*
 * Class Notes
 *there are TWO types of castings between class:
        RemoteDriver implements WebDriver, JaveScriptExecuter, TakeScreenSH
    multiple reference name, refer to the same object ( same memory)
        ChromeDriver extends RemoteDriver
            1. UpCasting: converting sub type to super type
                    Always allowed to use
                WebDriver driver = new ChromeDriver();
                // JavaScriptExecuter js = new ChromeDriver(); // not the same browser we are automating the test case with. new window
                JavaScriptExecuter js = (JavaScriptExecuter)driver;
                    js.ExecuteScript("window.open()")''
                TakeScreenShot ts = new ChromeDriver();
                TakeScreenShot ts = (TakeScreenShot) driver;
                    ts.TakeScreenShotAs("");
            2. Downcasting: converting super type to sub type
                            not allowed. throw ClassCastException
OOP Summary:
    OOP: Object Oriented Programming
        1. Encapsulation: data hiding by giving private access modifier to the variable, and provide public getter/setter
            benifits: control the data condition. ( by using setter)
                      Data Security
            if the private data is final, we can ONLY generate getter
        2. Inheritance: sub & super relationship. methods & variables of one class can be inherited to another
                        super --> sub
            benefits: reusable
                       easy to maintain
                       orginized
        3. Abstraction: hiding the implementation. concentrating on the importance/essentials without worrying about the details
                2 ways to achieve abstraction:
                            1. Abstract class
                            2. Interface
                benifits: reusability
                          able to focus on what to do instead of how to do
        4. Polymorphisim: object behavior in many forms.
                        super class/interface can be reference type to any child class' objects
                benifits: flexible
                    - one single variable with reference type of parent class is able to any objects of child class
 */
