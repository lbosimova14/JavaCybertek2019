package Lesson30_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Iterable(I) extended by root interface  interfece collection
 * we cane apply Interator(I) to classes or interfacees that are sub type of Iterable
 * 
 * Iterator(I): 1.allows us to get access to each objects of the collection type
 *              2. allows us to remove objects from a collection type
 */
public class Iterable {
	public static void main(String[] args) {
		

	List<Integer> list  = new ArrayList<>();
	list.addAll(Arrays.asList(1,1,1,1,12,3,4,5,6,7));
	//Only legit way to remove data elements from collection-type
	for(int i=0;i<list.size();i++) {
		if(list.get(i)==1) {
			list.remove(i);
		}
		}
	System.out.println(list);//[1, 1, 12, 3, 4, 5, 6, 7]
	
	
	
	List<Integer> list2  = new ArrayList<>();
	list2.addAll(Arrays.asList(1,10,111,1,12,3,4,5,6,7));
	//iterator(): iterates the collection, and returns Iterator
	Iterator<Integer> it =list2.iterator();
	                      //iterator list2 and assignet to Iterator and whta i am iteradin it is int, I gave Integer as object
	//hasNext(): check if there are enough elements that can be iteretion
	boolean a = it.hasNext();
	System.out.println(a);//true
	//numbers of iteration is depends on numbers on the list2
	System.out.println(it.next());//1
	System.out.println(it.next());//10
	System.out.println(it.next());//111
	
	
	//Iteration with Set
	Set<String> set= new LinkedHashSet<>();
	set.addAll(Arrays.asList("Apple","ApplePhone","Mango","Banan","Kiwi"));
	Iterator<String> itr=  set.iterator();
	
	//System.out.println(itr.hasNext());//true , if gives me true  i can access to iterator
	//if String contains A or a remove it
	while(itr.hasNext()) {
		String name=itr.next();
		if(name.contains("A")|| name.contains("a")) { //name.toLowerCase().contains("a"))
			itr.remove();
		}
		
	} System.out.println(set);
	

	System.out.println("==================================");
    String[] name = {"Erhan","Eholly","Nadire","Yusuf","Ibrohim", "Tarbiz"};
    
    Set<String> names = new LinkedHashSet<String>();
    names.addAll(Arrays.asList(name));
        
    Iterator<String>  Safwan  =   names.iterator();
    
    while(Safwan.hasNext()) {
            String str = Safwan.next();
            if( str.toLowerCase().contains("e") ) {
                Safwan.remove();
            }
            
    }
    
    System.out.println(names);
	
	
	
	
	   System.out.println("=================================="); 
       // for(initialization;   condition;   iterator)
       //          mandatory    mandatory      
       
       List<Integer> myList = new ArrayList<Integer>();
       myList.addAll(Arrays.asList(100, 900, 500 , 99, 200, 89, 300, 79));
     //remove greater than 100
       for( Iterator<Integer> itra = myList.iterator(); itra.hasNext() ;) {
           int numbers = itra.next();
           if(numbers > 100) {
               itra.remove();
           }
       }
       
       System.out.println(myList);
       
       //with String
       
String[] students = { "Erhan", "Erhan", "Erhan" , "Aijamal", "Safwan","Madina","Erhan", "Erhan"};
   
List<String> namelist = new ArrayList<String>();
   namelist.addAll(Arrays.asList(students));
   
   for( Iterator<String> i = namelist.iterator(); i.hasNext();  ) {
           String str = i.next();
           if(str.equals("Safwan") || str.equals("Erhan") ) {
               i.remove();
           }
   }
   
   
   System.out.println(namelist);
	
	
	
	
	
	
	
	
	
	
	}
}
/*
//Class Notes:
Topics: Queue Interface
Iterable
Package Name: day64_Collections
Collection (I): extended by List(I), Set(I), Queue(I)
List(I): does have index numbers, takes duplicated values
Set(I): deos not have index numbers, does not take duplicates
Queue(I): does not have index numbers, does accept duplicates

implemented by PriorityQueue(C)
extended by Deque(I)
Deque(I) is implemented by ArrayDeque(C), LinkedList(C)
LinkedList(C) is implementing both List(I) & Deque(I)
sorts in ascending order when there is no duplication
Queue(I): 
        poll(): FIFO ==> First In First Out
            return the first object as same data type,
            at the same time it removes the first object from the Queue
Deque(I):
    addFirst(object): adds the given object to the starting point of the Deque
    addLast(object): adds the given object to the very end of the Deque
    removeFirst(): removes the first object from Deque
    removeLast(): removes the last object from Deque
    getfirst(): retrives the first object from the Deque
    getLast(): retrives the last object from the Deque
Iterable(I): extended by root interface interface collection

we can apply Iterator(I) to the classes or interfacses that are sub type of Iterable
Iterator(I):  
1. allows us to get access to each objects of the collection type
2. allows us to remove objects from a collection type 
The ONLY legit way to remove data elements from a collection-type
iterator(): iterates the collection, and retuns Iterator
hasNext(): check if there are enough elemnts that can be iterated
            returns boolean expression
next(): if hasNext() is true, it rertives the current iteration from the collection type
remove(): removes current elemnt of the iteration from the collection type
  */
