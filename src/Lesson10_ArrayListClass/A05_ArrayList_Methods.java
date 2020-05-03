package Lesson10_ArrayListClass;

import java.util.ArrayList;

public class A05_ArrayList_Methods {

	public static void main(String[] args) {
	
ArrayList<String> list=new ArrayList<>();
ArrayList<String> list2=new ArrayList<String>();
   //add:(object) overloaded method
ArrayList<String> shoppingList=new ArrayList<String>();
//size automaticalli adjusted
shoppingList.add("apple");//index:0, size :1
shoppingList.add("orange");
shoppingList.add("grape");
shoppingList.add("apple");//index: 3, size: 4
//printing arraylist you dont have to convert t string, just call arraylist varibale name
System.out.println(shoppingList);
//second way is: add(index,object):adds object at the given index number
shoppingList.add("strawberry");
System.out.println(shoppingList);//[apple, orange, grape, apple, strawberry]
shoppingList.add(1,"Straberry");
//now switched index number
System.out.println(shoppingList);//[apple, Straberry, orange, grape, apple, strawberry]

//shoppingList.add(7,"Tayota");//error  doest not skip index
//System.out.println(shoppingList);
	
System.out.println(shoppingList.size());//6
//another example:
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(0,  5);  // [5]
numbers.add(1,  10); // [5, 10]
numbers.add(2,  15); // [5, 10, 15]

numbers.add(1,  1);   // [5, 1, 10, 15]

numbers.add(1, 6);  //[5, 6, 1, 10, 15]

System.out.println(numbers);

//  get(index number): returns the object
ArrayList<String> names = new ArrayList<>();
    names.add("Homayra");
    names.add("Meri");
    names.add(1, "Mikrigul");
    names.add(1, "Tabriz");
    names.add(0, "Asiya");
    
    String str1 = names.get(1); 
    System.out.println( str1 );
	
	// printing one by one we use for loop:
    for(int i=0; i<names.size();i++) {
    	String each=names.get(i)+" ";//you can concate here too, sepereting words
    	System.out.print(each);
    }
    System.out.println();
	//OR use for each loop
    for(String each :names) {
    	System.out.print(each+" ");
    }
	System.out.println();
	//clear method:
    ArrayList <String> students = new ArrayList<>();
    students.add("Holly");
    students.add("Molly");
    students.add("Jolly");
    students.add("Dolly");
    students.add("Kolly");
    
    System.out.print(students);//[Holly, Molly, Jolly, Dolly, Kolly]
    System.out.println(students.size());//5
	   students.clear();//now, hammasi uchib ketdi
	   System.out.print(students);//[]
	   boolean b=students.isEmpty();
	   System.out.println(b);//true
	
//set(index number, object): given object will replace the object at the given index number
	   ArrayList<String> Javangers = new ArrayList<>();
	   Javangers.add("Ferhat");
	   Javangers.add("Lola");
	   Javangers.add("Asia");//Asia replace with "Shavkat"
	   Javangers.add("Alex");
	   Javangers.add("Safuu");
	   Javangers.add("Lexsu");//[Ferhat,Lola,Asia,Alex, Safuu,Lexsu] befor replasing
	 System.out.println(); 
	   Javangers.set(2, "Shawkat");
	   System.out.println(Javangers);//[Ferhat, Lola, Shawkat, Alex, Safuu, Lexsu] Asia is gone
	   //now defferent
	   Javangers.add("Ferhat");
	   Javangers.add(1,"Lola");
	   Javangers.add(1,"Asia");
	   Javangers.add("Alex");
	   Javangers.add("Safuu");
	   Javangers.add(0,"Lexsu");
	  System.out.println("adding"+Javangers);//adding[Lexsu, Ferhat, Asia, Lola, Lola, Shawkat, Alex, Safuu, Lexsu, Ferhat, Alex, Safuu]
	   Javangers.set(1, "Shawkat");
	   System.out.println(Javangers);
	  
	//contains(object):checks if the given object is contained in the ArrayList....
	   ArrayList<String>goodGuys=new ArrayList<>();
	   goodGuys.add("Hakan");
	   goodGuys.add("Ihsan");
	   goodGuys.add("Tim");
	   goodGuys.add("Ibrahim");
	   goodGuys.add("Dilyar");
	   
	   boolean  result=goodGuys.contains("Muhtar");
	   System.out.println(result);//false
 //equals(ArrayList): check if the two arrayList equla or not,returns boolean 
	  ArrayList<String> badGuys=new ArrayList<>();
	  badGuys.add("Muhtar");
	  badGuys.add("hola");
	  badGuys.add("Asiya");
	  badGuys.add("replit");
	  boolean result2= badGuys.equals(goodGuys);
	  System.out.println(result2);//false
	  if(goodGuys.contains("Muhtar") && badGuys.contains("Muhtar"))//&& operatin quyayotganimiz uchun false print qilayapti
// Because muhtar suzi goodGuys ArrayListda yuq,agar || or operatinnni quysak, true statement print out qilgan bulardi, 		  
		  System.out.println("Muhtar is good guy");
	  else
		  System.out.println("not");
	
	
	/*Class NOTES:
	 * 
ArrayList:  presented in "java.util"
            does not support primitives, we can only store objects
            ArrayList' size is dynamic, adjusted automatically.
            ArrayList is an ordered collection of values (index number).
            we can add or remove objects from arrayList
        
decleration of ArrayList:
        ArrayList<NonPrimitive> variableName = new  ArrayList<NonPrimitive>();
        ArrayList<NonPrimitive> variableName = new  ArrayList<>();  (prefered)
decleration of array:
                int[] arr = new int[5];
methods of arraylist:
        add(object): adds objects to arrayList
        get(index):  gets the data from the arraylist
        size(): rteurns the length of arraylist as int
        clear(): remeovs everything from arraylist
        set(index number, object): the given object will replace the object at the given index number
        contains(Object): checks if the given object is contained in the ArrayList or not, returns boolean values
        equal(ArrayList): checks if the two arrayList have same objects or not, returns boolean value
        remove(int): removes the given index
        remove(object) :  removes the first matching object, and retruns boolean value
ArrayList vs Array:
    ArrayList' size is dynamic, Array' size is fixed
    ArrayList only supports nonprimitives, Array supports all
    Array can nbe multi-dimensional but ArrayList cannot be multi-dimensional
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
