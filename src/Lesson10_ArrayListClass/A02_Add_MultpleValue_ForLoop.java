package Lesson10_ArrayListClass;

import java.util.ArrayList;

public class A02_Add_MultpleValue_ForLoop {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0; i<=30;i++) {
			if(i%2!=0) {
				continue;
			}
			list.add(i);
		}
		System.out.println(list);//[0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30]
		System.out.println(list.size());//16
		System.out.println(list.get(4));//8
		
		for(int i=0; i<list.size();i++) {
			//System.out.print(i+" ");//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 this size
			
			System.out.print(list.get(i)+" ");//0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30  actual even numbers
		}
		System.out.println();
		for(int each:list) {//unboxing
			System.out.print(each+" ");//0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
		}
		System.out.println();
         int num=list.get(7);
         System.out.println(num);//14
         
         //list.clear();//size of list become 0;
        // System.out.println(list.get(2));//index out of bound
	}

}
