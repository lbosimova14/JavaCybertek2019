package Ass01_CybertekAssighments;

import java.util.Scanner;

public class ReverseIt67 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str=scan.nextLine();
		
		if(str.length()>5) {
			System.out.println("Too long!");
		}else if(str.length()<5) {
			System.out.println("Too short!");
		}else {

		System.out.println(str=""+str.charAt(4)+str.charAt(3)+str.charAt(2)+ str.charAt(1)+str.charAt(0));//avaJ
	
		}
	}

}
/* 
 * Write a program that will reverse a string.
 *  Your program should reverse a string only 5 characters long.
 *  If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
 *  Otherwise, reverse this word and print out result into the console. 
Example:
input: cat
output: Too short!
Example:
input: singularity
output: Too long!
Example:
input: apple
output: elppa
 */

/*  Muhtar Github version
 * if (word.length() == 5) {
for (int i = word.length()-1; i >= 0; i--) 
System.out.print(word.substring(i, i + 1));

} else if (word.length() < 5) {
System.out.println("Too short!");
} else {
System.out.println("Too long!");
}

}
*/