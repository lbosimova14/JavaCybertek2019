package Lesson06_Arrays;

public class ArraysIntroduction {

	public static void main(String[] args) {
         
    // int a = "a";
        
        int[] arr = { 1,  2 };
        
        String[] names = { "Nigar" ,"Sumeyya", "Madina", "Juline" } ;
        //                  0          1        2          3
        
        System.out.println(  names[0]  );//Nigar
        System.out.println(  names[1]  );
        
        String str1 = names[2] ;
        String str2 = names[3] ;
        
        System.out.println( str1 );
        System.out.println( str2 );
        
        //  System.out.println(names[4]); compile error,not string size 4
        
        double[] myArray = { 1, 2, 3, 4, 5, 8, 0,  2};
        // index:            0  1  2   3  4  5  6  7
        
        for(int i=0; i < 8; i++ ) {
            System.out.print(  myArray[i] +"  ");//1.0  2.0  3.0  4.0  5.0  8.0  0.0  2.0 
        }
        System.out.println();
        
//      length of Array:        
        String str="ABC";
            int A = str.length();
            System.out.println(A);  // 3
            
            
            
    int[] Numbers = { 12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    
            int B = Numbers.length;  // 14 
                System.out.println(B);
                int HighestIndexNum = Numbers.length - 1;  //  /bitta kam buladi doim bc zirodan boshlangani un
                
            System.out.println( HighestIndexNum );//13
        
            for(int i=0; i < Numbers.length; i++ ) {//array length uzun bulganda, sanash urniga arr.length kiritsa,
            	      //uzi sanaydi,only need to do new datatype declare kerak
               int s1 =  Numbers[i];
                System.out.print( s1 +" " );//12 24 48 96 2 3 4 5 6 7 8 9 10 11 
            }
            
            System.out.println();
            
        
            char[]  myChars = {'A','B','C','D'};
            int HighestIndexNum2 =  myChars.length -1;
            System.out.println("char "+HighestIndexNum2);//3

	}

}
