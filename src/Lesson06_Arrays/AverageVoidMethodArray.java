package Lesson06_Arrays;

public class AverageVoidMethodArray {

	public static void main(String[] args) {
		int []arr= {2,3,3,4,5,6,9};
		centeredAverage(arr);
			
		}
			public static void centeredAverage(int[] nums) {
				int sum=0;
				int average=0;
				if(nums.length>3) {
					
					for(int i=0;i<nums.length;i++) {
						sum=(sum+nums[i]);
						average=sum/nums.length;
						
					}
					
				}
				System.out.println(average);

	}

}
