package Lesson19_Inheritance;
//subclass: sub class inherits features from the super class sub class gets rich
//subclass protected methods can be inharitable
//public and protected always be inharitable in subclass,
//default access modifier,only be inherited to the classes
//superclass: super class does not inherit anything from the sub class
//private never can be inhereted
public class I05_ChildClass extends I04_ParentClass{
	//      sub                     superclass
	
	/*
	 * they are somewhere,but not visiable, like gohst
      super class all members are here now.
       protected static String password="0000";
       public static int age=12;
       static double salary=100000;
	 */
	public static void main(String[] args) {
		//System.out.println(username);//private
		System.out.println(password);
		System.out.println(age);
	}

}
