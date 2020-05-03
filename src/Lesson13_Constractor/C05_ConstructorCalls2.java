package Lesson13_Constractor;

public class C05_ConstructorCalls2 {

	public static void main(String[] args) {
		

	}
	//1st default cons
	public C05_ConstructorCalls2() {
		//this(); //cannot call itself,gives compile error
		//this(true);//constructor cannot contain itself, already called in boolean constructor
	}
	//2nd
	public C05_ConstructorCalls2(boolean a) {
		//this(true);//uzini uzi chaqirayapti ,Error
		this();//calling default constructor
		
	}
	
	
}//class ending
