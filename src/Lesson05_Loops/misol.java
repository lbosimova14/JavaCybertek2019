package Lesson05_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class misol {

	public static void main(String[] args) {
		//int max=(int)greaterNumber(90,20,30);
		//System.out.println(max);
		int[]array= {20,8,9,4,1,2,3,};
		int maxNum=maximum(array);
		System.out.println(maxNum);
	}



//find maximum value
public static int maximum (int[] array) {
	Arrays.sort(array);

	return array[array.length-1];
}

}
