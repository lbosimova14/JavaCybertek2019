package Lesson10_ArrayListClass;

import java.util.ArrayList;

public class A01_ArrayListClass_Introduction {

	public static void main(String[] args) {

        /*
         Declaration of arrayList:
                ArrayList<ClassType> variableName = new ArrayList<>();
                
                ArrayList<ClassType>  variableName = new ArrayList<ClassType>();
                
         */
                int[] array1 = new int[1];
        
        
            ArrayList<Integer>  list = new ArrayList<>();
            
            ArrayList<Integer>  list2 = new ArrayList<Integer>();
                            list2.add( 10 );  // auto-boxing
                            list2.add( 20 );
                            list2.add( 30 ); 
                            // [10, 20, 30]
            // index:            0   1   2              
                                    
            
            System.out.println( list2 );
            
            
            System.out.println( list2.get(1) ); // 20
        //  System.out.println( list2.get(9) );   // maximum index number is 2,out of bound exeptions
        
            
            System.out.println( list2.size() );  //3
            
            list2.clear();
            System.out.println( list2 );
            
            System.out.println( list2.size() );
            
        	ArrayList<Integer> nameList=new ArrayList<Integer>();
    		nameList.add(10);
    		nameList.add(1);
    		nameList.add(111);
    		nameList.add(11);
    		nameList.add(12);
    		System.out.println(nameList.get(2));//111
    		
    		ArrayList <String> arrayList =new ArrayList<>();
    		arrayList.add("Laylo");
    		arrayList.add("iiii");
    		arrayList.add("pppp");
    		arrayList.add("yyyy");
    		System.out.println(arrayList);//[Laylo, iiii, pppp, yyyy]

	}

}
