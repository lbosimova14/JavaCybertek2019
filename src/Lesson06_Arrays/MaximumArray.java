package Lesson06_Arrays;

public class MaximumArray {

	public static void main(String[] args) {
	//warmup task:
		//1. write a program that can return the maximum value from an int array
int[] arr= { 20,567,38,38,40,500,500};
		
int maximum=0; //max=20, max= 200...
for(int i=0; i<arr.length; i++) {
	 if(arr[i]> maximum) { //compare each array with maximum 0
		 maximum=arr[i];
	 }                                     
}
System.out.println("Maximum number is:"+ maximum);
	//2. write a program that can return the second maximum value from an int array
	int secondMax=0;
	for(int j=0; j<arr.length; j++) {
		if(arr[j]>secondMax && arr[j] !=maximum) {
			secondMax=arr[j];
			}
		}
	System.out.println("Second maximum number is:"+ secondMax);
	
//Finding the highest values in numeric array
	int[] numbers=new int[50];
	numbers[0]=20;
	numbers[1]=30;
	numbers[2]=10;
	numbers[3]=5;
	int highest=0;
	
	for(int index=1;index<numbers.length;index++) {
		if(numbers[index]> highest)
			highest=numbers[index];
	}
	System.out.println("Highest value is: "+highest);
	}
	
	
	
	}





