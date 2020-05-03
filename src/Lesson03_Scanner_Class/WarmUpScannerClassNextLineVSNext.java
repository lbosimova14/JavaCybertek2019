package Lesson03_Scanner_Class;

import java.util.Scanner;

public class WarmUpScannerClassNextLineVSNext {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name and last name:");
		//String firstName=scan.nextLine(),
		//lastName=scan.nextLine()
		//or this way
				String firstName=scan.nextLine().toUpperCase(),
				lastName=scan.nextLine().toUpperCase();
		//String fullname= lastName+" "+firstName;
		String fullname= lastName.concat(" "+firstName);//by using concat way,
	//	String nameUpper=fullname.toUpperCase();
		System.out.println(fullname);
		//System.out.println(nameUpper);
		

	}

}
