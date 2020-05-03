package Lesson28_Exceptions;


//finally block:must declare with try and catch block,Always gets executed regardless of the exception
public class ExceptionFinally {
         public static void main(String[] args) {
			
		



try {
	   System.out.println(9/0);
}catch(RuntimeException e) {
	   System.out.println("9 is not devidable to zero");
}finally {
	   System.out.println("finally block");
}
System.out.println("second try block");
       try {
    	   Thread.sleep(2000);
    	   System.out.println("try block");
       } catch(Exception e){
    	   System.out.println("cathch block");
    	   
       } finally {
    	   System.out.println("finally block");
       }
         
         
         
         
         }
}