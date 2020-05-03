package Lesson16_staticKeyWord;
//import statement: import PackageName.className;===>to import single class
import Lesson12_MethodLayeredFasion.MethodCalls;
import Lesson14_InstanceVariable.BankAccount;
public class StaticKeyWord_Main {

	public static void main(String[] args) {
		
		
		//static method call it through class name
		StaticKeyWord_Class.printName();//LauloStatic
		//StaticKeyWord_Class.printNameIns();//Error

		StaticKeyWord_Main.printName();//StaticKeyWord_Main name
		printName();//StaticKeyWord_Main name
		
		MethodCalls.method1();//A //boshqa packagedan(import Lesson12_MethodLayeredFasion.MethodCalls;) shu packagega chaqirayapti
		//import qilib,instance methodni,class name and method name yoz nuqta bn buldi,shu classda print out buladi
		
		//importing other package
	     BankAccount acc= new BankAccount();      
	     acc.Showbalance();
	     
	
	
	
	}//main method ending
	
	
	//create another static method in this class and call in thos calls main method
	public static void printName(){
		System.out.println("StaticKeyWord_Main name");
	}
	

}//class ending
