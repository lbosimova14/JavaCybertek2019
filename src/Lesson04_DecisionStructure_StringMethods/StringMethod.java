package Lesson04_DecisionStructure_StringMethods;

public class StringMethod {

	public static void main(String[] args) {
		/*String is a object
		 * There are two ways create String class objects:
		 * 1. String literals: eg: String str="Cybertek";
		 * 2. by using "new" keyboard: eg: String str=new String("Cybertek"); also called constructor
		 * Java Heap: a memory location where all the objects will be saved at
		 * String Pool: Located in Java Heap memory, it is very special memory location for String literals
		 * every time if the String object is created by String literals, the object will be saved at String pool
		 * 
		 * everytime if the String object is created by using "new" keyborad , the object will be saved at Heap memory, 
		 * out side String pool
		 * 
		 */
// equal method VS == sign
		String str1 = "Hello Javangers";
		String str2= "Hello Javangers";
		boolean R1 = str1 == str2; //true because the same location
		System.out.println(R1);
		
		String str3=new String ("public pool");
		String str4=new String ("public pool");
		boolean R2= str3 == str4;
		System.out.println(R2); //false because they are two different pool(location)
		
		boolean R3= str1==str3;// false because 2 diffrent location too
		System.out.println(R3);//false
		
		
		/*Method of String class
		1. concat, 2. Length, 3. charAt. 4. to upperCase, 5 toLowercas
		*/
	// concat(str): it takes String, and combines the two Strings and returs it as new String Value
		 String a ="Cybertek";
		 a.concat("School");   //"Cybertek School"
		 System.out.println(a);
		 
		 a=a.concat("School"); // a."Cybertek School"
		 System.out.println(a);

// length method..... length(); it returs the total number of the characters as an int value
		 String LongName="ABCDERGTYHU";
		 int num=LongName.length();
		 System.out.println(num); //11 charecter

// char method charAt(); it returs the character of the index number as a char value
//String is represents sequeences of characters:
//each character in the String, has index number, index number stars from 0 eg: String str="Cybertek";
                                                                                          //01234567
		 //    lenght: 8       highest index number=-1
	
	String name1="Muhtar";
	//index:      012345
char ch=name1.charAt(5);
System.out.println(ch);// r, index 5 is r


/*
 toUpperCase(): converts the String value to Lower case, and returs it as New String value
 */
	
	String name2="cybertek";
	  name2.toUpperCase(); //cybertek    doesnt chage, becouse string immutable
	  System.out.println(name2);
	  
	  name2=name2.toUpperCase();//CYBERTEK  giving another variable
	  System.out.println(name2);
/*
 trim(): its used for removing unused spaces and returns new string value
 	remove from beginning and between the words
 	deletes character of all front and trailing white spaces,it is usually appears at the begining and left side of a string
 	trailing whitespace ch is appears at the end or right side of string, after non-space charecters
 */
	String s1="                           hello          2";
	        s1.trim();
	        System.out.println(s1); //still have space. inisialize qil
	        
	        s1=s1.trim();
	        System.out.println(s1);
	String s2 ="Cybertek     school";
	       s2=s2.trim();
	       System.out.println(s2);
	  
	  
/*
 substring(beginning index): it creates sub value of the String from the beginning index till the last index
                            , returns as NEW String value	
          START THE COUNT FROM ZERO  UNTILL INCLUDING CUTTING OUT FIRST LETTER.                    
 */
	String Str="Cybertek School";
	//          0123456789
	String Str2 =Str.substring(9);//School
	System.out.println(Str2);
	
	// another example
	String address ="Mclean Va 22000";
	String zipcode=address.substring(10);
	System.out.println(zipcode);//2200
/*
 Substring(beginning,ending index):
 it  creates the sub value of the String from the beginning till the ending index(end index number is exclude)
 then returs it as a NEW String value
 */
	String name="Hello Cybertek School";
	//           0123456789.....
	name=name.substring(6, 13);// "Cyberte"
	//name=name.substring(6, 13+1);// "Cybertek  (or do math)
	//name=name.substring(6, 14);// "Cybertek (with space character)
	
	System.out.println(name);
	/*
	 replace(old char, new char): replaces all the old char valuess with the given new char value in the String
	  and returns New string value
	 */
	String strR="Java is Fun Programming Language";
	strR=strR.replace('a','A'); // replace 1
	System.out.println(strR);
	
	/*
	 replace(old str,new str)
	 replace all the old str value with the given new str value
	 */
	String strS="Today is gonna be grat day to learn java";
	strS=strS.replace("Today", "Tomorrow");//Tomorrow......
	System.out.println(strS);
	
	//or delete
	strS=strS.replace("java", "");
	System.out.println(strS);//Tomorrow is gonna grat day to learn
	
	/*
	 replaceFirst(old str,new str): it replaces the accured ald str with the new str in the String and returns it as a New String value
	 
	 */
	String ST= "Java is fun, Java is good";
	ST=ST.replaceFirst("Java", "Pyton");
	System.out.println(ST); //Pyton is fun,Java is good
	//exaples:
	ST=ST.replace("is good", "iS Good");
			System.out.println(ST);
	
	String STR="Java is programming language,Java is Java";
	STR=STR.replace("Java is Java","C# is Java"); //second java replacing
	System.out.println(STR);
	
	}
	
	
	
	
	

}
