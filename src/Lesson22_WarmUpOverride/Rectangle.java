package Lesson22_WarmUpOverride;

public class Rectangle extends Shape{
       double length ,width;
       
      public Rectangle(double length,double width) {
    	  this.length=length;
    	  this.width=width;
    	  
      }
       
       @Override
       protected void Area() {
   		System.out.println("Area of rectangle is :"+ length*width);
   	}
       @Override
       protected void Parameter(){
      	 System.out.println("Parimeter rectangle is: "+(width + length) * 2);
       }
}
