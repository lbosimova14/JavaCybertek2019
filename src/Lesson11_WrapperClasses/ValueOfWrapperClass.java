package Lesson11_WrapperClasses;

public class ValueOfWrapperClass {

	public static void main(String[] args) {
	      
	    // ValueOf methods: converts String value to Wrapper class values, returns wrapper class values
	            
	            int z = Integer.valueOf("1234"); // unboxing
	            Integer z1 = Integer.valueOf("1234"); //  none 
	            
	            Integer z2 = (int)Integer.valueOf("1215"+3);  // auto-boxing
	            
	            System.out.println(z2);
	            
	            
	            
	            
	        boolean result1 = ! Boolean.valueOf("TRUE");  // unboxing
	    System.out.println(result1);  // ValueOf methods ignores the case sensitivity
	            
	            
	            
	    
	    
	            int totalNumber = 100;
	            String str3 = ""+totalNumber; // none

	}

}
