package Lesson13_Constractor;

public class C06_ConstructorCalls3 {
         //default constructor

    public C06_ConstructorCalls3() {
        //this("Hello");
        System.out.print("Erhan ");
    }
    
    public C06_ConstructorCalls3(int a) {  // Erhan Ali
        this(); // Erhan
        System.out.print("Ali ");  // Ali
    }
    
    public C06_ConstructorCalls3(double a) {  //  Erhan Ali Shawkrat
        this(100); // Erhan Ali
        System.out.print("Shawkrat ");
        // this(10);      constructor call must be the first step
    }
    
    public C06_ConstructorCalls3(boolean a) {   //  Erhan Ali Shawkrat Dinara
        this(2.5);   //  Erhan Ali Shawkrat
        System.out.print("Dinara ");
    }
    
    
    public C06_ConstructorCalls3(String str) {  // Erhan Ali Seyfo
        this(100); // Erhan Ali
        // this(true); // one constructor can only ccall one constructor 
        System.out.print("Seyfo ");
    }
    
    public C06_ConstructorCalls3(byte a) { // Erhan Ali Seyfo Sabir
        this("hello"); // Erhan Ali Seyfo
        System.out.print("Sabir ");
    }
        
        
	public static void main(String[] args) {
        	
       
        	C06_ConstructorCalls3 obj2=new C06_ConstructorCalls3((byte)2);
	
}

}
