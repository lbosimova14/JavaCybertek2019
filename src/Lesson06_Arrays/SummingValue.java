package Lesson06_Arrays;

public class SummingValue {

	public static void main(String[] args) {

		 int []unit =new int[] {1,2,3,4,5,6};
		int total=0; //accumulator: loop adds the value in each array element to accumulator
		for(int i=0;i<unit.length;i++) {
			total=total+unit[i];
			System.out.print(total+"+");//1+3+6+10+15+21
		}
		System.out.println("\nsecond way");
		  int arr[] = {1,2,3,4,5,6}; //21
	       // method for sum of elements in an array  
		      int sum = 0; // initialize sum 
		    // Iterate through all elements and add them to sum 
		         for (int i = 0; i < arr.length; i++) 
		            sum +=  arr[i]; 
		          System.out.println(sum);//21

	}

}
