package Lesson30_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Queue: 1.does not have index number, just like Set, but it does accept duplicate
 *        2.implemented by PriorityQueue(C)
 *        3. extendend by Deque(I) and Deque is implemented by ArrayDeque(C), LinkedList(C)
 *        LinkedList(C) is implementing both List(I) & Deque(I)(only class can imlement many interface)
 *        
 *        Queue(I):
 *        poll(): FIFO====> First In First Out  
 */
public class Queue_Interface {
              public static void main(String[] args) {
	     
            	   Queue<Integer>  q1=new PriorityQueue<>();
            	   q1.add(10);
            	   q1.add(20);
            	   q1.add(10);
            	   q1.add(40);
            	   q1.add(50);
            	   q1.add(60);
            	   System.out.println(q1);//[10, 20, 10, 40, 50, 60]
            	 //  System.out.println(q1.get(2));  Error does not have index number, you cannot use get method
            	   
            	   
            	//  System.out.println( q1.poll());//10
            	   
            	   // First In First Out   happening
            	   q1.poll();
            	   System.out.println( q1);//[10, 20, 60, 40, 50]
            	   
            	   q1.poll();
            	   System.out.println( q1);//[20, 40, 60, 50]
            	   
            	   q1.poll();
            	   System.out.println( q1);//[40, 50, 60]
            	   
            	   //Queue is sorted automatically ascending order even dont use sort method
            	   Queue<String>  q2=new PriorityQueue<>();
            	   q2.add("Erhan");
            	   q2.add("Laylo");
            	   q2.add("Elvira");
            	   q2.add("Alla");
            	   q2.add("Madina");
            	   System.out.println(q2);//[Alla, Elvira, Erhan, Laylo, Madina]
            	   q2.poll();
            	   System.out.println(q2);//[Elvira, Laylo, Erhan, Madina]
            	   q2.poll();
            	   System.out.println(q2);//[Erhan, Laylo, Madina]
            	   //first sorting then removing first object(first in first out happening
            	   
            	   //* sorts is ascending order when there is no duplication
            	   //anyway-----  Collections.sort():sorts any collection
            	   
            	   
            	   
            	   /*
            	    * Deque(I):
            	    * addFirst(object)  adds the given object to the starting point of the Deque
            	    * addLast() 
            	    * removeFirst();
            	    * removeLast();
            	    * getfirst();
            	    * getLast();
            	    */
            	   
            	   Deque<Integer> DQ=new ArrayDeque<>();
            	   //addFirst
            	   DQ.addFirst(10);//[10]
            	   DQ.addFirst(20);//[20, 10]  //20 replaced with 10, becoming first step
            	   DQ.addFirst(30);//[30, 20, 10]
            	   
            	  // addLast()
            	   DQ.addLast(80);//[30, 20, 10, 80] adding vary last position
            	   DQ.addLast(500);//[30, 20, 10, 80, 500]
            	   
            	   
            	   //removeFirst();
            	   DQ.removeFirst();//[20, 10, 80, 500]  remover 30, bc 30 was first position
            	   
            	   //removeLast();
            	   DQ.removeLast();//[20, 10, 80]  500 is gone
            	   
            	   
            	   //Deque does not have index cannot use get method but however deque has getfirst and getlast methods
            	  System.out.println( DQ.getFirst());//20  retrives the first object
            	  System.out.println(DQ.getLast());//80    retrives the last object
            	   System.out.println(DQ);
}
}
