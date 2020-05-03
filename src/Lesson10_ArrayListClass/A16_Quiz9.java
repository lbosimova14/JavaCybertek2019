package Lesson10_ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;

public class A16_Quiz9 {

	public static void main(String[] args) {
	//Q3:
		
		ArrayList<Integer> list=new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3));
		//index                   0,1,2
		int a=1;//it remove index number, it has object 2 removed and 1 and 3 left
		list.remove(a);
		System.out.println(list);//[1, 3]
	//Q4	
		ArrayList<Integer> list2=new ArrayList<>();
		list2.addAll(Arrays.asList(1,2,3));
		Integer A=1;//when pass remove class it removes first matching object
		list2.remove(A);  
		System.out.println(list2);//    [2, 3]
		
		
//Q5:
		String []arr = {"Rob","Bran","Rick","Bran"};
		//ArrayList<String> names=new ArrayList<>();
		 ArrayList<String> names = new ArrayList<>( Arrays.asList(arr) );
//Attempt first matching object, removed first matching object, then remove it will give you true statmrnt
	//,John yuq berda, and gives false
	    if(names.remove("Bran")) {  //[Rob, Rick, Bran] ,  true
            names.remove("John");  // false
        }
        
        
        System.out.println(names);  // [Rob, Rick, Bran]
	}

}
