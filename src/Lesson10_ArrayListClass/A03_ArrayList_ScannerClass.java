package Lesson10_ArrayListClass;

import java.util.ArrayList;
import java.util.Scanner;

public class A03_ArrayList_ScannerClass {

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		ArrayList<String> StudentName =new ArrayList<>();
		
		while(true) {
		System.out.println("Enter Student name");
		String name=scan.nextLine();
		StudentName.add(name);
		
		System.out.println("do you want to add another name?");
		String answer =scan.nextLine().toLowerCase();
		if(!(answer.equals("yes"))||(answer.equals("no"))){
			System.out.println("Invalid");
			break;
		}
				
		if(answer.equals("no")) {
			break;
		}
		}
		System.out.println( StudentName);
	}

}
