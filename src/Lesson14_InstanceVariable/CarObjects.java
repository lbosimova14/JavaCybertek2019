package Lesson14_InstanceVariable;

import java.util.Arrays;

public class CarObjects {

	public static void main(String[] args) {
		Car    car1    =   new        Car(); //first object
//classname  objectName  keyword   constructor	
		Car  car2  =new  Car();//second object(give different obj name)
		Car  car3 = new  Car();//default values
		
		 car1.model="Toyota";
		 car1.brand="Camry";
		 car1.color="yellow";
		 car1.mile=20;
		 car1.price=25000;
		 car1.MadeInCountry=new String[] {"China","USA","Japan","Italy"};
		
		 car2.model="BMW";
		 car2.brand="X6";
		 car2.color="Black";
		 car2.mile=3000;
		 car2.price=250000;
		 //each car object keeps its own copy of the variables,which can be accessed and modified indepently
		 System.out.println("Model is "+car1.model+", Brand is: "+car1.brand+", Color is: "+car1.color+", Mile is: "
		                +car1.mile +", Price is: " +car1.price);
		 System.out.println("Model is "+car2.model+", Brand is: "+car2.brand+", Color is: "+car2.color+", Mile is: "
	                +car2.mile +", Price is: " +car2.price);
		 System.out.println(car1.MadeInCountry);
		 System.out.println(Arrays.toString(car1.MadeInCountry));//1st way to print out
		 
		 for(int i=0;i<car1.MadeInCountry.length;i++) {
		 System.out.print(car1.MadeInCountry[i]+" \t\t");
		 }  //2nd way to print out
		 System.out.println();
	//calling 'drive' method
		 //car1.drive(); //Camry is driving            //object.method
		 car2.start();//X6 is starting
		 car1.getInfo();//Model is Toyota, Brand is: Camry, Color is: yellow, Mile is: 20, Price is: $25000
		 car3.getInfo();//Model is null, Brand is: null, Color is: null, Mile is: 0, Price is: $0

	}

}
