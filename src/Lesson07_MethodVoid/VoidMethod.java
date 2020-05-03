package Lesson07_MethodVoid;
//
public class VoidMethod {
	/*
        declaration of method:
        access-modifier   specifier   return-type  methodname() {
                    statements;
                }
       */
    
    public static void main(String[] args) {//main method stars
        
        myFirstMethod();
        
        even1To100();
          
    }//main method ends
    
    public static void even1To100() {//method 1 stars
        for(int i=0; i <= 100; i++) {
            if(i %2 != 0) {
                continue;
            }
            System.out.print(i+" ");
        }
        
    }//method 1 ends
    
     public static void myFirstMethod() {//method2 stars
        
    //  public static void main(String[]) {  }  
                // methods must be decleared within the class
        
        System.out.println("Hello World");
        System.out.println("Hello Cybertek");
        System.out.println("Hello Khurshed");
            
    }//method2 ends
	}//class ends


