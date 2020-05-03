package Ass01_CybertekAssighments;
/*
declare a variable called num
write a program that can check if number is positive negative or equals to zero.
*/
public class Task05_number {

	public static void main(String[] args) {
		
		
		int num=-6;
		String str="zero";
		if(num<0) {
			str="negative";
		
			System.out.println(num+" is negative number");}
		
		 if(num>0) {
			 str="positive";
			System.out.println(num+" is positive number");
		}
		if(num==0) {
			System.out.println(num +" is zero");}
		
		/*int num=-5;
		if(num<0) {
			System.out.println(num+" is negative number");
		}
		else if(num>0) {
			System.out.println(num+" is positive number");
		}
		else if(num==0) {
			System.out.println(num +" is zero");
		}*/
		
		/*if (balance==0)
		 * if (balance>0)
		 * System.out.println("Positive balance")
		 * else if (balance<0)
		 * System.out.println("Negative balance")
		 * else
		 * System.out.println("Zero balance")
		 * 
		 */
	

	}

}
