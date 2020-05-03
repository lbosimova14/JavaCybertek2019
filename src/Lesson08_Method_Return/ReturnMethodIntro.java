package Lesson08_Method_Return;

public class ReturnMethodIntro {

	public static void main(String[] args) {
		 /*
	     access-modifier specifier  returnType name(parameter){
	                    statements;
	     }
	     */
	    
	        name();  // this is a String value
	    //  "z"
	        
	        System.out.println( name() ); // return methods are either printed or assigned to the variable
	    
	        String str = name();
	        
	        System.out.println( str );
	    
	    
	    }
	    
	    
	    public static boolean result( ) {
	        return 8 >9;
	    }
	    
	    
	    
	    // if return type is void:
	        public static void method1() {
	            System.out.println("Hello");
	            return;
	        }
	    
	    // if the return type of the method is not void:
	        public static String name() {
	            return "bacth12";
	        //  System.out.println();   
	            //  once return statement executed it exits the method immedietly
	        }

	}

/*    CLASS NOTE:
method deceleration: 
    access-modifier specifier  returnType name(parameter){}
         public       static     void 
    return-Type: void or other data-types (int, String..)
            if the return is not void, it MUST be primitive or non primitives.
            there can only be one return-type
    if the return-type is void, the method does not return any value
    if the retun-Type is not void: the method MUST return a value
return statement: it's used for exiting the current method, we can also use return statement to retun a vlue from the method
continue statement: skips the current iteration of the loop
break statement: exits from  loop or switch statement
System.exit(0): java stops all the execution
return method:
            1. does not have "void" as return Type
            2. MUSt return a Value
            3. the returning value MUST macth with the return-Type of the method
            4. the method body Must be closed with return statement
optional task:
    1. write a method that accepts String array, and returns the longest String value form the array
void method VS return method:
            void methoddoesnt return any value
            return method MUST return a value
Method overloading: 
        it's a feature that allows us to have more than one method with same name, the methods MUST have different parameters
        return-type of the methods doesn't have to be same
        in Java, All methods can be overloaded
why do we need overload method: 
            1. improves the reusability
            2. improves the readability
            3. easier to remmber : it is easy to remmber one method name instead of remembering multiple method names
            4. overload methods is very flexibile*/
