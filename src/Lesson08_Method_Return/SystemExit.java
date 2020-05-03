package Lesson08_Method_Return;

public class SystemExit {

	public static void main(String[] args) {
		
		
	//	System.out.println(method1());
		
		System.out.println("befor exit system");
		System.out.println(number());
		System.out.println("Done");
		

	}
	
	
	public static void method1() {
		System.out.println("hello word");
		System.exit(0);
	}
	
	
public static int number() {
	if(true)
		System.exit(0);//exit all the java excution
	return 5;
}
}
