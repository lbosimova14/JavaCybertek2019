package Lesson20_SuperKeyword;

import Lesson19_Inheritance.ProtectedVariables;

class Data {
	public static int num1=10;
	protected static int num2=20;
	private static int num3=20;
	static int num4=40;

}

public class InheritanceReview extends Data{
	//         sub                     super
	
//	public static int num1=10;  inharitance as is, as static, if instance ,inharited as instance,and need to create object
//	protected static int num2=20;
//	static int num4=40;
	static int staticNum;//static variable
	int insNum;//belong to object, can create multiple object from the class
 
	public static void main(String[] args) {
	
  //Error     System.out.println(this.insNum);//in order to call instance in a static method or block, we Must have object
		
		System.out.println(num1);//public yes inheratibale
		System.out.println(num2);// protected,yes
		//System.out.println(num3);Error private never can be inhereted
		System.out.println(num4); //default ,yes
		
		/*Data obj2=new Data
		 * System.out.println(obj.num1);//only public visiable outside packege, if
		 * System.out.println(obj.num2);
		 * System.out.println(obj.num4);
		 * 
		 */
		ProtectedVariables obj1= new ProtectedVariables();
	///	System.out.println(obj.nameProtected); //protected is not visiable
		System.out.println(obj1.namePublic); // public is wordwide
		
		InheritanceReview objA=new InheritanceReview();
		objA.staticNum=100;
		objA.insNum=200;
		
		InheritanceReview objB=new InheritanceReview();
		objB.staticNum=300;
		objB.insNum=400;
		System.out.println(objB.staticNum);//300 shared value
		System.out.println(objB.insNum);//0// didnd assigned yet,200 is for objA
		
		

	}
}
/*  this : used for calling instance variables, can only be used in object instance
 * 
 * 
 * 
 */
