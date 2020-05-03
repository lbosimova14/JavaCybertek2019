package Lesson30_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsReview {
	
	public static void main(String[] args) {
		//List (I) does have index number , accept duplicates
		//implemented by: ArrayList (C),LinkedList(C), Vector(C)
		List <Integer> list =new ArrayList<>();
		
		list.add(100);
		list.add(100);
		list.add(100);
		list.add(200);
		System.out.println(list);//[100, 100, 100, 200]
		//ArrayList(C):array based, internally uses array
		//LinkedList(C): each object are doubly linked,add() & remove() are faster then ArrayList,
		                 //get() is slower then ArrayList,happening in  java background
		//Vector(C):1. it is synchronized-----> achieved thread safety in multi-thread--->slow performance
		//           2. has child class:Stack(LIFO)action has pop();last object entered 
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(100);
		stack.add(200);
		stack.add(300);
		System.out.println(stack.pop());//300    removes last object from Stack
		System.out.println(stack.pop());//200
		
		ArrayList <Integer> arraylist= new ArrayList<>();
		arraylist.add(1);
		
		Vector <Integer> vector=new Vector();
		vector.add(2);//synchronized keyword
		vector.set(0,1);//has sychronised keyword
		
		
		
		//Set(I) does not have index number,does not accept duplicates,Implemented by: HashSet, LinkedHashSet
		Set<Integer> set=new HashSet<Integer>();
		set.add(100);
		set.add(100);
		set.add(100);
		System.out.println(set);//[100]
		
        
 int[][] arr2D= { {1,2,3}}   ;
 
 ArrayList<Integer> l1 = new ArrayList<Integer>();
 
 ArrayList< ArrayList<Integer> >  listOfList =  new ArrayList<>(); // it's not multidimensional
         // listOfList.add(1);
     listOfList.add(l1);
         
 
     
     
 Set<Integer> hashset = new HashSet<Integer>();
         hashset.add(100);
         hashset.add(90);
         hashset.add(80);
         hashset.add(70);
         hashset.add(70);
         
         System.out.println(hashset);
 
Set<Integer> linkedhashset = new LinkedHashSet<Integer>();
         linkedhashset.add(100);
         linkedhashset.add(90);
         linkedhashset.add(80);
         linkedhashset.add(70);
         
         System.out.println(linkedhashset);
     
 //SortedSet<Integer> sortedset = new HashSet();   
     
 List<Integer> lists = new ArrayList<Integer>( Arrays.asList(10, 9, 8, 7, 6));
 //  Collections.sort(lists) ;
 System.out.println(lists);
 
 
 SortedSet<Integer> sortedset = new TreeSet<Integer>( lists );
         System.out.println(sortedset);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
