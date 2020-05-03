package Lesson07_MethodVoid;

public class EvenNumbersArrayPassingArgument {

	public static void main(String[] args) {
		int [] arr= {2,3,4,5,6,7,8,9};
	forAll(arr);
	}
	public  static void forAll(int[] nums) {
		
	int count=0;
		for(int i=0;i<nums.length;i++){
		if(nums[i]%2==0)                     //if(i%2==0) this way also works
			count++;
	    System.out.print(nums[i]+" ");//2468 printing even numbers
	    
	     }
		 System.out.println(count); // 4 ---------counting even numbers
	}

}
