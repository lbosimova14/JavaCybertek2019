package Lesson21_MethodOverriding;

class Mahribana{
	//default access modifier
	void MethodA() {
		// RULE: the method we are going to override Must be inheritable to the sub class
		System.out.println("Method A");
	}
	
	/* 
	 * private void MethodA() {
		System.out.println("Method A");
	}
	 * 
	 */
	protected double salary(double bonus) {
		return bonus+10000;
	}
}

public class AccessModifiers extends Mahribana{
//check is it overrided or not, use @Override 
/*	@Override 
	void MethodA() {
		System.out.println("Method A");
	} */
	//not, it is not overrided,bc class not  extended,make AccessModifiers public class sub class to Mahribana super class
	//then error desipeare
	//now check : Rule:override method access modifiers need to be same or more visiable
	//when you try to make private, super class method,it gives compile
//	            default ==> default, protected, public
//              protected ==> protected, public
//              public ==> public
//              private ==> cannot be overridden

//override salary method
	@Override
	protected double salary(double bonus) { //if you change parameter to int, it not overriding,it is being overloading
		return bonus+10000;
	}
	
}
