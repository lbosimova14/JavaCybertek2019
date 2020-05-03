package Lesson06_Arrays;

import java.util.Arrays;

public class CharAtArrayMethod {

	public static void main(String[] args) {
		  /*
        toCharArray(): reteuns a char array from the String
        */
           
           String Str ="Java";
               char[] ch = Str.toCharArray();
               System.out.println(Arrays.toString(ch));//[J, a, v, a]
          //string split methothga uhshash ekan     
            String word = "Java";
               String[] AllCharacters =word.split(""); 
        
           System.out.println(Arrays.toString(AllCharacters));//[A, B, C, D, E, F, G]
	}

}
