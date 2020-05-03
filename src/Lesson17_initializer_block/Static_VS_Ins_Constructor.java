package Lesson17_initializer_block;

public class Static_VS_Ins_Constructor {

	public static void main(String[] args) {
	

		Static_VS_Ins_Constructor obj=new Static_VS_Ins_Constructor();//obj create qilish bn uchala statement excuting
		//no matter constr qaerda joylashmasin last excuting:Static block
		//                                                    instance block
		//                                                      Constructor
		
		Static_VS_Ins_Constructor obj1=new Static_VS_Ins_Constructor();
	//number of execution of constructor and instance block depends on the number of object
		
	}//main method ending
	
	
//static block,only executes one time, doesn't depend on object
	static {
		System.out.println("Static block");//only excuting only one time
	}
	
	
	//constructor excited depends creation of object
	public Static_VS_Ins_Constructor() {
		System.out.println("Constructor");
	}
		
		
	//instance block, execitons depends on the object,excute bulish uchun create obj
	{
		System.out.println("instance block");
	}
	
	
	
}//class ending
