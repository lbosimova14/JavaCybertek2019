package Lesson06_Arrays;

public class MinimumValueReturnArray {

	public static void main(String[] args) {
	//	1. write a program that return the minimum value from an int array
		
		int[] arr= { 2,3,38,40,5,80,-8,9};
		
		int min=9999; //becouse 9999 berayapman chunki array ichidagi namber dan katta bulish kk i can give 
		                 // 10000 yoki 30000, 100dan 80 dan katta bulish kk
		for(int i=0; i<arr.length; i++) {
			 if(arr[i]< min) { 
				 min=arr[i];
			 }                                     
		}
System.out.println("Minimum number is "+ min);

//2. write a program that return the second minimum valye from an int array*/

int Secondmin=999999; 
for(int j=0; j<arr.length; j++) {
	 if(arr[j]< Secondmin && arr[j]>min) { 
		Secondmin=arr[j];
	 }                                     
}
System.out.println("Second minimum number is "+ Secondmin);
	}

}
