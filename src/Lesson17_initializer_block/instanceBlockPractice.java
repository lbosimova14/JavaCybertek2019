package Lesson17_initializer_block;

public class instanceBlockPractice {
//isn var: declared in the class, outside any methods(object)
	//each obj has own copy of inst var
	public String name="Shirin";
	
	//create ins block:
	{
		name="Mihray";
	}
	          //constructor   it excutes after all instance variables
	public instanceBlockPractice() {
		this(10);//does not print muhtar ,bc second step dinara, compiler takes last iniziliser one, and output will be Dinara
		name="Dinara";//ins first runs then constructor later, last
	}
	
	//yes we can create overload constructor
	public instanceBlockPractice(int a){
		name="Muhtar";
	}
	//second inst block
	{
		name="Mac";
	}
	
	public static void main(String[] args) {
		instanceBlockPractice obj =new instanceBlockPractice();
		    //obj.name="Ayjamal";
		System.out.println(obj.name);//calling ints variable 1st Shirin, we assigned name=Mihray,compile takes last inishilazer
		
		instanceBlockPractice obj2 =new instanceBlockPractice();
		System.out.println(obj2.name);
		//in oreder both constructor ecute bulish uchin call argument constructor
		instanceBlockPractice obj3=new instanceBlockPractice(10);
		System.out.println(obj3.name);
	}
  
}
