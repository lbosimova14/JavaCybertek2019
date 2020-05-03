package Lesson10_ArrayListClass;
import java.util.ArrayList;
import java.util.Collections;

public class A04_Sort_ArrayList {

	public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>(); 
        for(int i=20; i >= 0; i--) {
            list2.add(i);
        }
    
    System.out.println(list2);
  
    
    // sorting the arraylist:
                    Collections.sort(list2);
                System.out.println(list2);

	}

}
