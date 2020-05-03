package Lesson05_Loops;

public class Loops {

	public static void main(String[] args) {
//for(initialization;condition;iterator
		
		//initialization:starting point
		//Condition:creates based on the initialization i>0....
		//iteration: co-related to the condition.
		    //needs to be capable enough to make the condition false
//task 1
	//square of number
		for(int i=1; i<=10;i++) {
			System.out.println("the square of "+ i +" is "+(i*i));
		}
		//output the square of 1 is 1
		   //    the square of 2 is 4
		
//task 2 even number
		for(int i=1; i<=32;i++) {
			if(i%2==0)
			System.out.print(i+" ");//4 6 8 ...
		}
System.out.println();		
//task 3 odd number
		
		for(int i=1; i<=32;i++) {
			if(i%2 !=0) //or if(i%2 ==1)
			System.out.print(i+" ");// 1 3 5 7 9....
		}
		
System.out.println();
//task 4 reverse string value
		String str="Laylo";
		String Rev=""+str.charAt(3)+str.charAt(2)+ str.charAt(1)+str.charAt(0);//avaJ
		System.out.println(Rev);
		
		String Rev2="";
		for(int i =3; i>=0; i--) {
			System.out.print(str.charAt(i)+" ");
			
		}
		

	}

}
