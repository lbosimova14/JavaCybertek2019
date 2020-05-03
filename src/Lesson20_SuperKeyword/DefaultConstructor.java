package Lesson20_SuperKeyword;
//every class must have cont, if tot java fives automaticatlli default cont

//Rule: super class' default constr.............
class B {
	//create default const
	public B () {
		System.out.println( "Default");
	}
}

public class DefaultConstructor  extends B{
	//        sub               super
	
	public DefaultConstructor() {
		//this super class already called,but not visible
	/*public B () {
		System.out.println( "Default");
	}*/
		//super(); keyword already given
		System.out.println("sub");
		// when you called this constructor calls both  (Default sub)
  //yes, you can call manually but you dont have to, automaticcaly, if you create parameterized const it needs to be called manually
		
		
	}
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
	}
	
	

}
