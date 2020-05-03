package Lesson10_ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;

public class A17_Rewiev {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		//add(object):takes an object
	// list was original empty
		list.add(10); //   now stored 10 index 0 /, adds ordered positin, doesnt skip /autoboxing
        list.add(20);
		
		//add(index,object): it will insert the given object at given index
		list.add(1,30);//inserted between 10 and 20,next value I am inserting should be indext3, if I wont to insert 
		//index 4 ,out of bount beradi, bc we cannot skipp index, bc arrylist size is dinamic
		//list.add(4,40);
		list.add(3,50);//after yuq index dan keyin bor indexni ham berib bulmaydi, java read top to bottom
		System.out.println(list);
		
		//get(index number): returns the object at given index,uset extract particular element from arrayList
		
		System.out.println(list.get(3));//50
		System.out.println(list.get(1));//30
		//size method
		//you can use loop by using size method, to find out last index number
		//last index number:list.size()-1	(bc:array starts 0 and -1 bn bitta kamaytiramiz)	
		for(int i= 0; i<list.size()-1;i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		// write reverse order
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");//50 20 30 10
		}
		//set (0,object): replece the index given object
		ArrayList<String> students= new ArrayList<>();
		students.add("Erhan");//0
		students.add("Humayra");//1
		students.add("Rawa");//2
		students.add("arzu");//3
		students.add("Max");//4
		System.out.println(students);//[Erhan, Humayra, Rawa, arzu]
		//if I wont replece another name index 0:
		students.set(0, "Holly");
		System.out.println(students);
		System.out.println(students.set(4, "Happy"));//Max
		System.out.println(students);//[Holly, Humayra, Rawa, arzu, Happy]
		
		
		//equals method:returns boolean expration:checks by index
		ArrayList<String> students2= new ArrayList<>(Arrays.asList("A","B","U","l"));
				System.out.println(students.equals(students2));//false
				students=students2;//copy qilindi
				System.out.println(students.equals(students2));//true
		//Contains(Object):check if given object is contained in arrayList
				System.out.println(students);
				System.out.println(students.contains("Muhtar"));//false
				System.out.println(students.contains("Max"));//false
				System.out.println(students.contains("A"));//true
		
	}

}
