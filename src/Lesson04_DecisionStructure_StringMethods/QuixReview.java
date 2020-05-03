package Lesson04_DecisionStructure_StringMethods;

public class QuixReview {

	public static void main(String[] args) {
	//kahoot:
		//Q1
		if(!true!=!false) 
			//false != true=====>true
         System.out.println("Cybertek");
		else
			System.out.println("Hello");
		
		
	
		  // Q2:
        boolean resultA = 9 >=9 || 10 <= 10 ,
                resultB = 'A' >= 128 && 'B' < 128;
        //  resultA = true || true => true
                // resultB = false && true => false
                
        if( !resultA ) {
            // true
                if( resultB ) {
                    // false
                    System.out.println(resultA);
                }else {
                    System.out.println(resultB);
                }
        }
		
		//Q4
		int num=9;
		if(++num<10) {
		//10<10=====>false
			System.out.println(num+"Hello World");
			}else {             //10
				System.out.println(num+"Hello Universe"); //this true output is 10HelloUniverse
			}                       //10
		
		//Q5
		int x=1;
		int y=0;
		if(x++>++y) {//x=2   y=1
			//1>1======>false
			System.out.println("Hello");
			
		}else {
			System.out.println("Wellcome");
		}
		
		System.out.println("Log"+x+":"+y);
		                        //2    1
		
		
		//Q7
		if(true) {
			System.out.println("one");
		}
		if(true) {
			System.out.println("two");
		}
			
		//Q8
		
		
		
		
		
		
		
	}

}
