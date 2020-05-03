package Ass02_ArrayReplit;

import java.util.Scanner;

public class FindMaxLength105 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  int max=0;
		  String Long="";//Temporary placeholder for longest string
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  System.out.println("Enter number");
			  words[i] = input.nextLine();
			  if(words[i].length() !=2) {
				  if(words[i].length()>max){
					  Long=words[i];
				  }
			  }
			  
			}
			System.out.println(Long);
			

	}

}
