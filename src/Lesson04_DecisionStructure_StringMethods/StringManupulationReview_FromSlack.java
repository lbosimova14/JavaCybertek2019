package Lesson04_DecisionStructure_StringMethods;

public class StringManupulationReview_FromSlack {

	public static void main(String[] args) {
        String str1 = "JAVA is fun with MUHTAR:";
        String str5 = "JAVA is fun with MUHTAR:)";
        String str2 = "Java is fun with Muhtar:)";
        String str3 = " ";
        String str4 = "        I want to trim my string,   but how?    ";
        String email = "Cybertek_School@gmail.com";
    
        System.out.println(str1.length());//==>25
        System.out.println(str1.charAt(0)+str1.charAt(1)+"");//==>???
        System.out.println(1+2+3+"4+5+6"+7+8);
        System.out.println(str1.indexOf('A'));
        System.out.println(email.indexOf('o', email.indexOf('@')+1));
        int num=4;
        System.out.println(str1.indexOf('i'));
        System.out.println(str1.indexOf('i', str1.indexOf('i')+1));
        System.out.println(str1.lastIndexOf("A"));
//      System.out.println(email.substring(0,email.indexOf=("@gmail.com")));
        System.out.println((str1.substring(str1.indexOf("MUHTAR"),str1.indexOf("MUHTAR"))) ); //==> How to extract only "with" and the rest?
//      System.out.println(str1.substring(  )); //==> How to extract 3rd character(including) and the rest?
        //str1=str1.toLowerCase();
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase()); 
        System.out.println(str1);//==> Is it going to be full upper case or it will stay as it is? 
////                                 //==> Give printer example: Rephrase, print, close the file  without save...
        boolean b1=str1==str2;                  //==>???
        System.out.println(b1);
        boolean b2=str1.equals(str2);           //==>???///      System.out.println(b2);
        boolean b3=str1.equalsIgnoreCase(str2); //==>???
        System.out.println(b3);
//      
        System.out.println(str1.startsWith("J"));
        System.out.println(str1.startsWith("JAVA"));
//      How to find whether str1 equals to str5 without using .equals method? 
        System.out.println(str1.startsWith(str5));
        System.out.println(str1.contains(str5));
        System.out.println(str4.isEmpty());
        System.out.println(str3.isBlank());
        System.out.println(str4);
        System.out.println(str3.isEmpty());
        System.out.println(str4.trim());
        System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));
//      
        String dup="MMMMMBBBBnnnnhhhrRRRRRkkkkyuiop";
        for (char i = 'A'; i <= 'z'; i++) {
            int count=0;
            
            for (int j = 0; j < dup.length(); j++) {
                
                if(i==dup.charAt(j)) {
                    count++;
                }
            }
            System.out.println(i+" occures "+count+" times...");
        }
        
        
        
        String books="book is good book and book maybe books or bad bbooks"; //==> How many books?
	}
    }