package Lesson30_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		
	
	//#2   Set interface
	
	//Set(I): does not take duplicate, does not have index number
	//implements by HashSet(C),LinkedHashSet(C)
	//extends by SortedSet(I)
	//SortedSet is implemented by TreeSet(C)
	     
		//HashSet
	Set <Integer> hashSet= new HashSet<>();
	hashSet.add(100);
	hashSet.add(100);
	hashSet.add(100);
	hashSet.add(100);
	hashSet.add(100);
	hashSet.add(100);
	System.out.println(hashSet);//[100] prints only 1 >>>>  100 only accespts unique object 
	//System.out.println(hashSet.get(0));//Error HashSet doest not have index number
	
	Set <Integer> hashset = new HashSet<Integer>();
	hashset.add(100);
	hashset.add(10);
	hashset.add(5);
	hashset.add(4);
	hashset.add(100);
	hashset.add(80);
	
	System.out.println(hashset);//[80, 100, 4, 5, 10]  prints inorder,does not keep order as it is
	
	   //LinkedHashSet
	Set <Integer> linkedhashset = new LinkedHashSet<Integer>();
	linkedhashset.add(100);
	linkedhashset.add(10);
	linkedhashset.add(5);
	linkedhashset.add(4);
	linkedhashset.add(100);
	linkedhashset.add(80);
	System.out.println(linkedhashset);//[100, 10, 5, 4, 80] printing as order,keeps 
	
	//both of them does not take duplicate
	//doublly linked,means: add() and remove() are faster than HashSet, get() is slower than HashSet
	
	
	//SortedSet(I)>>>>>>>TreeSet(C)
	
	SortedSet<String> treeSet=new TreeSet<>();
	treeSet.add("Z");
	treeSet.add("W");
	treeSet.add("Y");
	treeSet.add("A");
	System.out.println(treeSet);//[A, W, Y, Z]  sorted  automatically without using any method
	
	//if you use ArrayList you need use Collections class and sort() method
	
	
    
//Task: remove duplicates from an ArrayList, and sorted
        List<Integer> list = new ArrayList<>();
                list.addAll(Arrays.asList(10,9,8,7,6,10,10,10,10));
                Collections.sort(list);  // how to sort List
                
                
                System.out.println(list);
    
    //solution:             
    List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,9,8,7,6,10, 10, 10, 10));
        
    TreeSet<Integer> ts = new TreeSet<>(list2  );   
    System.out.println(ts);
                
                
/*
String str="AAAABBBCCCDDD"; 
write program that can remove duplicates from String

*/
    String str = "ZZZZYYYXXAAAABBBCCCDDD";  // ZYXABCD
    String[] arr =  str.split("");
    System.out.println( Arrays.toString(arr) );
    
// TreeSet<String> restroom = new TreeSet<>( Arrays.asList(arr) );
    
LinkedHashSet<String> restroom = new LinkedHashSet<>( Arrays.asList(arr) );
String result = restroom.toString().replace("[", "").replace("]", "").replace(", ", "");
    
    System.out.println(result); 
                
// second soluition
    String str2 =   new LinkedHashSet<String>(Arrays.asList(arr)).toString();
    System.out.println(str2);
    
	
	
	
//	/*
//	 * String str="AAAABBBBCCCDDD";
//	 * write program that can remove duplicate from String
//	 * split method converts array
//	 */
//	 String str="AAAABBBBCCCDDD"; //shoul be abcd
//	 String [] arr= str.split("");
//	 System.out.println(Arrays.toString(arr));//[A, A, A, A, B, B, B, B, C, C, C, D, D, D]
//	 
//	 TreeSet<String> restroom= new TreeSet<>( Arrays.asList(arr));
//	 System.out.println(restroom);//[A, B, C, D] all duplicated value is removed
//	 //convert to back 
//	 String result = restroom.toString();
//	 System.out.println(result);
//	 String result1=restroom.toString().replace("[", "").replace("]", "").replace(",", "");
//	 System.out.println(result1);//A B C D
//	 
	 

}
}