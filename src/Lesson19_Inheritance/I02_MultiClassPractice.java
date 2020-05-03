package Lesson19_Inheritance;

   //1st Class
class Data{
	//instance variable(if inner class,it  would be static)
	public String name;
	private String age;
	String ID;
	protected String DOB;
	
	//create instance method
	public void Hello() {
		System.out.println("Hello public");
	}
	private void Hola() {
		System.out.println(" Hola private");
	}
	void Aloha() {
		System.out.println("Aloha default");
	}
	protected void Salom() {
		System.out.println("Salom protected");
	}
	
}

//   2nd Class
public class I02_MultiClassPractice { 
	public static void main(String[] args) {
		
	
   //call instance variable,you need object,create obj
	Data obj =new Data();
	System.out.println(obj.name);//public is visibale at everywhere
	//System.out.println(obj.age);//private is not visible outside the class  ERROR
	System.out.println(obj.ID);//default access modifer is visible to class
	/*
	 * if those classes were located in two defferent packages,then the default acc mod is not gonna visibale
	 */
	//call methods find out which acces/mod is applicable
	obj.Hello();//Hello public
	//obj.Hola(); ERROR cannot call private method in another classs, give setter and getter
	obj.Aloha();//Aloha default visiable to classes,bc same package
	obj.Salom();//  only visible to the classes in the same package.
}
}