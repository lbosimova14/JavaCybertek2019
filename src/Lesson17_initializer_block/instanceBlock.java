package Lesson17_initializer_block;
/*instance initializing instance variables,belongs to object
 * declaration: {
 *               }
 *    instance blocks is depends of creation of object  /qancha soni bulsa constuctorni shuncha instance ga teng buladi         
 */
public class instanceBlock {
	//instance block 1st
	{
		System.out.println("instance block1");//qancha constructor create bulsa shuncha instance b excute buladi,right after constructor
	}
	//yes, can be multiple instance block in same class
	//instance block 2nd:
	{
		System.out.println("instance block2");
	}
	{
		System.out.println("instance block3");
	}
	
	//constructor
	public instanceBlock() {
		System.out.println("Constructor printing");
	} 
	public static void main(String[] args) {
		
//without creating obj I cannot excute class sout print statement
		instanceBlock obj1 = new instanceBlock ();
		instanceBlock obj2 = new instanceBlock ();
		//instanceBlock obj3 = new instanceBlock ();
		
		
		
	}

}
