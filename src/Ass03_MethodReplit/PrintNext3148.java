package Ass03_MethodReplit;

import java.util.Scanner;

public class PrintNext3148 {

	public static void main(String[] args) {
		   Scanner inp = new Scanner(System.in);
		     System.out.print("enter number");
		     int num = inp.nextInt();
		     next3(num);

	}

public static void next3(int n) {
    

	 int n1 = n+1;
     int n2 = n1+1;
     int n3 = n2+1;
     System.out.println(n1+" "+n2+" "+n3);

       
}
}
/*Create a method called next3 . This method gets an int argument and prints the next 3 numbers
 *  after that number.Call the method from main method and pass num to it.
enter number
1
next 3 are:
2 3 4
(put a space between numbers)*/