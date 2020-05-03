package Lesson10_ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;

public class A14_WarmUp_Task {

	public static void main(String[] args) {
// 1. write a return method that can remove the duplicated objects from   an Integer arraylist
//task01:
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3)  );
		//Before remove duplicate
		System.out.println(list);//[1, 1, 2, 2, 3, 3]
		//now call method and pass list variable
		list=RemoveDup(list);
		System.out.println(list);//[1, 2, 3]
//next misol calling method:
		ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(4,4,5,5,6,6,7,7,7,8,8,8));
		list2=RemoveDup(list2);
		System.out.println(list2);//[4, 5, 6, 7, 8]
		
//task02: 2. write a return method that can remove the duplicated objects from a String arraylist
		//call qilish uchun still need ArrayList String...
		//this is object array, and if I add to ArrayList ga qushish uchun ArraysasList ishlatish kk, convert from array to ArrayList
		String[] names= {"KK","KK","PP"};
		ArrayList<String> list3=new ArrayList<>(Arrays.asList(names));
		System.out.println(list3);//[KK, KK, PP] //this is actiual arraylist
		list3=RemoveDup2(list3);
		System.out.println(list3);//[KK, PP]
		//now we need print nonduplicate one,buning uchun call String RemoveDup2,and assighn to String, then print
		//boshqa ArrayList variable berib print qilsa ham buladi, already declared list3 ga assign qilib print qilsa ham buladi
		
		//ArrayList<String>laylo=RemoveDup2(list3);
		//System.out.println(laylo);//[KK, PP]

	}//main method ending

	
	
	//Task01:
	
	public static ArrayList<Integer> RemoveDup (ArrayList<Integer> list){
		                //                      [1,1,1,2,2,2,3,3,3] 
		ArrayList<Integer> result=new ArrayList<>();//my expect result is [1,2,3]
		//check each index of list
		/*for(Integer each : list) {
			if(! result.contains(each)) {//each represent each object in third list
				//result=result+each; doest work use add method
				result.add(each);//not need convert each primitive. 
		//first excute value is 1,then true then value add it in result[1]next time 1 comes will be false and doestn add it in result variable
		// then again check number 2 ,story in result, next object also 2 condition false,bc already 2 contain in result.
			}
		}*/
		//for loop
		for(int i=0;i<list.size();i++) {
			if(!result.contains(list.get(i))){//if these object contain 2 bir hil harf, doesnt contain next add list
		//unboxing happening here:wrapper classes to primitives
				result.add(list.get(i));
			}
		}
		return result;
		//now test it in main method by calling RemoveDup method
	}

//Task02:
	//overload method qilish kk, buni uchun, sam method name, but diffiren paramenter or diffrent data type
	//just give method name diffrent, becouse being iterface
	public static ArrayList<String> RemoveDup2(ArrayList<String>list){
		ArrayList<String> result=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(!result.contains(list.get(i))){//if thise object contain 2 bir hil harf, doesnt contein next add list
		//unboxing happing here:wrapper calsss to primitives
				result.add(list.get(i));
			}
		}
		return result;
		
	}




















}//class ending
