package Lesson04_DecisionStructure_StringMethods;
import java.util.Scanner;// import 1 class only
public class StringClass {

	public static void main(String[] args) {

    
   /* 1. String is an object
                there are two ways to create object from String class:
                            1. String literals:
                                            String str = "Cybertek";
                            2. by using "new" keyword:
                                String str = new String("Cybertek")
                when the String object is created by String literals, that object will be saved at String pool (String pool does not take duplicates)
                when the String object is created by using "new" keyword. the object will be saved at java heap memory (not within the String pool)
                heap memory : the place where all the objects are store at
                String pool : located in heap memory, stores all string literals' objects 
                everytime when we use new keyword, compiler will create a new object in java Heap memor*/
		  
        String str ="Cybertek";
        String A = "Cybertek";
        String B = "Cybertek";
        System.out.println( A == B );//true
            // both String literals are stored at String pool
        
        
        String str2 = new String("Cybertek");
        
        System.out.println( str == str2 );  
                // different memory locations
        
        String str3 = new String("Cybertek");
        System.out.println(str2 == str3); //false
        
        
        String s1 = "cat";
        String s2 = "cat";
        System.out.println(s1==s2); // same memory locations in String pool. true
        
        String s3 = new String("cat");
        String s4 = new String("cat");
        System.out.println(s3 == s4); // different memory locations in java heap
        
        System.out.println(s1 == s4); // different memory
        
        
        String a = "Batch12";
        String b = "batch12";
        System.out.println(a == b);  // false, case sensitivity
        
        String c = new String("cybertek");
        String d = new String("Cybertek");
        System.out.println(c == d);
		
        String name = "Muhtar";
        char abc = name.charAt(4);
        int aa = abc;
        System.out.println(aa);
		
        String q="Cybertek";
      q.concat("School");
        
        System.out.println(q);
        q=q.concat("School");
        System.out.println(q);
        
        String r="Hello";
         r.toUpperCase();
         System.out.println(r);//Hello String is immutable
         r=r.toUpperCase();
         System.out.println(r);// now r is all upper case, HELLO
         String z="booK";
         System.out.println(z.toUpperCase());
         String p=z.toLowerCase();
         System.out.println(p);
         String s=z.concat(r);
         System.out.println(s);
         //warm up task for String:
         Scanner scan = new Scanner(System.in);
          System.out.println("Enter your first and last name");
          String firstName=scan.nextLine(); //.nextLine take complite sentence
          String lastName=scan.nextLine();
          String fullName=firstName.concat(" "+lastName); //+ sign is as a concat method here, concat not does everything does + sign
          // eg:String name="Cyber"+12;//compile fine.
          //eg:String name2="Cybertek.concat(12)"; error, because in concat method you can only give String
          // variable or String
          //eg:String name="Cybertek" + 12+ 'A' + 4.5;
             int num=fullName.length();// num is reusable, declare with int.
          System.out.println(fullName+" contains "+ num+ " characters");
          
          
          //find last letter
          int lastINdexNum= fullName.length()-1;// if not -1 it gives outof range, OutOfBound  
          System.out.println("IndexNumber"+lastINdexNum);
          System.out.println("last index letter"+fullName.charAt(lastINdexNum));
	}

}
