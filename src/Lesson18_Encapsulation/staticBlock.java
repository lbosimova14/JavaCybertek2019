package Lesson18_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlock {
	//declary static varible
	static String[]arr=new String[3];
	static ArrayList<String> list =new ArrayList<>();
	 double salary;
	
	
	//static block:excute 1 time
	static {
		System.out.println("static block");
		arr[2]="Alla";
		arr[0]="Katy";
		arr[1]="Ruslan";
		list.addAll(Arrays.asList(arr));
		//salary =5000;//static only accepts static
		//call nonstatic variable,buning uchun create obj
		staticBlock obj1=new staticBlock();
		obj1.salary=60000;
		System.out.println(obj1.salary);
		
	}
	
	

public static void main(String[] args) {
	System.out.println("main method");
	
	//print array
	System.out.println(Arrays.toString(arr));
	System.out.println(list);
	staticBlock obj1=new staticBlock();
	System.out.println(obj1.salary);
	
	
	
	
}
}//class ending



//static ChromeDriver driver=new ChromeDriver();

//used for preconditions
/*static{
 * driver.manage().window().miximize();
 * }
 * 
 */