package Lesson07_MethodVoid;

import java.util.Arrays;

public class KilometerToMile {

	public static void main(String[] args) {
		 kilometerToMiles(25);
        GallonToLitter(85);
        
        
	}//main method ends
	
//1. Write a method that can convert km to miles   1km=0.612 miles

	
	public static void kilometerToMiles(double k) {
		double Miles=k*0.612;
		System.out.println(k+" km equals to "+Miles +" miles");//1000.0 km equals to 612.0 miles
		//System.out.println(k+" kilometer is "+(k*0.612)+" miles"); my way
	}
//2. write method that can convert gallons to litters   1G=3.75L
	public static void GallonToLitter(double gallons) {
		double Litters=gallons*3.75;
		System.out.println(gallons+" gallons equal to "+Litters+" liters");
	}
//All in one by using switch
	private static void converter(int value, String variable) {
        
        switch(variable) {
            case ("galon"):
                System.out.println(value*3.75+" L");
                break;
            case ("km"):
                System.out.println(value*0.612+" miles");
                break;
    }
	}
}//class ending
