package Lesson11_WrapperClasses;

import java.util.Arrays;

public class WrapperClassIntroduction {

	public static void main(String[] args) {
		 /*                              came from java.lang
        primitives                     wrapper-class : classes that are dedicated to primitives
          byte                            Byte            null
          short      Auto-boxing          Short           null
          int        ==========>           Integer         null
          long                            Long            null
          float                           Float           null
          double       un-boxing          Double          null
          boolean    <===========          Boolean         null
          char                            Character       null  
          
      
          default values of primitives:  
                  byte, short, int, long ==>0;
                  double, float ==> 0.0
                  boolean ==> false
                  char ==> space
                  
         DEFFERENCE:         
         1 default value of all wrapper class:  null
         2 wrapper class only accepts it's own primitive values
         3 wrapper classes have method, primatives dont
          4 wrapper class takes object,primitives takes values
    METHODS: Max_values,Min-Values,parse methods,valueOf methods:
      max_value: returns the maximum value of the the data-type
      min_value: return the minimum value of the data type
      parse methods: converts String to primitives
       valueOf methods: converts string to wrapper class
       
       
     Auto-boxing: assign the primitives to wrapper class
     un-boxing: assign the wrapper class to primitives
          
   if we do not give any objects to class (reference) null will be given by default
          
          String's default value is also null
   */
  //converting or assigning bir ma'na
 
      int  numInt = 10;
      Integer numInteger = 10;
      
      double numdouble = 5.5;
      Double numDouble = 5.5;
      
      long longnum  = 20L;
      Long Longnum = longnum;   // Auto-Boxing 
      
      System.out.println(longnum);
      System.out.println(Longnum);
      
      
      Boolean  BooleanResult = false;
      boolean booleanResult = BooleanResult;  // unboxing
      
      
      char ch1 = 'L';
      Character ch2 = ch1;  //  Auto-boxing
      
      char ch3 = ch1;  // none
      
      char ch4 = ch2;   // un-boxing
      
      Character ch5 = ch2;  // none
      
      System.out.println(ch1);
      System.out.println(ch2);
      System.out.println(ch3);
      System.out.println(ch4);
      System.out.println(ch5);
      
      
      Boolean[] arr =new Boolean[3];  // [0, 0, 0]
      System.out.println(Arrays.toString(arr));
      
      int num1 = 10;
      // num1.method();  primitves does not have methods, variable num1 is not a reference of an object

	}

}
