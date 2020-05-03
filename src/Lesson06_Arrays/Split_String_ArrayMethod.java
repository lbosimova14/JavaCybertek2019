package Lesson06_Arrays;

import java.util.Arrays;

public class Split_String_ArrayMethod {

	public static void main(String[] args) {
		
		  /*  split(str): splits the String by the given value, and returns it as String array
	     toCharArray():
	     
	     */	
	        
	        String sentence = "Today is great day Good day to learn java";
	        System.out.println(sentence.length()); //41
	        
	                 String[] arr = sentence.split(" ");
	//hozir shuni loopga solsa,qatorma qator ajratib beradi,Arrays.toString() ishlatsa bir qator qilib braket bn yoziladi                
	 System.out.println( Arrays.toString(arr) );  //[Today, is, great, day, Good, day, to, learn, java]
	// System.out.println(Arrays.toString(arr.length-1));Error! bu yul bn lengthni aniqlab bulmaydi,ham stringga aylantirish
	 // ham lengthni topish tugri kelmaydi,avval stringga aylandir, keyin alohida syso bn lenghtni top
	 System.out.println(arr.length-1);//8  (8 ta suz bor shu arrayni ichida)
	 //bitta bitta ajratib olish uchun without using loop,bita bita indexni  braketni ichiga solib chaqirish kk
	           System.out.println(arr[0]);//Today
	           System.out.println(arr[3]);//day
	 System.out.println(Arrays.toString(arr).length());// index are 51 ta buldi with coma and braket
	 
	 
	            
	            String email ="FirstName_LastName";
	                 String[] arr2 =  email.split("_");
	              System.out.println(Arrays.toString(arr2)); //[FirstName, LastName]  (still with braket)
	                 String str = Arrays.toString(arr2);//another stringga assign qilayapti
	                 System.out.println(str);//[FirstName, LastName] (still with braket)
	        System.out.println( str.replace("[", "").replace("]", "")  );//FirstName, LastName (now removed)
	                 
	        
	            String   fullname  = "Cybertek School Batch12";
	            
	                     String[] array1 = fullname.split(" "); // there are two spaces
	                     System.out.println(  Arrays.toString(array1) );//[Cybertek, School, Batch12]
	     
	            
	            String  Java = " Java I love Java and Java is fun, Java is Life Java ";
	            //              I love  |   and   |  is fun,   | is Life  |
	            
	            String[]  array2  =  Java.split("Java");//suzlarni ham split qilsa buladi,suzlar remove buladi
	                
	            System.out.println(Arrays.toString(array2));//[ ,  I love ,  and ,  is fun, ,  is Life ,  ]
	            System.out.println(array2.length-1); // java is occured 5 times in the sentence
	            //alwayse give space befor and after split bulayotgan suzga,
	        
	        
	            String Python = " Python is good, I Love Python, Python is life ";
	                //          [     |   is good, I Love   | ,    |     is life      ]  
	            String[]  array3 = Python.split("Python");
	            System.out.println( array3.length-1 ); //3  // retunrs the total number of python in STring
	            
	            
	            
	            String emailAddress ="Cybertek.school.bacth12@Gmail.com";
	                emailAddress =  emailAddress.substring(0, emailAddress.indexOf("@") );//affal fullnameni ajratib olayapti
	                String[] array = emailAddress.split("\\.");//faqat nuqtaga slash buladi
	                
	                System.out.println(Arrays.toString(array));//[Cybertek, school, bacth12]----array converting to String 
	            
	                
	                String word = "ABCDEFG";
	                String[] AllCharacters =word.split(""); // all characters from the string as an array
	                                // splits the STring character by character
	            //qushtirnoqni ichidagi whole suz  bita bita bulub ajraladi
	            System.out.println(Arrays.toString(AllCharacters));//[A, B, C, D, E, F, G]
	
	}

}
