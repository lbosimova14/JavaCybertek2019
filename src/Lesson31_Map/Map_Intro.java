package Lesson31_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_Intro {
public static void main(String[] args) {
	Map <String,Double> employee= new  HashMap<>();
	//put(): add keys and value
	employee.put("Laylo", 47.5);
	employee.put("La", 46.5);
	employee.put("Lao", 87.0);
	employee.put("Lolo", 97.5);
	System.out.println(employee);//{Lolo=97.5, La=46.5, Laylo=47.5, Lao=87.0}   unoder
	//get(): asks to  provide key
	double salary1=employee.get("Laylo");
	System.out.println(salary1);//47.5
	System.out.println(employee.get("Maggi"));//null
//	double salary2=employee.get("Maggi");//Exception in thread "main" java.lang.NullPointerException
//	System.out.println(salary2);
	  
	//remove(key) : still provide key, remove method remove key and its value
	
    employee.remove("La");
    System.out.println(employee);//{Lolo=97.5, Laylo=47.5, Lao=87.0}
    System.out.println(employee.size());//3
    
    //contains method: verifies if given Key is exist in the map, returns boolean
   boolean a= employee.containsKey("Mahi");
   System.out.println(a);//false, this key is not exit in the list
   boolean b=employee.containsValue(97.5);
   System.out.println(b);//true  bc exist on list
   
   
   
   //keySet(): returns all the key as Set Interface,only retrive the key not value
   Set<String> set =employee.keySet();
   System.out.println(set);//[Lolo, Laylo, Lao]
   
   //Key cannot be duplicated, Value can be duplicated
   Map<String,Integer> map1= new LinkedHashMap<>();
   map1.put("A", 100);
   map1.put("A", 10);
   map1.put("W", 600);
   map1.put("W", 700);
   map1.put("A", 100);
   System.out.println(map1);
   
   map1.put(null,null);
   System.out.println(map1);//null=null
   
   //1.whenever store null in Hashtable it rejected null keyword,
  // HashTable(C) Key and Value cannot be null(no null allowed)
   //2. is synchronized----> Thread-safe, very slow
   
   
   
   
   //TreeMap(C): implementing SortedMap,sorting the key
   TreeMap<String,Integer> map3= new TreeMap<>();
   map3.put("Z",100);
   map3.put("Y",200);
   map3.put("X",300);
   System.out.println(map3);
    
    //HashMap(C): does not maintain the insertion order as its
    //LinkedHashMap(C):maintains the insertion order as its, double
	
}
}
//Class Note
