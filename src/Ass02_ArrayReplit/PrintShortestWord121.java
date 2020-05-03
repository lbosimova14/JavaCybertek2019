package Ass02_ArrayReplit;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord121 {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		    String[] arr = str.split(", ");
		    String shortest = "";
		    int min=0;
		    
		    for (int i=0; i<arr.length; i++){
		        if (i==0) min = arr[i].length();
		        if(arr[i].length() < min && i!=0) min = arr[i].length();
		    }
		    
		    for (String each: arr){
		     if (each.length()==min) shortest += each + " "; 
		    }  
		    
		    String[] newArr = shortest.trim().split(" ");
		    Arrays.sort(newArr);
		    
		    System.out.println(Arrays.toString(newArr));
		  }
		}
//int []array= {8,6,55,4,3,22,7,6,6,66,6,99,0};

/*Write a program that will find out shortest words in the given string str. 
 * If there are few words that are evenly short, print them all.
 *  Use split method in order to split str string variable and create an array of strings. 
 *  Print array with Arrays.toString() method. 
 * Sort array before printing. 
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]*/