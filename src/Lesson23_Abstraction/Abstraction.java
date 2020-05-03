package Lesson23_Abstraction;

public abstract class Abstraction {
//it can be any accesses modifire acsept private
	public abstract void startTheCar(); //giving compile error, bc we cannot create regular class, this class will create in abstract class or interface
	
		
	
	
}
class A  extends Abstraction{
	
	//public abstract void startTheCar();    //cannot be created in nregular class
	//give the body ({}) to the method,now it is overriding,abstract keyword is gone after override
	@Override
	public  void startTheCar() {
		System.out.println("Brake");
		System.out.println("push the start button");
		System.out.println("Release the brake");
	}
	
	
	public static void main(String[] args) {
		//Abstraction obj =new Abstraction();  we cannon create object
	}
}

//create anothe class and extend class "Abstraction"
class Tesla extends Abstraction{
	//regular class Must implement the abstract methods from the abstract
	public  void startTheCar() {
		System.out.println("voice consrol");
		System.out.println("driver");
	}
}
