package Ass02_ArrayReplit;

import java.util.Arrays;

public class CopyCertainValue117 {

	 public static void main(String[] args) {
		    System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four"};
		    //     index numbers   0       1      2      3      4 
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  public static String[] getWithE(String[] arr) {
		    int count =0;
		  for(int i =0; i<arr.length;i++){
		    if(arr[i].contains("e")){
		      count++;
		    }
		    
		  }
		  String [] fewValues = new String [count];
		  int z =0;
		  for(int i =0; i<arr.length;i++){
		    if(arr[i].contains("e")){
		      fewValues[z]=arr[i];
		      z++;
		    }
		    
		  }
		   return fewValues;
		  }
}

/*Given a String array arr with the following elements
["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter "e" in them

You need to know how many element contain "e" and create array accordingly

Values in fewValues array need to be["zero", "one","three"]

Examples:
arr -> ["aa", "be", "lol", "lel", "oreo"] 
fewValues -> ["be",  "lel", "oreo"] 

arr -> ["e", "hey", "bye", "furey", "spoon"] 
fewValues ->["e", "hey", "bye", "furey"] */