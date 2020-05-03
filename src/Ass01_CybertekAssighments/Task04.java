package Ass01_CybertekAssighments;

public class Task04 {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		System.out.println("\'a\' is befor swapping: "+a);
		System.out.println("\'b\' is befor swaping: "+b);
		a=a+b;  // 10+15=25, now a=25, b=remains 15
		b=a-b;  // 25-15=10  now b=10, a=remains 25
		a=a-b;  //25-10=15  now a=15, b=remains 10
			
		System.out.println("now, \'a\' is swapped: "+a);
		
        System.out.println("now, \'b\' is swapped: "+b);
	}

}
