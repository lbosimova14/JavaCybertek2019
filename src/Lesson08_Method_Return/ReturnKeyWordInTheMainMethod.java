package Lesson08_Method_Return;

public class ReturnKeyWordInTheMainMethod {

	public static void main(String[] args) {
	
	     System.out.println("Hello");
	        
	        /*
	        if(true) {
	            return;
	        }
	        */
	        
	        System.out.println("Hola");  // once return statement is executed, it exits the method
	        	        
	        for(int i=0; i < 5; i++) {
	            if(i == 3) {
	               return;
	            }
	        System.out.println(i);
	        
	        }
	        
	        System.out.println("Completed");
	        
	        
	        
	    //  return "text";;
}
}