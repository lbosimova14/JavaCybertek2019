package Lesson10_ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;

public class A15_RemoveDup_CharArrayList {

	public static void main(String[] args) {
// 3. write a return method that can remove the duplicated objects from  a Character arraylist
      ArrayList <Character> listChar=new ArrayList<>(Arrays.asList('a','a','r','o','o','k','k'));
      System.out.println(listChar);//[a, a, r, o, o, k, k]
      //after removed duplicate, by calling method
      listChar=RemoveDupChar(listChar);
      System.out.println(listChar);//[a, r, o, k]
  //  4. write a return method that can remove the duplicated objects from  a Double arraylist
      ArrayList<Double> Dlist=new ArrayList<>(Arrays.asList(2.0,3.3,4.4,5.0,6.0,6.0,3.3,2.0,4.4));
      System.out.println(Dlist);
      
      Dlist=RemoveDoubleDup(Dlist);
      System.out.println(Dlist);//[2.0, 3.3, 4.4, 5.0, 6.0]
	
	} //main method ending
	

	
	
	// 3.      create char ArrayList return method
	public static ArrayList<Character> RemoveDupChar(ArrayList<Character> charList){
		ArrayList<Character> result= new ArrayList <Character>();
		for(int i=0;i<charList.size();i++) {
			if(!result.contains(charList.get(i))) {
				result.add(charList.get(i));
			}
		}
		return result;
	}
	
	//4.  create double Arraylist return method
	 
	 public static ArrayList<Double> RemoveDoubleDup(ArrayList<Double> listD){
		 ArrayList <Double> result =new ArrayList<>();
		 for( int i=0; i<listD.size();i++) {
			 if(!result.contains(listD.get(i))) 
				 result.add(listD.get(i));	 
		 }
		 return result;
	 }

}//class ending
