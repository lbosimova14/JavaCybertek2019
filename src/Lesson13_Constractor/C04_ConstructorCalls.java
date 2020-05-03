package Lesson13_Constractor;

public class C04_ConstructorCalls {

	public static void main(String[] args) {
		//C04_ConstructorCalls//you cannot call constructor itself in main method
                method1();//default void method is calling
                C04_ConstructorCalls obj = new C04_ConstructorCalls();//A calling default constructor, A printing shu stetment bor
                C04_ConstructorCalls obj2 = new C04_ConstructorCalls(76);//A B 
                
	
	
	
	}//main method ending
	//create 1st default constructor
	C04_ConstructorCalls(){
		System.out.println("A");
		
	}
	//create 2nd constructor and call another constructor by using this keyword constructer
	C04_ConstructorCalls(int a){
		//C04_ConstructorCalls
		this();//default contructor A ni ham B ni ham print qiladi,agar main methodda obj yasab integer berib chaqirsa
		System.out.println("B");
		
		
		}
	//creating 3rd constructor:
	C04_ConstructorCalls(double a){
		this(10);//A B  //int constructorni chaqirayapti,this paranthisni ichiga raqam solayapti, agar
		//raqam bermasa,pustoy quyilsa defalt cons chaqiriladi,andi double bulgani uchun obj ga double raqam ber
		System.out.println("C");//C
		//ikkita this keyword berib bulmaydi:
		//this(2); //Error
	}
	
	//bu just examle void method, can call anywhere
public static void method1() {
	System.out.println("I am method 1");
}
public static void method2() {
	
}
}
