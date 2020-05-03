package Lesson17_initializer_block;
/* static initializer block: used for initializing static variables
 * declaration:  static{
 *          Statements;}
 * Executed as soon as as  class loaded.always static block execites first
     Excutions does not depend on the object
 */

  

public class staticBlock {
   
	//constructor
	   public staticBlock() {
		   System.out.println("This a constructor");
	   }
	
	static {//can create after main method,still excutes first
	   System.out.println("static block 1 a");
	 //  System.out.println("static block b");//static only excutes only one time, bc belong to class,as soon as class
	  // loaded,but constructor can excutes as many as you want
    }
	//static block 2
	// we can have multiple static block,whichever static block comes first,that block excutes first 
	static {
		System.out.println("static block 2");
	}
	
	
        public static void main(String []args) {
        	staticBlock obj1=new staticBlock();
        	staticBlock obj2=new staticBlock();
        	staticBlock obj3=new staticBlock();
        	staticBlock obj4=new staticBlock();
        	staticBlock obj5=new staticBlock();
        	
        	System.out.println("main method");
        	
       // we can have multiple static block,which ever static block comes first,that block excutes first 	
        }//main method ending
}//class ending

