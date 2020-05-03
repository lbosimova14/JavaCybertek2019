package Lesson18_Encapsulation;

public class QuizReview {

//Q1
	static int a;
	int b;
	static String Name="Laylo"; //you can call by variable name diractli on main method withion create obj
	long total =100;
	
	public static void main(String[] args) {
		QuizReview obj1 =new QuizReview();
		obj1.b=10;
		obj1.a=20;
		QuizReview obj2 = new QuizReview();
		//assign
		obj2.b=30;
		obj2.a=30;

		
		
		System.out.println(obj1.b);//10
		System.out.println(obj2.b);//second time print qilsa i get zero
		
		//static variable shared value  all other object
		
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//20
		
		System.out.println(Name);//Laylo
		
 
		
		//Q2 test:
	
		QuizReview test = new QuizReview(25);//instance excute first,value is 200,next excution is constructor and 
		//we have defoult cons
		System.out.println(test.total);//175
		
	}//main method ending
	//Q2:   long total =100;  //200===>175
			
	    //create constructor
			public QuizReview() {
				total-=50;
			}
			public QuizReview(int total) {
				this();//calling defoul canstructor  total=150
				this.total+=total; //total+=25==>175 //this. it is used for calling instance variable,we can use in any object instance
			    //          local variable
			}
			//instance block: you can call instance variable in instance block
			
			{
				total*=2;
			}
			
			//static block: in here static method is not excuting
			static{
				int total=200; //local variable
				total/=2;  //this total is locol variable,no effect yuqoridago instance total variable
			}
			
			
			
}
