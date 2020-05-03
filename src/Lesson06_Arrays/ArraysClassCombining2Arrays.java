package Lesson06_Arrays;

public class ArraysClassCombining2Arrays {

	public static void main(String[] args) {
		/* Array Declaritions:
		 * DataType[] VariableName={value1, value2....};
		 */
     int [] arr= {12,3,4,5,7};
     String[]arr1= {"Laylo","Bosim","Zubay"};//all value share  one arr1 varibale
      // index is     0        1     2
     char[]arr3= {'k','w','r','4'};
     double []arr4= {23.4,5.6,7.0,8.9,};
     int arr5[]= {}; // variabledan keyin ham braket quysa buladi
     //array have index numbers, in order to retrive a value from array:
     //String name=arr1[3];//index 3 is not exist, gives error
     String name=arr1[2];
     System.out.println(name);//Zubay
     
     //array size fixed, must be initialized
     
     int[] mynumber =new int[2];
     for(int i=0;i<mynumber.length; i++) {
    	 System.out.println(mynumber[i]);//0 0
     }
     /* default values:
      * int,byte,short,long==>0
      * double and float==>0.0
      * boolean===>false
      * char==>space
      * String ===>null
      * if you initilizr array without array size, those default value beradi
      */
     // assign values
     int ch[] =new int[3];
     ch[0]=10;
     ch[1]=20;
     ch[2]=30;
    // ch[3]=40;     Index 3 out of bounds for length 3
     System.out.println(ch [2]); //30
     
     for(int i=0;i<ch.length;i++) {
    	 System.out.print(ch[i]+" "); //10 20,30
     }
     
     ch=new int[4]; //reinitilising,no value provided, giving new value, all gives 0 
     for(int i=0; i<ch.length;i++) {
    	 System.out.println(ch[i]+"");//0 0 0 0
    	 //array size  is fixed
     }
     System.out.println("combining array");
     // combine array
     
     System.out.println();
     
     int[] array1 = {1,2,3};
     int[] array2 = {4, 5, 6, 7};
     
     int[] array3 = new int[ array1.length + array2.length];//should array3 cable of all 2 array
     //now this array has enough capacity to contain all the elements of array
    // now gives only 0000000 because we initialized size, not value
     
     for(int i=0; i <array1.length; i++) {
         array3[i] = array1[i];  //copying individual elements
         // assigning array1' each index to the array3
     }
     
       for(int i=0; i < array3.length; i++) {
         System.out.print(array3[i]+" "); //1 2 3 0 0 0
         
     }
       System.out.println("\n second part");
       
       // second part
       for(int i=0; i <array2.length; i++) {
           array3[i+array1.length] = array2[i];  
           // assigning array2' each index to the array remaining index
       }
       
         for(int i=0; i < array3.length; i++) {
           System.out.print(array3[i]+" ");//1 2 3 4 5 6 7
       }
         System.out.println();
       
}
}