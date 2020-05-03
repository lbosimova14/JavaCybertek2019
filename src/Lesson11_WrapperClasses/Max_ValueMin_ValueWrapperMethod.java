package Lesson11_WrapperClasses;

public class Max_ValueMin_ValueWrapperMethod {

	public static void main(String[] args) {
		 /*
	     useful methods of Wrapper class: 
	                Max_Value
	                Min_Value
	                parse methods
	                ValueOf methods
	     */	       
// max_Value: returns the maximum value of the primitive.int is already within the range
//	
	//	if I wont primative in number max numberi topish uchun I need call Integer Max_Value

	            int maximum = Integer.MAX_VALUE;
	            
	            System.out.println( maximum );
	            
	            double maximumDouble = Double.MAX_VALUE;
	            System.out.println(maximumDouble);
	            
	            byte maximumByte = Byte.MAX_VALUE;
	            System.out.println(maximumByte);
	            
	            char maximumChar = Character.MAX_VALUE;
	            System.out.println(maximumChar );
	            
	            char ch = 12324;
	            System.out.println(ch);
	            
	            int max = Integer.MAX_VALUE;
//	          int max2 =  Double.MAX_VALUE; //  int != double
	            System.out.println(max -1);
	    // min_Value: returns the minimum value of primitive
	            
	            int minimum = Integer.MIN_VALUE;
	            System.out.println(minimum);
	     
	            byte minimumByte = Byte.MIN_VALUE;
	            System.out.println( minimumByte );
		

	}

}
