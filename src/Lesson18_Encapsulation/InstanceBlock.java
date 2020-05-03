package Lesson18_Encapsulation;

import java.util.Arrays;

public class InstanceBlock {
     String []name=new String[3];
	{
		System.out.println("instance block");
		name[0]="Alla";
		name[1]="Alla";
		name[2]="Alla";
		
	}
	//constructor
	public InstanceBlock() {
		System.out.println("Constructor");
		name[0]="la";
		name[1]="la";
		name[2]="la";
		//this constructor compiling, bc last iniziliser excutes
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		InstanceBlock obj1=new InstanceBlock();
		//System.out.println(Arrays.toString(name));//gives error,static only acceps static, (main method is static in here)
		System.out.println(Arrays.toString(obj1.name));//[Alla, Alla, Alla] after constructor inizilizeng [la, la, la]
		
		//create another object
		InstanceBlock obj2=new InstanceBlock();//instance block
		                                         //Constructor
		
	}
}
