package Lesson28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws_Keyword {
	
	public static void main(String[] args) {
		//sleep(300);//again error unhandeled exception,avoid this put Thread.sleep method in try catch block,and handles perminatly
		sleep2(200);//now compiling fine bc we put in try catch block
		
		
	}
	
public static void sleep(long milliSec) throws InterruptedException {
	Thread.sleep(milliSec);//only temporary handle it,when call this method in another method, 
	//you need again throws exceptions,
	//that is difference between try catch
}
	public static void sleep2(long milliSec) {
		try {
			Thread.sleep(milliSec);
		}catch(Exception e) {
			
		}
	}
	
	  
    public static void method2() throws InterruptedException, FileNotFoundException{
        Thread.sleep(3000);
        FileInputStream fil = new FileInputStream("");    
    }
    
    public static void method3() throws RuntimeException{
        System.out.println(9/0);
    }
}
//Advantages of throw keyword is:in one test case has more interaptins should use throws,bc  10 try catch block make your code complicated 
