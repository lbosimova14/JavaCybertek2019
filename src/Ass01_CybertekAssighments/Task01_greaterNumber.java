package Ass01_CybertekAssighments;

public class Task01_greaterNumber {

	public static void main(String[] args) {
		
		int num1=3;
		int num2=4;
		int max;
		if (num1>num2) {
			max=num1;
		System.out.println(max);
		}
		else {
			max=num2;
		System.out.println(max);
		}
		
		//also works this way
	/*
		int max,n1=13,n2=5;
		max=(n1>n2) ? n1 :n2;
		System.out.println(max);
	*/	
		/////////////////////////////////////////////////////////////////
		//single if statement
		//if statament  only excute if condition true
		// my first logical idea
		int numb1=100,numb2=300, Max=0; //local variable needs to be  initialized befor use
				
	    if (numb1 >numb2) { //means
			Max=numb1; //initialize
			Max+=numb1;//or also works
			System.out.println( "Maximum number is "+Max);}
		if(numb2>numb1) {
			numb2=Max;
			System.out.println("Maximum number is "+Max);
		}
		System.out.println("max number");

		
	
		}
		
}
	


