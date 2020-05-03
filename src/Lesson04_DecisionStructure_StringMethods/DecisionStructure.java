package Lesson04_DecisionStructure_StringMethods;

public class DecisionStructure {
	/*if statement: single if statement:
	 * if(boolean expression){
	 *      some codes here to run
	 * }
	 * if block only gets executed if the condition is true
	 * 
	 * if &else statement: 
	 * if(condition) {//A}
	 *      else{//B}
	 *  multi - branch if statement:we use them when there are more than two possibilities
	 *      if (condition1)    {//A} =====>if condition1 is true
	 *      else if (codition2){//B} ======> if codition 1 is false and condition2 is true
	 *      else               {//C} ======>if condition1 and codition2 are both false
	 *    
	 *      ONLY ONE BLOCK EXCUTED, TOP TO BOTTOM
	 
*/
	public static void main(String[] args) {
//task1
		
		int hour=45;
		double payRate=1.5;
		payRate *=hour;
		if (hour >40) {
			System.out.println("Your pay rate  is "+ payRate);
		}
//task2			
			char myCharacter = 'D';
			if (myCharacter == 'D') {
				System.out.println("Goodbye");
			}
//task3			
			int x=300;
			int y;
			if (x >100) {
				y=20;
				System.out.println( y);}//20
			else {
				y=0;
				System.out.println(y);
			}
//task4			
			
		
			int x1,y1=10;
			if (y1==100)
			{   x1=1;
			    System.out.println(x1);
			}
			
			else
			{
				x1=0;
				System.out.println(x1);//0
			}
			
//task5			
			
			double  commission;
			double sales=70000000;
			 if (sales >=50000.0)
					
			 {
				 commission=0.10;
				 
				System.out.println( commission);//0.1
			 }
				
				else {
					commission=0.2;
					System.out.println(commission);
					 }
	//task6		 
			 int a=18,b,c;
			 if(a<10) {
				 b=0;
				 c=1;
				 }
				 else {
					 b=-99;
					 c=0;
					 }
			 System.out.println(b+"\t"+c);//-99  0
	//task7 nested if 
			 int amount1=1, amount2=800;
			     if(amount1>10) {//true     //and
				 if(amount2<100) {//false
					 System.out.println(amount1+ " >10 and "+amount2+" < 100 ");//if both true,this excute
				 }
				 else {
					 System.out.println(amount2 + " is less than 100");//800 is less than 100
				 }
			     }
	
				 else {
					 System.out.println(amount1 +" is not greater than 10");
				 }
			 System.out.println("second wayyyyyyyyyyyyyyyy");
	//another way to do that
			 int Amount1=44, Amount2=80;
			
			 if (Amount1>10 && Amount2 <100) {
				 if (Amount1 >Amount2) {
					 System.out.println(Amount1);
				 }
				 else {
					 System.out.println(Amount2);
				 }
			 }
// if else statement excumple
			 /*1.triangle: has three angles, and sum of the angles Must be equal to 180
			  *  a)declare 3 variable angle1,agle2, angle3
			  *  b)write a program to check if the triangle is valid or not
			  * 
			  */
			 
			int angle1=150,angle2=20,angle3=10;//
			boolean valid=(angle1+angle2+angle3)==180;
			if(valid) {
				System.out.println("It is a valid triangle");//true
			}
			else {
				System.out.println("Invalid tringle, do some math");//if angle1=180,ang2=0,ang3=4 ga teng bulganda
				                                                    // there are bug bulardi,value correct quyish kk.
			}
			 System.out.println();
			 //Multi_Branch_ifElse
	//Without curly brace
			//if statement without curly braces: single if statement
			                                     //if (condition)
			                                     //only a sing line of statement,without the curly braces , the bloch 
			 
			 if(false) 
				 System.out.println("jjjjjjjjjjjj");//not
				 System.out.println("kkkkkkkkkkkkk");//printinnn
				 System.out.println("lllllllllllllll");//printinnn
			
			 
				if(false) 
					System.out.println("pppppppppppp");//not
				   System.out.println("wwwwwwwwwwwwwwww");//printinnn
				   System.out.println();
		//if else 
				   if(true) { 
					   System.out.println("heloooo");
				       System.out.println("iiiiiiiii");}
				   else 
					   System.out.println("oooooooo");
				//else statement must be declared right after the if statement
				   if(false)
					   System.out.println("qqqqqqq");//without curly brace only one line of statement excute
				                                      //if 2 sout bersa error occur
				      
				   else 
					   System.out.println("3333333333");
				 //multi-branch if statement :  if(cond)//single line of statement
				   //                           else if(cond)//single line of statement
                //                              else //single line of statement
				   System.out.println();
		if(true)
			System.out.println("aaaaaa");//aaaaaaa
		  //  System.out.println();compile error, because 2 statememt
		else if(true)
             System.out.println("bbbbbb");	
		     //System.out.println();
		else System.out.println("cccccc");
		
		System.out.println();
 
		
/*Nested if statement:
 * single if:
 *    if(condition){
 *    //A
 *      if(condition1){
 *      //B
 *      }
 *      }
 * A: as long as condition is true
 * 
 */
		
				     //if both true=====> true
	if(true) {
		System.out.println("Hello cyber  ");
		if (false) {
			System.out.println("Hello Word ");
		}
		else {
			System.out.println("Hllo Team ");
		}
		}
		else {
			System.out.println("Hello B12 ");
		}
	System.out.println();
	
	//another example
	int n1=700,n2=990,n3=110;
	
	if (n1>n2) {
		if(n1>n3) {
			System.out.println("n1 is greater");
		}
            else {System.out.println("n2 is big");
        }
		}
	        else 
	    {
     if(n2>n3)
     {System.out.println("n2 is large");
     
     }
     else {
    	 System.out.println("n3 is large");
    	 System.out.println();
     }
	
	    }
	
	//another nested if eg:
	
	
    int age=5;    
    int weight=60;      
    //applying condition on age and weight    
    if(age>=18){      
        if(weight>50){    
            System.out.println("You are eligible to donate blood");    
        } else{  
            System.out.println("You are not eligible to donate blood");  //2nd cond is false,these excute  
        }  
    } else{  
      System.out.println("Age must be greater than 18");//1st cond is false this excute
    }
	
	}
	
	
	
}
		 
		 
			 
	

	
	
	

