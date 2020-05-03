package Lesson16_staticKeyWord;

public class StaticKeyWord_Class {
  public static String name="LauloStatic";
  public String insName="LauloInstance";
  
  //static method
  public static void printName() {
	  System.out.println(name);//static only accepts static
	 // System.out.println(insName);//you cannon call instance variable in static method
  }
  
  // instance method
  public void printNameIns() {
	System.out.println(name);//accepting static variable
	System.out.println(insName);//also accepting instance variable
}
















}//class ending
