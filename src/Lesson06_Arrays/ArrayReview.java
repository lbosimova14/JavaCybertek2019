package Lesson06_Arrays;

import java.util.Arrays;

public class ArrayReview {

	public static void main(String[] args) {
		String[] str= {"aaa","ccc","ddd"};
		//               0     1    2
		String[] str1= {"aaaa bbb sss mmmm kkk"};
		String[] str3=new String[] {"ss","rr","ttt","dddd"};
		System.out.println(str.length);
		System.out.println(str1.length);
		System.out.println(str3.length);
		
		for(int i=0;i<=str1.length+1;i++) {
			System.out.println(str[i]);
		}
   boolean[] bool= {"laylo".equals("lol"),false,10==0,2<4,};
   boolean b1=bool[0];
   System.out.println(b1);
   String Str=Arrays.toString(bool);
   System.out.println(Str);
   
   //Arrays.sort() :  sorts the array in ascending order
   double[]dArray={2,3,4,55,66,7,8,9,00,8};
   System.out.println(Arrays.toString(dArray));
   //now i amgona sort from small to bigger
   Arrays.sort(dArray);
   System.out.println(Arrays.toString(dArray));
   
   // now Iwont my number disendeing order bigger to smaller, birincho sotr qil(from smaller to bigger)
   //keyin reverse number,now use regular for loop,for each loop tugri kelmaydi,
   //start count chappasidan
   String result="";
   for(int i=dArray.length-1;i>=0;i--) {
	   result+=dArray[i]+", ";
	   //and seperete qilsang with comma orgniz qilsih uchun,ohirida ham coma beradi,
	   //uni yuq qilish uchun:trim method ishlatib,assighn qil resul variABLEGA, BUT STILL HAVE OHIRI COMA,KEYIN REPLACE METHOD
	   //ISHLATsang hamma comani remove qiladi, shuning uchun subtring method ishlat,to find last index topish uchun last indexf methodni
	   //topish kk	   
   }
     result = result.trim();//verqulni yuq qilishda trim ishlatmasa ham buladi
   // result =  result.replace("-100,", "-100");this also works only value uzgarmasa
   result = result.substring(0, result.lastIndexOf(",") );
   System.out.println(result);
	
	
   
   //array reviev explaynation
   int num = 10;
   
   // decleration of array:
       int[] arr = { 10 };   // array has size of 1:  [10]
                                   //      index:       0      
       
   //      arr[1] = 20;  //[10, 20]    array size is fixed
   //  System.out.println( arr[1] );
       
       
       // initializing the array's size:
       int[] arr2 = new int[2];  // [0, 0] ,  maximum capcity of the array is 2
       
       System.out.println( arr2[0] );  //0, default value of int is 0
       
       System.out.println(arr2[1]);   // 0
       
   //  System.out.println( arr2[2] );  // there no index 2 in the array
           
           
       
   String[] cars = new String[5];  // this array can contain 5 string values
       //  { Tesla, Audi,  Toyota, Jeep, Subaru }
       
       cars[4] = "Subaru";
       cars[2] = "Toyota";
       cars[1] = "Audi";
       cars[3] = "Jeep";
       cars[0] = "Tesla";    
       
       
       
       cars = new String[10];
       
//{ Tesla, Audi,  Toyota, Jeep, Subaru, "Ford", "Honda", "BMW", "Volvo", "Volkswagen"} 
       
       cars[5] = "Ford";
       
       for(int i = 0; i <= cars.length-1 ; i++ ) {
           System.out.print( cars[i]+" " );
       }
       System.out.println();
	
	}
	

}
