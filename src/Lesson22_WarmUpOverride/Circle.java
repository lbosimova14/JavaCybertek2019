package Lesson22_WarmUpOverride;

public class Circle extends Shape {
	  double radius;
	  final double PI=3.14;
	  double diameter=radius*2;
	  //Constructor
	  public Circle(double radius) {
		   this.radius=radius;
		   diameter=radius*2;
		   
	   }
	  @Override
	  protected void Area() {
		System.out.println("Area of circle is :"+PI * radius * radius);
		}
	  @Override
	  protected void Parameter(){	 
	    System.out.println("Parimeter of circle is :"+ PI * diameter);
	     }
}
