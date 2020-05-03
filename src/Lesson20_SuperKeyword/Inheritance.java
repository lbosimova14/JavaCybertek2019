package Lesson20_SuperKeyword;

class AAA {
    
    public String name1 = "Ayaz";
    
    public void mm() {
        // super.name1 = "Hakan";  // super keyword MUST be used in sub class
    }
    
    public static void N() {
        
    }
    
}
class BBB extends AAA{
    
 // public String name1 = "Ayaz"; // Feride
    public String name2 = "Sukran";
    public String name3 = "Erhan";
    
    public static void J() {
        
    }
    
    public void method1() {
        super.name1 ="Feride";
        super.mm();
        super.N();
        this.J();
    }
    
}
public class Inheritance  extends BBB {
    
//  public String name1 = "Ayaz";
//  public String name2 = "Sukran";
//  public String name3 = "Erhan";
    
    public String name4 = "Mehmet";
    public String name5 ="Mahribana";
    
    
    public static void main(String[] args) {
        
        Inheritance obj = new Inheritance();
        
        System.out.println( obj.name1  ); 
        System.out.println( obj.name2  ); 
        System.out.println( obj.name3  ); 
        System.out.println( obj.name4  ); 
        System.out.println( obj.name5  ); 
        
        System.out.println("===================");
        
        BBB obj2 = new BBB();
        System.out.println( obj2.name1  ); 
        System.out.println( obj2.name2  ); 
        System.out.println( obj2.name3  ); 
    //  System.out.println( obj2.name4  );   //super class cannot inherit anything from the sub class
    //  System.out.println( obj2.name5  );  //super class cannot inherit anything from the sub class
        
        System.out.println("=============================");
        
        AAA obj3 = new AAA();
        System.out.println( obj3.name1 );
//      System.out.println( obj3.name2  ); //super class cannot inherit anything from the sub class
//      System.out.println( obj3.name3  ); //super class cannot inherit anything from the sub class
    //  System.out.println( obj3.name4  );   //super class cannot inherit anything from the sub class
    //  System.out.println( obj3.name5  );  //super class cannot inherit anything from the sub class
        
        
        
        
        
        
        
    }
    
    
    
    
}

