package Lesson21_MethodOverriding;

/*
 * final keyword: constant, cannot be changed or modified
       final key word can only be applied to: 
                   variables: we cannot re-assign it
                           instance variables and static variables MUST be assigned immedietly
                           local variable needs to be assigned before use 
                       if the private data is final, we can only generate getters
                           cannot have setters
                   methods: the implementation of the method cannot be changed
                           final methods cannot be override
                           final methods can be overload
                           main method can be final
 */
class Credentials{
    
    private final String UserName = "cybertek";
    private final String PassWord = "Batch12";
    
    
    public String getUserName() {
        return UserName;
    }
    
    /*
    public void setUserName(String UserName ) {
        this.UserName = UserName;    
        // final variables cannot be re-assigned
    }
    */
    
}
class Holly {
    
     public  final void printName() {
        System.out.println("Erhan");
    }
    
}
public class FinalKeyword extends Holly {
    
    /*
    @Override
    public void printName() {
        System.out.println("Madina");
    }
            final methods cannot be override
    */
    
        final int AGE =100;
    
    public final static void main(String[] args) {
        
        final String SSN = "123456";
        // SSN = "654321";   
            // final variables are constant and cannot be reassigned
            
        System.out.println(SSN);
        
        final String DateOfBirth;
        
    //  System.out.println(DateOfBirth);
        
        FinalKeyword obj = new FinalKeyword();
        
        System.out.println( obj.AGE );
    
        
    }
    
    
    public final static void add(int a, int b) {
        System.out.println(a+b);
    }
    
    public static double add(double x, double y ) {
        return x+y;
    }
}
