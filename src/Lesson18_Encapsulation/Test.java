package Lesson18_Encapsulation;

public class Test {
public static void main(String[] args) {
	
	TestData obj= new TestData();
	System.out.println(obj.getName());//hide this data,outside class not get access this data
	//how we hide this: we need access modif is private,it gives retrictin of data,if feature private only visiable 
	//class,code outside the class cannot access to the data
	//if change to private red/compile error,reson data private.
	//2.grants other classes get access to the private data using public getter and setter
	
	//System.out.println(obj.ID);//private //error   make it public for access or create getter method
	System.out.println(obj.getID());
	
	//modify obj.Name="Nura";
	//System.out.println(obj.Name);
	//System.out.println(obj.setName());
	
	
}
}
