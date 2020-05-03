package Lesson26_Polymorphisim;

//1st interface
interface Interface{
	abstract void get();
}
//2nd interface
interface Interface2 extends Interface{
	abstract void frame();
	
}

//abstract class
abstract class AbcClass{
	
}
public class Task extends AbcClass implements Interface,Interface2 {
	//   subtype             supertype
	
	@Override
	public void get() {
		System.out.println("Chrome browser");
	}
	@Override
	public void frame() {
		System.out.println("frame");
	}
	
	public static void main(String[] args) {
    	Interface obj = new Task();  //if we make the interface as refernce type, object Must be created from
    	//the classes(nonabstracted) that are implementing interface/subtype
    	obj.get();//Chrome browser
    	
    	Interface2 obj2= new Task();
    	obj2.frame();//frame
    	//obj2.get();//run time error, bc this method was not in Interface2
    	obj2.get();//Chrome browser   now printing, bc we extends Interface1, copying  its all methods
    	
    	AbcClass  obj3=new Task();
    	//obj3.  //run time error bc not method created yet
	}
}
