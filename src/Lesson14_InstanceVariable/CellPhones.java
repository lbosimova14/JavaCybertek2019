package Lesson14_InstanceVariable;

public class CellPhones {

   //instance variables:declared in the outside any method,create within class, used storing data belongs to object
	//also called fields,properties of object, global variable
	String brand;
	double screensize;
	String color;
	double price;
	String model;
	   

 //
//set up default constructor,resign set up attributes 
	public CellPhones() {
		brand="iPhone";
		model="10";
		screensize=5.8;
		color="White";
		price=700.0;
	}
	//constructor with parameters,overloading uqoridagi default constructor
	//maint advantenges is : 5 parameter same variable you know which variable you giving
		public CellPhones(String brand,double screensize,String color,double price) {
			this.brand=brand;
			this.screensize=screensize;
			this.color=color;
			this.price=price;
		}

//create instance method:method does not have static specifier, return type must have,belongs to object,shuld be called
//through object, may have local variable, it is not visible outside method,only be used within this method
//local varibale can be same name as a instance variable	
	public void call(long PhoneNumber) {
		System.out.println(brand+""+model+" is calling "+ PhoneNumber);
	}
	public void SendMessage(long PhoneNumber) {
		System.out.println("Sending messages to "+ PhoneNumber);
	}
	
	public void getInfo() {
	 System.out.println(brand+" "+model+" "+color+" "+screensize+" $"+price);
	}
}
