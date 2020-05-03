package Lesson30_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/*
 * 
 */
public class ListInterface {
	
	public static void main(String[] args) {
		
		//  #1    List Interface
	
     //List<Integer> list = new List<>();Error bc new List is interface,we cannot create object
	List<Integer> list = new ArrayList<>(); //compiles fine,bc ArrayList is class we can create object to imlemented
	List <String> list2=new LinkedList<>();
	List <Double> list3=new Vector<>();
	List <Integer> list4=new Stack<>();
	//All 3 class almost same thing but this 2 class contain different behavior rather then ArrayList
	//LinkedList has head and tail,each objects are doubly linked:easy modified,more faster than ArrayList(adding add() and removing remove())
	     //disadvatages:retriving data slower then ArrayList(get()) 
	//ArrayList has starts 0 .... 8,array based class,internally uses the array
	
	ArrayList <Integer> arraylist = new ArrayList<>();
	arraylist.add(10);
	arraylist.add(20);
	arraylist.add(30);
	
	System.out.println(arraylist);
	
	LinkedList<Integer> linkedlist=new LinkedList<>();
	linkedlist.add(10);
	linkedlist.add(20);
	linkedlist.add(30);
	linkedlist.remove(1);
	System.out.println(linkedlist);
	System.out.println("=====================================");
	String []arr= {"A","B","S"};
	List<String> notlinked= new ArrayList<>(Arrays.asList(arr));
	LinkedList<String> linked= new LinkedList<>(Arrays.asList(arr));//Linked is not array based class,not print the array
	System.out.println("linkedlist"+linked);
	System.out.println("arraylist "+ notlinked);
	
	//difference between Vector and ArrayList
	//Vector has keyword synchronized:Thread1  (Waiting Thread2,Thread3)more safer but slower
	//synchronized keyword:used to achive===> Thread safe in muti-thread enviroment,try to get access to same resourse
	//ArrayList not synchronize: Thread1,Thread2,Thread3
	Vector<Integer> vector=new Vector<>();
	vector.add(1);
	
	System.out.println("======================");
	Stack <Integer> stack=new Stack<>();//it has pop() action: last in first out,removes the last object from stack
	stack.add(1);
	stack.add(2);
	stack.add(3);
	stack.add(4);
	System.out.println(stack.pop());//4      pop() action is  pop last object out and prints without 4
	System.out.println(stack);//[1, 2, 3] 
	
}
}

/*

Class Note:
Topic: Data Structures
Collection framework Intro
Package Name: day62_Collections
Agenda: 
Morning: Java
Afternoon: Selenium
Data Structures: In order to manage data efficiently and in an orginized manner, we need data structures
-- Array
-- Collections FrameWork
-- Maps
Array: Collection of Data (same data type)
size is fixed
index numbers
can be multi-dimensional
supports primitives & objects
can have duplicates
Collections framework: consists of multiple interfaces, each interfaces has multiple implementations
Interfaces in Collections frame work:
    1. Iterable
    2. Collection
    3. List
    4. Set
    5. SortedSet
    6. Queue
    7. Deque
all those interfaces are presented in java.util package
ONLY supports Objects
Iterable (I): root interface, super type of all the interfaces in collections framework
Collection (I): extended by three interfacses: List(I), Set(I), Queue(I)
List(I):  implemented By ArrayList(C), LinkedList(C), Vector(C)
    has index numbers, dynamic sized, accepts duplicates
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<Double> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();
    ArrayList: array based class, internally uses the array
    LinkedList:  each objects are doublly linked in the LinkedList
            doublly linked:  adding & removing  (add(), remove()) data are faster 
                    retriving data (get() ) is slower
                Is not array based class
    Vector: is synchronized, only prefered in  multi-threads
            advantage: thread safe in multi-thread environment
            dis-advantage: slower
            has a child class: Stack
        Stack: synchronized
                pop(): LIFO ==> Last in First Out
                        removes the last object from the stack
Set(I): does not take duplicates, deos not have index numbers
        implemented by HashSet(C), LinkedHashSet(C)
        extended by SortedSet(I)
        SortedSet is implemented by TreeSet(C)
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new LinkedHashSet<>();
        Set<Integer> st3 = new TreeSet<>();
        ONLY Accepts unique Objects
    HashSet: 
    LinkedHashSet:
synchrnozed keyword:  used to achive ==> Thread safe in  multi-thread environment
multi-thread: multiple threads try to get access to same resources
*/