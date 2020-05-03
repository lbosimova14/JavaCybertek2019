package Lesson19_Inheritance;
/*
 * features that have public and protected access modifiers can be inherited anywhere,even outside packages.
 * features that have default access mod:can only be inherited to the classes that are in the same package with
 * features that have private access modifier can never be inherited
 */
//super class
class TestBase{
	static String chromeDriver;//default(visibale in clasess same package)
   
	//  static method
	public static void TakeScreenShot() {
		System.out.println("teake screenshoot");
		
	}
	//private method
	private static void closeBrowser() {
		System.out.println("Browser closed");
		//this features not visiblble and not inhetitable
	}
}
 


//subclass
public class I03_Inheritance  extends TestBase{
	    //     sub                    //super
//Inheritance/sub class gonna inherit all the visible or protected features from the super class
	/*you cannot see it but in there in the back
	 * static String chromeDriver
	 * System.out.println("teake screenshoot");
	 */
	public static void main(String[] args) {
		System.out.println(chromeDriver);
		TakeScreenShot();
	}
}
//one super class can have multiple sub classes