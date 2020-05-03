package Lesson19_Inheritance;
/*
 * Multiple classes:we can have only
 */

//class 1 (public) public class name must match .java class,(only one public class),you cannot do public A class
//if you want extra class make default class
public class I01_MultiClass {
	public static void main(String[] args) {
		System.out.println("Main public class");
	}

}
//class 2nd (default) 
class A{
	//main method can create any class even default
	public static void main(String[] args) {
		System.out.println("Default A class");
	}
	//when run time java asks which one do you want run,should select one of them
	
}
class B{
	public static void main(String[] args) {
		System.out.println("B class");
	}
}
//java only create one file