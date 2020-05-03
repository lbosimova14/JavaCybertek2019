package Lesson30_Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedList_examples {

	public static void main(String[] args) {
		//The java.util.Arrays.asList(T... a) returns a fixed-size list backed by the specified array. (Changes to the returned list "write through" to the array.) 
		//This method acts as bridge between array-based and collection-based APIs,
		List <Double> lst = new LinkedList <> (Arrays.asList(2d,33d,4d,55d,4d,7d,8d,65d,2d,9d));
		System.out.println(lst);
		//accending items using index
		System.out.println(lst.get(0));//2.0
		//adding items in certain index
		lst.add(1,5d);
		System.out.println(lst);//[2.0, 5.0, 33.0, 4.0, 55.0, 4.0, 7.0, 8.0, 65.0, 2.0, 9.0]
		// 33 is shifted 1 position up,inserted between 2 and 33
		
		//updating items in certain index
		lst.set(0, 99.0);
		System.out.println(lst);//[99.0, 5.0, 33.0, 4.0, 55.0, 4.0, 7.0, 8.0, 65.0, 2.0, 9.0]replaced
		
		//getting indexs of certain items
		System.out.println(lst.indexOf(5.0));//1
		System.out.println(lst.indexOf(4.0));//3
		System.out.println(lst.lastIndexOf(9.0));//10
		System.out.println(lst.indexOf(77d));//-1     77 is not in the list and returns -1
		
		//remove (Object)
		//remove(index)
		lst.remove(1);//removing by index
		System.out.println(lst);//5.0 is gone, 
		
		//addAll at certain index
		lst.addAll(2,Arrays.asList(88d,89d));
		System.out.println(lst);
		
		
		//replaceAll(function: UnaryOperator)
		System.out.println("replace each item with new value increased by 5:");
		lst.replaceAll(each-> each +5);
		System.out.println(lst);//[104.0, 38.0, 93.0, 94.0, 9.0, 60.0, 9.0, 12.0, 13.0, 70.0, 7.0, 14.0]
		
		      //sort
		//lst.sort(null);//makes natural order,sort assending order
		//[7.0, 9.0, 9.0, 12.0, 13.0, 14.0, 38.0, 60.0, 70.0, 93.0, 94.0, 104.0]
		//lst.sort(Comparator.naturalOrder());//[7.0, 9.0, 9.0, 12.0, 13.0, 14.0, 38.0, 60.0, 70.0, 93.0, 94.0, 104.0]
		lst.sort(Comparator.reverseOrder());//[104.0, 94.0, 93.0, 70.0, 60.0, 38.0, 14.0, 13.0, 12.0, 9.0, 9.0, 7.0]
		System.out.println(lst);
		
	

	}

}
