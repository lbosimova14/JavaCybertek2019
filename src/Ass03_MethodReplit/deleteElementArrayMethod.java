package Ass03_MethodReplit;

import java.util.Arrays;

public class deleteElementArrayMethod {
	
	public static void main(String[] args) {
		int []arr= {1,2,3};
		int deleteNumber=2;
		System.out.println(Arrays.toString(deleteR(arr,deleteNumber)));

	}
	 public static int[] deleteR(int[] arr,int element) {
		//copied from slack short way:
		 int [] rnew = new int[arr.length-1];
	        int z = 0;
	        
	        for(int i = 0; i<arr.length; i++) {
	            if(!(element==arr[i])) {
	                rnew[z]=arr[i];
	                z++;
	            }
	        }
	        return rnew;
	            }	    
	/* this google solution:  
	 *      int[] newArr = null;               
	         for(int i = 0; i < arr.length; i++){
	             if(arr[i] == element){
	                newArr = new int[arr.length - 1];
	                for(int index = 0; index < i; index++){
	                    newArr[index] = arr[index];
	                }
	                for(int j = i; j < arr.length - 1; j++){
	                    newArr[j] = arr[j+1];
	                }
	                break;
	             }
	         }
	             
	         for(int i = 0; i < newArr.length; i++){
	          newArr[i]= newArr[i];
	        
	         } 
	         return newArr;
	    }*/
	
	  }//end delete

/*deleteR, gets an int array, and an int. the method returns an int array.
It removes element int from the array.
example use (pseudo code):
deleteR([1,2,3],2)
returns [1,3]
deleteR([19,99,9,9999],9)
returns [19,99,9999]
deleteR([1,5,3,4],5)
returns [1,3,4]
hint:
create a new arry for  return with -1 the length of arr
And add all elements from arr except for  the element that matches element value
return that new array
*/