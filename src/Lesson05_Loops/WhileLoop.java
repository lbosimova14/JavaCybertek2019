package Lesson05_Loops;

public class WhileLoop {

	public static void main(String[] args) {
		   /*  while(condition){
                   statements; }
        */
       int a = 9;  // a=8
       while ( a > 8 ) {                     
           System.out.println("Hello " + a );        
           a--;           
       } 
 //in loop's body we have decrement (POST)so it waits until AFTER the first loop
// a while loop gets stuck only when a condition returns false
//only prints once if WHILE loop returns false
// Java executes code from top to bottom - so it does post decrement THEN prints
      
       /*
   1. write a java program that can count how many time the word "book" is appered in a String
        */
     
       String sentence ="I like book, I read book, book book book";
       //                  "I like , I read book"
       //                  "I like , I read"
       int  count = 0;// 1 + 1    
      
       while( sentence.contains("book") ) {
           count++;
           sentence = sentence.replaceFirst("book", "");  
               // can eventually make the condition false
       }
       
       System.out.println( count );
       System.out.println( sentence );
       
       
     //while loop with break  
       while(true) {
           
           System.out.println("hello");
           break;  // forcefully exits the loop      
       }
       
           int i = 0; //int i declaration give outside loop body, if you put inside, infinite loop buladi
       while ( true ) {
           i++;
           System.out.println("Hello: "+i);  // hello 1
           if(i == 5) {
               break;
           }
           
       }
	
	
	
	
	
	}

}
