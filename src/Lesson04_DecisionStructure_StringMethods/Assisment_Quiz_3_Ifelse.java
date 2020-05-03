package Lesson04_DecisionStructure_StringMethods;
/*package day13_Reveiw;

public class Assisment_Quiz_3_Ifelse {

	public static void main(String[] args) {
	
	

	/*		int num =9;

			if(num++ == 10) {  // line 1 num=10
               //9==10======>false
			System.out.println("Hello World "+num);    // line 2

			}

			else {

			System.out.println("Hello Universe "+num);  // line 3    
                                                 //10
			}
			
	//Q2

				int score=0;

				if(score == 0) {
                  //0==0====>true
				score += 50;     //score =50

				}

				if(score !=0 ) {
                     //50!= 0======> true    
				score +=50; //50+=50======>100;

				}

				System.out.println(score);

					
			
    // Q3:
    char grade ='A';
    boolean Passed = grade == 'A' || grade =='B';
    //                  'A'=='A'  ||  'A' == 'B'
    //                    true    ||   false  ==> true
    
    boolean Passed2 = grade == 'C' || grade =='D'; 
    //                 'A' == 'C'  ||  'A' == 'D';
    //                  false      ||    false  ==> false    
    if( Passed || Passed2) {
    //   true  || false  ==>  true   
        System.out.println("You've passed the exam");
    }
    else {
        System.out.println("You failed");
    }
		

   /* // Q4:
    
    boolean A = true, B =  !false;
    //                B = true
        if( B ) {
            // true
            System.out.println("B");
        }
        else if(  A ) {
            // true
            System.out.println("A");
        }
         else {
            System.out.println("C");
            
  }*/
    //Q5 compiler error
  /*  boolean result = true;

    if(result) {

    System.out.println("it's true");

    }

    else {

    System.out.println("it's false");

    }

    else if(result) {

    System.out.println("None of the above");

    }

    }*/
    
        //Q8
      /*  boolean A = true, B = !A; //B is A=false
                        //false
        if(A) {//true , excutes next

        if(B) {//false doest excute but shu if statementni else parti excute buladi

        System.out.println("Monday");

        }else {

        System.out.println("Tuesday");//this is excuting else st is belong to 2nd if
        }
        }
	//this closing is 1st if niki

        else {

        if(A) {

        System.out.println("Thursday");

        }else {

        System.out.println("Friday");

        }
			}*/
	
		//Q9
  /*      int number =10;
/*
        if(--number > 10) {
//          9      > 10   false
        System.out.println("Hello Cybertek "+number);

        }else if(number ==9) {
//                9    =  9 >>>>>  true
        System.out.println("Hello World "+number);

                                          // 9
		//output is HelloWord 9
        }
		//Q10
        // all excuted
        
        boolean X = true;

        boolean Y = !X==false;
//                  false ==false >>>true   
        boolean Z = Y;// Z=true

         

        if( X ) {

        System.out.println("Hello Everyone");

        } if( Y ) {

        System.out.println("Today is great day");

        } if( Z ) {

        System.out.println("We have picnic on Saturday");

        }

        //nested if
        //when we need nested if + when precodition
        //if condition can be evaluate to multiple

        /*vote age:
           age >= 18  ==> eligible to vote
           
           age >= 70  ==> can vote three times
           70 > age >=50 ==> can vote twice
           50 > age >=18 ==> can vote one time
           
        */
     /*      int age = 70;
       
       if( age >= 0 && age <= 150 ) {
           
           if(age >= 18) {
        	   
               if( age >= 70 ) { // age >= 70
                   System.out.println("can vote three times");
                   } 
               else if( age >= 50 ) {  // 70>age >=50
                   System.out.println(" can vote two times");
                   } 
               else {  // age < 50
                   System.out.println(" can vote one time");
                   }   
           }else {
               System.out.println("not Eligible to Vote");
           }
           
       } else {
           System.out.println("Invalid Entry");
       }
		
		
}
}	
*/

