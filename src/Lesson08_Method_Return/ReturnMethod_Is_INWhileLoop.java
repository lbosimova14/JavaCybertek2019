package Lesson08_Method_Return;

public class ReturnMethod_Is_INWhileLoop {
/**
 * Which modification enables the code to print 54321?

A. Replace line 4 with System, out. print (--num) ; 

B.  At line 5 , insert  num --; 

C. Replace line 4 with --x; and, at line 5, insert system, out. print (num); 

D.  Replace line 7 With return (num > 0) ? false: true;Which modification enables the code to print 54321?

A. Replace line 4 with System, out. print (--num) ; 

B.  At line 5 , insert  num --; 

C. Replace line 4 with --x; and, at line 5, insert system, out. print (num); 

D.  Replace line 7 With return (num > 0) ? false: true;
 
 */
                public static void main(String[] args) {
                             int num =5;
                      while( isAvailable(num) ) {
                    	  
                                 System.out.print(num);
                                 num--;
                                     }
                          }

                 public static boolean isAvailable(int num) {
                         return (num-- > 0 ? true : false) ; // >  greater than zero,post decrement
                         //if you past 5 to num,firstread as a 5 then decrement,thenternari condition is work
                    }
}
