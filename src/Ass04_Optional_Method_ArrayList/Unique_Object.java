package Ass04_Optional_Method_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Unique_Object {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers =new ArrayList<>(Arrays.asList(100,100,20,300,300,40,500,500));
		numbers=unique(numbers);
                 System.out.println(numbers);
	
	}

	public static ArrayList<Integer> unique (ArrayList<Integer> list) {
			
			ArrayList<Integer> res = new ArrayList<>();
			
			for(int each : list) {
				int count=0;
				for(int each2 : list) {
					if(each==each2) {
						count++;
					}
				}
				if(count==1) res.add(each);
			}
			return res;
		}
}


/*Write a program that can find the unique objects from an ArrayList
Ex: if arrayList is [100, 100, 20, 300, 300, 40, 500, 500]
output:    20   40*/