package Ass01_CybertekAssighments;

public class EvenAndOddNumbersForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<=100;i++) {
			if(i%2==0)
			System.out.print(i+", ");//4 6 8 ...
		}
		int count;
		for( count=1;count<=49;count++) {
			if(count%2==1) 
			System.out.println(count); //3 5 7 9
		}
	}
}
//Write a program that will print out even numbers from 2 to 100 through the comma