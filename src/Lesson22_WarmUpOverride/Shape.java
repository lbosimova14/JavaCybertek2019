package Lesson22_WarmUpOverride;
/*
 * 
WarmUp: 
    1. create a class called Shape
            Actions: Area(), perimeter(), capacity()
    2. create sub classes of Shape:
                        Circle
                        rectangle
                        square
                        cylinder
        and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
    3. override super class' Area(), perimeter(), capacity() methods to the sub classes
Formulas:
    Area of the circle:     3.14 * radius * radius
    Area of the rectangle:  width * length
    Area of the square:     side * side
    Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
    Parameter of circle:    3.14 * 2 * radius
    Parameter of rectangle: (width + length) * 2
    Parameter of Square: 4 * side
    volume of cylinder: 3.14 * radius * radius * height .
 */
public class Shape {
	
	//actions:
	protected void Area() {
		System.out.println("Area is 0");
	}
     protected void Parameter(){
    	 
    	 System.out.println("Parameter is 0");
     }
     protected void Capacity() {
    	 System.out.println("Capacity  is 0");
     }
     
     //main method
     public static void main(String[] args) {
    	          //rectangle class object
    	 Rectangle rectangle=new Rectangle(20,30);
    	 rectangle.Area();  //:600.0  //rectangle is object,Area is method
    	 rectangle.Parameter();// 100.0
    	 rectangle.Capacity(); //0
    	// rectangle.length=100; //constructor making short way this instide
    	//rectangle.width=20;
    	            //second rectangle
    	 Rectangle rectangle2=new Rectangle(10,10);
    	 rectangle2.Area(); //100.0
    	 rectangle2.Parameter();// 40.0
    	 rectangle2.Capacity();//0
    	            //square class object
    	 Square square=new Square(5);
    	 square.Area();//25.0
    	 square.Parameter();//20
    	 square.Capacity();//0
    	         //circle class object
    	 Circle circle=new Circle(15);
    	 circle.Area();//706.5
    	 circle.Parameter();//94.2
    	 circle.Capacity();//0
    	 
    	     //cylinder class object
    	 Cylinder cylinder=new Cylinder(2,5);
    	 cylinder.Area();//25.1262.800000000000004
    	 cylinder.Parameter();//35.120000000000005
    	 cylinder.Volume();//62.800000000000004
	}
}
