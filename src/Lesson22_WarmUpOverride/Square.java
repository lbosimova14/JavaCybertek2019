package Lesson22_WarmUpOverride;

public class Square extends Shape{
  double side;
  
  //constructor 
  public Square(double side) {
	  this.side=side;
  }
  @Override
  protected void Area() {
		System.out.println("Area of square is: "+side*side);
	}
  @Override
  protected void Parameter(){
 	 System.out.println("Parimeter of square is :"+side*4);
  }
}
