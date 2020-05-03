package Lesson13_Constractor;

public class C03_ConstructorReview {

	public static void main(String[] args) {
		C03_ConstructorReview obj = new C03_ConstructorReview();
		C03_ConstructorReview obj2 =new C03_ConstructorReview(90);
		C03_ConstructorReview obj3= new C03_ConstructorReview('A');
	}
     public C03_ConstructorReview() {                  // constructor 1
    	 System.out.println("default constructor");
     }
      public C03_ConstructorReview(int a) {          // constructor 2
    	System.out.println("Int constructor");
    }
      public C03_ConstructorReview(char ch) {         //constructor 3
    	  System.out.println("char constructor");
      }
}
