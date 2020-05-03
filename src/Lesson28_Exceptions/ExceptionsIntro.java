package Lesson28_Exceptions;

import java.util.ArrayList;

public class ExceptionsIntro {
public static void main(String[] args) {
	int[] arr= {1,2,6};
	//System.out.println(arr[100]);exception is class that will be thrown when those unexpected and unwanted events occured
//this exceptions called unchecked exception, occuring run time, in console you will see.
	  //All uncheked exceptins is also called RUNTIME(parents class) exceptions
     
	
	//Thread.sleep(1000);// Unhandled exception type InterruptedException 
	//this is checked exception (unwanted event) .occurring in compile time, needs to be handled IMMEDIENTLY
	
	  //		HOW WE HANDLE THOSE EXCEPTIONS:
	  /*
    try{
            exception statements/code
        } catch(ExceptionClass name){
            statements
        }
*/


int[] number = {100,200,300};

try {
    
    System.out.println( number[5] );
    System.out.println("Trye block, Checked exception");
    
} catch(ArrayIndexOutOfBoundsException e) {
    
    System.out.println("catch block, unchecked exception");
    
}


System.out.println("===================================================");


try {
    
    Thread.sleep(3000);
    System.out.println("Trye block, Checked exception");
    
}catch(InterruptedException e) {
    System.out.println("catch block, unchecked exception");
}







}

}

/*
 * Class NOTES Exceptions: unwanted or unexpected events Exception is class that
 * will be thrown when those unexpected and unwanted events occured there are
 * two types of exceptions: unchecked exception (unexpected ): exceptions that
 * occure during runtime Ex: int[] arr= {1, 2, 3} syso(arr[20]); Selenium Ex:
 * nullpointer exception No such Element Exception WebDriverException WedDriver
 * driver = new FireFoxDriver(); driver.get("URL") RunTimeException class is the
 * parent class of all the unchked exception all the RuntimeExceptions are
 * unchcked exception checked exception (unwanted): occures during the compile
 * time those exceptions needs to be handled IMMEDIETLTY, because it will give
 * compile error Ex: Thread.sleep(); All the exceptions that are not
 * runtimeexception are called checked exception Exception Handling: 1. try &
 * catch: used for handling the exception try{ exception statements/code }
 * catch(ExceptionClass name){ statements } only one of those blocks gets
 * executed try block: only gets executed if the exception is checked exception
 * catch block: only gets executed if the exception is unchecked (Runtime
 * Exception) Actions act = new Actions(driver); act.pause(3000).perform();
 */
