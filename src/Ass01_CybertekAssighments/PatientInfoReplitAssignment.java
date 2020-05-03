package Ass01_CybertekAssighments;

import java.util.Scanner;

public class PatientInfoReplitAssignment {

	public static void main(String[] args) {
	    //Enter your code here
	    Scanner scan=new Scanner(System.in);
	    String firstName, lastName, fullName, email, street, state, city, address, contacts;
	    int  age, zipcode;
	    double height,weight;
	    boolean isMarried;
	    long workPhoneNumber, personalPhoneNumber;
	    
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information");
	    System.out.println("Enter your first name ");
	          // scan.nextLine();
	    firstName=scan.nextLine();
	    System.out.println("Enter your last name");
	   // scan.nextLine();
	    lastName=scan.nextLine();
	    System.out.println("Enter your email ");
	   // scan.nextLine();
	    email=scan.nextLine();
	    System.out.println("Enter your street ");
	    //scan.nextLine();
	    street=scan.nextLine();
	    System.out.println("Enter your city ");
	    city=scan.nextLine();
	   // scan.nextLine();
	    
	    System.out.println("Enter your state ");
	    //scan.nextLine();
	    state=scan.nextLine();
	    System.out.println("Enter your zip code ");
	    zipcode=scan.nextInt();
	    System.out.println("Enter your work phone number ");
	    workPhoneNumber=scan.nextLong();
	    System.out.println("Enter your personal phone number ");
	    personalPhoneNumber=scan.nextLong();
	    System.out.println("Enter your age ");
	    age=scan.nextInt();
	    System.out.println("Enter your height ");
	    height=scan.nextDouble();
	    System.out.println("Enter your weight ");
	    weight=scan.nextDouble();
	    System.out.println("Are you married? ");
	    isMarried=scan.nextBoolean();
	            
	    System.out.println("Patient personal information ");  
	    System.out.println("Full name: "+firstName+", "+lastName);
	    System.out.println("Address: "+street+","+city+","+state+","+zipcode);
	    System.out.println("Contacts: "+"work phone number-"+workPhoneNumber+",personal phone number-"+personalPhoneNumber+", email: "+email);
	    System.out.println("Age: "+age);
	    System.out.println("Height: "+height);
	    System.out.println("Weight: "+ weight+" pounds");
	    System.out.println("Married?: "+ isMarried);

	}

}
