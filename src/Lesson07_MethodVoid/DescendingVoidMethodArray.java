package Lesson07_MethodVoid;

import java.util.Arrays;

public class DescendingVoidMethodArray {

	public static void main(String[] args) {
		int [] arr= {10,28,36,46,57,-1};
		Descending(arr);

	}
	//3. write a method that can print out  the array in Descending order largest to smaller
		public static void Descending(int[] array) {
			//array={10,28,36,46,57,-1};
			Arrays.sort(array);//you cannont use each loop chunki each loop always starts with ziro,biz orqadan boshlam sanashimiz kk
			for(int i=array.length-1; i>=0; i--) {
				System.out.print(array[i]+" ");//57 46 36 28 10 -1
			}
		}
}
