package Lesson18_Encapsulation;

public class learnImport {
	  //static variable(import to another class) 
    public static String Name ="Juline";
    public static String ID = "007";
    public static String SchoolName = "Cybertek";
    
    static int age=20;//access modifier is default:only visible to class in the same package,not visible outside the package
    protected double number=123;//protected variable
    
    //static method:
    public static void hello() {
    	System.out.println("Hello word");
    }
    
}
