package Lesson06_Arrays;

import java.util.Arrays;

public class Quiz7 {

	public static void main(String[] args) {
//Q3
		char[]array= {'D','C','A','B'};
		Arrays.sort(array);
		for(char each:array) {//ABCD sorted
		System.out.println(each+"");
			if(each=='D') {
				continue;
			}
		}

//Q5 two way giving value:1 by size inisilize (int[]num1=new int[3]),
		//                2 by giving value (int[]num1={2,3,4,5};)
		int[]num1=new int[3];//[0,0,0] previous  value will lost
		int[]num2= {1,2,3,4,5};
		num1=num2;//num1 size has reinisilized {1,2,3,4,5}
		for(int i=0;i<num1.length;i++) {
			System.out.print(num1[i]);//12345
		}
		System.out.println();
//Q7
		int numbers[];//compiles fine , bc reassigning
	
		numbers=new int[2];//1 2          reinisilazing
		      //             0 1
		numbers[0]=10;
		numbers[1]=20;     // loosing value and size,
		numbers=new int[4];//1 2 3 4 array size fixed, array is immutable,new sizing no more 10 and 20, loosing
		//                   0 1 2 3
		numbers[2]=30; //yangi value inisilized
		numbers[3]=40;
		
		System.out.print(Arrays.toString(numbers));//[0, 0, 30, 40] if you reinisilaz ohirgisini print qiladi
System.out.println();		
	//Q8
		int []intArr= {15,30,45,60,75};
		           //  0  1  2 3 4 5
		intArr[2]=intArr[4];//{15,30,75,60,75}  bir give value, saqlanib qoladi usha number
		intArr[4]=90;
		System.out.println(Arrays.toString(intArr));//[15, 30, 75, 60, 90]

			
		
//Kahoot1
		String []arr= {"Mara","Nuri"};
		
		arr[0]=arr[1];//[Nuri, Nuri]
		arr[1]=arr[0];//[Nuri, Nuri]
		System.out.println(Arrays.toString(arr));//[Nuri, Nuri]
//Kahoot2
		  System.out.println();
	        
	        long[] Arr = new long[2]; //[0, 0]
	              Arr[0] = 5L;  // [5, 0]
	              Arr[1] = 10L;  // [5, 10]
	            
	              Arr = new long[4];  // [0, 0, 0, 0]
	              Arr[2] = 15L;   // [0, 0, 15, 0]
	              Arr[3] = 20L;   //[0, 0, 15, 20]
	            System.out.println(Arrays.toString(Arr));
	
	   //Kahoot3
	            System.out.println();
	            
	            char[] characters = {'a', 'b', 'c'};
	            for(char each: characters) {
	                /*
	                 if(each == 'b')
	                    continue;  // a c
	                 */	         
	                System.out.print(each+" ");	                
	                if(each == 'b')
	                    continue;  // abc
	                
	            }
	           // Kahoot4
	            int nums[] = {5, 4, 3, 2, 1};	            
	            for( int each : nums) {
	                
	                if(each == 3) {
	                    continue;
	                }
	                
	                System.out.print(each+" "); //5 4 2 1
	                break;   // 5
	                
	            }
	       //Kahoot5     
	            char[] ch = {'a','b','c'};
	            int z = ch.length ; //3
	            int count = 0; // 1+2 =2	            
	            while( count < z - 1) {
	                //  2 < 2	                
	                count++;
	            }
	            System.out.println(count);
	}

}
