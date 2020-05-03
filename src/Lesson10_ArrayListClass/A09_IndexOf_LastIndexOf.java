package Lesson10_ArrayListClass;

import java.util.ArrayList;

public class A09_IndexOf_LastIndexOf {

	public static void main(String[] args) {
		
		//indexOf(object) : returns the index number of the object from the arrayList, retuns int 
        //lastIndexOf(Object): returns the last index number of the object from the arraylist, returns in 
			ArrayList<Integer> list = new ArrayList<>();
    list.add(  1  ); // auto boxing 
    list.add( Integer.valueOf("33") );  // none
    list.add( Integer.parseInt("100") ); // auto boxing
    list.add(200);
    list.add(20);
    list.add( 1 );
    
    
// indexOf(object): returns the index number of first matching object from the arrayList    as an int
     // if it returns negative number, it means the given object is not exist in the arraylist
    
    
    int a = list.indexOf( 11 );  // auto boxing
    System.out.println( a ); //-1 there not 11 in the list  
    
        int a2 = list.indexOf(200);
        System.out.println(a2);//3


// lastindexOf(object):  returns the last occured object' index number (last index number) as an int
        int a3 = list.indexOf(1);   //0
        
        int a4 = list.lastIndexOf(1);  // 5
        System.out.println(a3);
        System.out.println(a4);

	}

}
