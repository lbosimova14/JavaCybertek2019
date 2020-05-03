package Lesson10_ArrayListClass;

import java.util.ArrayList;

public class A06_RemoveMethod {

	public static void main(String[] args) {
		
		
		System.out.println("just test");
		   // remove(int): removes that index number
        ArrayList<Integer>  lists =  new ArrayList<>();
                lists.add( 1 ); // auto-boxing   index: 0
                lists.add( 2 ); // auto-boxing   index: 1
                lists.add( 3 ); // auto-boxing   index: 2
                lists.add( 4 ); // auto-boxing   index: 3
                lists.add( 5 ); // auto-boxing   index: 4
                
                lists.remove( 1 );  //[1, 3 , 4, 5]
                lists.remove(2);   // [1, 3, 5]
                lists.remove(1);   // [1, 5]
            System.out.println(lists);  
            System.out.println(lists.size());
    
            
    // remove(Integer): removes the first matching object,  at the same time returns boolean value
        
        ArrayList<Integer>    lists2 = new ArrayList<>();
            lists2.add( 1 ); // auto-boxing   index: 0
            lists2.add( 2 ); // auto-boxing   index: 1
            lists2.add( 3 ); // auto-boxing   index: 2
            lists2.add( 4 ); // auto-boxing   index: 3
            lists2.add( 5 ); // auto-boxing   index: 4
            
            // [1, 2, 3, 4, 5]
            Integer a = 8 ;
        boolean r1 =lists2.remove(a);  // [2, 3, 4, 5]
            
            System.out.println(lists2);
            System.out.println( r1 );
            
        
        ArrayList<String> city = new ArrayList<>(); 
            city.add("Miami");
            city.add("Miami");
            city.add("Gotham");
            city.add("Azarbaijan");
            city.add("Istanbul");
            city.add("Urumqi");   // [Miami, Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
                        
        //  city.remove("Miami");  // [Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
        
            if( city.remove("Miami") )    {  // [Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
                    city.remove( 2 );  // [Miami, Gotham, Istanbul, "Urumqi"]
            }
            
            city.add(3, "Azarbaijan" ); // [Miami, Gotham, Istanbul, Azarbaijan,"Urumqi"]
            System.out.println(city);
                    
            
        ArrayList<Integer>     price = new ArrayList<>();           
            price.add( 1 );// auto
            price.add( 2 );
            price.add( 3 );
            price.add( 4 );
            price.add( 5 );
            
            price.remove( Integer.parseInt("2") ) ;  // parse method retunrs primitive,
            System.out.println(price);  // [1, 2, 4, 5]
            
            boolean r3 = price.remove( Integer.valueOf("3") );  // valueOf method returns wrapper class,
            System.out.println(price);
            System.out.println(r3);

	}

}
