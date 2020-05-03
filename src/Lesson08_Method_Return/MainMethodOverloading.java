package Lesson08_Method_Return;

public class MainMethodOverloading {

	public static void main(String[] args) {
	        
        System.out.println("String Array");
	        
	        boolean[] array1 = {true, false};
	           main(array1);
	            
	        double[] array2 = {1,2};
	          main(array2);	          
	          
	    }
	    
	    
	    public static void main(int[] a) {
	        System.out.println("Int Array");
	    }
	    
	    public static void main(double[] b) {
	        System.out.println("double Array");
	    }
	    
	    public static void main (boolean[] c) {  // return type does not matter
	        System.out.println("boolean array");
	        
	   	}
	

}