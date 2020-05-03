package Lesson22_WarmUpOverride;

public class Cylinder extends Shape{
	//     sub           super
	//what info, data need in order to calc, we need radius height
    double radius, height;
    final double PI=3.14;
    double diameter;
      
    public Cylinder(double radius,double height) {
    	this.radius=radius;
    	this.height=height;
    	diameter=radius*2;
    }
    @Override
    protected void Area() {
		System.out.println("Area of cylinder is :"+(PI * diameter*radius ) + (height*PI*diameter));
	}
    @Override
    protected void Parameter(){
   	 
   	 System.out.println("Parameter of cylinder is: "+2* (PI * diameter + height));
    }
    
    
    //not overriding
    public void Volume() {
    	System.out.println("Volume of cylinder is :"+(PI * radius * radius * height) );
    }
}
