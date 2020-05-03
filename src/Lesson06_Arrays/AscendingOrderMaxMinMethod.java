package Lesson06_Arrays;

import java.util.Arrays;

public class AscendingOrderMaxMinMethod {

	public static void main(String[] args) {
		  int num1 = 10;
	        System.out.println( num1 );
	        
	        int[] arr = {1, 2, 3};
	        System.out.println( arr );//[I@24d46ca6
	        System.out.println(arr[0]);  //1  //hash kod bermasligi uchun, arrayName[] ichiga qaysi value kk, shunu index
	                       // bn print qilinadi, agar hammasini birdan print qilish kk bulsa Arrays.toString method bn stringa aylatirish kk
	        
	        /*
	          to print entrire array as whole, we need to convert the array to String
	                    Arrays.toString( VairableName ): used for converting single
	                         dimensional arrays to  String  value
	                         
	                    Arrays class: Utility of all the arrays, 
	                                Arrays class is presented in "Java.util"package
	                         
	                         
	         */
	        
	        
	            String str = Arrays.toString( arr );
	            System.out.println(str);
	            
	        String[] names = { "Elvira" , "Bibish", "Tural" ,"Daulet", "Hakan" };
	        
	            System.out.println( names[0]);//Elvira
	            System.out.println( names );  // hash code
	            System.out.println(  Arrays.toString( names )  );//[Elvira, Bibish, Tural, Daulet, Hakan]
	            
	            
	            /*
	             Arrays.sort(variableName): 
	                        sorts the values of the array in acsending order (smallest to largest)
	             
	             */
	            int[] Numbers = { 9, 8, 100, 3000, 4, 5, 6};
	            
	            System.out.println(  Arrays.toString(Numbers) );//[9, 8, 100, 3000, 4, 5, 6]
	            
	                Arrays.sort(  Numbers );   // sort all the values of the array in acsending order
	        
	            // sort method does:    Numberds = [4, 5, 6, 8, 9, 100, 3000];
	                
	        System.out.println(  Arrays.toString(Numbers) );//[4, 5, 6, 8, 9, 100, 3000]
	        
	        System.out.println("Maximum: " + Numbers[Numbers.length-1]);//3000. sort qilgandan keyin ohirgi harfi katta buladida shunga max ham hisoblanadiv size bita 
	        //kichik qilib print qilinadi
	        System.out.println("Minimum: "+ Numbers[0]);// 4 . ascending qilganda brinchi harfi kichkinadan boshlanadi,shunga ziro bn print qiladi
	            
	            
	        
	    String[] Namelists = { "Alma" ,"Enes", "Myra","Smith", "Sarah","Lexi" ,"ABC"};
	        Arrays.sort(Namelists); // alphabetical order ( from AsCII table)
	        
	        System.out.println( Arrays.toString(Namelists) );
	        
	        char[] ch = {'0' , '9', '8', '5' ,'3', '2', '1' };
	            Arrays.sort(ch);
	             
	            System.out.println( Arrays.toString(ch) );
	
	
	//sort method ishlatgandan keyin toString ga aylantirib arrani print qilish kk.
	
	
	
	
	
	
	
	
	
	
	}

}
