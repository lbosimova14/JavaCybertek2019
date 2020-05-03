package Ass01_CybertekAssighments;

import java.util.Scanner;
/* 
 * You have a word, do the following:
1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq
2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */

public class middleOneCharacter_64 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = scan.nextLine();
      
        int position=0;
        int len=0;
        
	  if(str.length()==1){              //q ==> qqq
		  System.out.println(str.concat(str)+str);
	  
	  } else if(str.length()==2) {           //hi ==> hihi
           System.out.println(str.concat(str));
        
      }else if (str.length() % 2 == 0) {//even string    java ==> av
           position = str.length() / 2 - 1;
            len = 2;
            System.out.println(str.substring(position, position + len));
                                             //stars        ends
       
      } else if(str.length()%2==1) {        // javav ==> v
            position = str.length() / 2; //odd string
            len = 1;            
		 System.out.println(str.substring( position,position+ len));
      }
       
       
       
                                      
       scan.close(); 

	}

}

 /* muhtar github version
  * int length = word.length();
		
		if ((length % 2 == 1) && (length >= 3)) {
			System.out.println(word.charAt((length - 1) / 2));
		} else if (length == 1) {
			System.out.println(word + word + word);
		} else if ((length % 2 == 0) && (length >= 4)) {
			System.out.println("" + word.charAt(length / 2 - 1) + word.charAt(length / 2));
		} else if (length == 2) {
			System.out.println(word + word);
		}
  */
 
