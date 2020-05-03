package Lesson14_InstanceVariable;

public class Car {
//public is access modifier allow to use anywhere
	 String model,brand,color;  //instance variables:object variables,must declared in the class and outside any method
	 int price,mile,Vin;//used to hold data of objects,part of the class blueprint
	 String [] MadeInCountry;  //using array
//instance methods: methods belong to the object,does not have the specifier static. designed to work as an instance of class
	 //access-modifier returnType methodName(parameter)  (no static keyword)
	 
	 //action: drive
	 public void drive() {
		 System.out.println(brand +" is driving");
	 }
	 // start method
	public void start() {
		System.out.println(brand+" is starting");
	}
	//getInfo method
	public void getInfo() {
		System.out.println("Model is "+model+", Brand is: "+brand+", Color is: "+color+", Mile is: "
                +mile +", Price is: $" +price); 
	}

}
