package Lesson06_Arrays;

import java.util.Scanner;

public class AverageOfValue {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
        int Total=0;
        double average;
        double[] scores=new double[5];
     
        for (int index = 0; index < scores.length; index++)
        {
           System.out.print("Enter your score " +
                           (index + 1) + ": ");
           scores[index] = scan.nextDouble();
           Total+=scores[index];
        }

	System.out.println("Total score is "+ Total);
	average=Total/scores.length;
	System.out.println("Average of the score is: "+ average);

	}

}
