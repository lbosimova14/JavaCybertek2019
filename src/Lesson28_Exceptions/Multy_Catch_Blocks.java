package Lesson28_Exceptions;

public class Multy_Catch_Blocks {// we can have multiple catch blocks with one try block
	public static void main(String[] args) {
		
	//CONDITION: parent exception type needs to be after it's sub exception type,
		//otherwise code will be unreachable


	int[]arr= {1,2,3};
	try {
		System.out.println(arr[100]);
		
	}catch(NullPointerException e){
		System.out.println("NullPointerExceptions");
	}catch(ClassCastException e) {
		System.out.println("ClassCastExceptions");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsExceptions");//ArrayIndexOutOfBoundsExceptions
		                                                          //program continue
	}catch(IndexOutOfBoundsException e) {
		System.out.println("IndexOutOfBoundsExceptions ");
	}
	
	System.out.println("program continue");
	
	
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
	//  Exception > RuntimeException > Arithmetic .....
	//All catch blocks is handiling but first one excuting from top to bottom
	try {
		System.out.println(11/0);
	}catch(ArithmeticException e){
		System.out.println("ArithmeticExceptions ");//ArithmeticExceptions 
		System.out.println(e.getMessage());/// by zero
		
	}catch(RuntimeException e) {
		System.out.println("RuntimeException ee");
	}catch(Exception e) {
		System.out.println("Exceptions");
	}//Error:cannot be here bc grand parents of above classes
//	catch(ClassCastException e) {
//		System.out.println("ClassCastException");
//	}
	
   // in multi-catch block whichever handles the exception first will gets executed
}
}