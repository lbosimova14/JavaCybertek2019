package Lesson05_Loops;

public class Kahoot6Review {

	public static void main(String[] args) {
// Q 2.	
	int i=5;
	do {
		//--i;    //4 3 2 1 0
		i--; //4 3 2 1 0
		System.out.println(i+" "); 
		//i--;    //5 4 3 2 1
		//i++;  // 4 infinite time loop
	}while(i>0);
//Q 3.
	int x;
	int y=5;
	for(x=0;x<y; x++) {  //if condition true excute body of loop then iterator
		              //x=3
		System.out.print((x+=2) +" "); //2 5
		                //2+3=5
	}
//Q 3.
	int []arr= {1,2,3,4,5};
	for(int I=1; I<arr.length; I++) {
		System.out.println(I);
	}
//Q 4 
	for (int a=0; a<=5; a++) {
		System.out.println("a is "+a);
		break;
	}
//Q 5.
		String str = "Java";
		String str2 = new String(str); // Java
		System.out.println(str== str2); // false, defferent memory
		System.out.println(str.equals(str2)); //true 
         int count  = 10;
         //eg with do while loop
         do {
            count += 2;
        }while( str == str2); // Condition is false, because of different loc 2 Java false and do part excutes
                              // math qilinadi only, loop aylanmaydi
         System.out.println(count);  //12
        
         //eg with while loop
         int count2  = 10;
        while( str == str2) {  //condition is false, count2 ni uzi pass qilinadi which is 10, math qilinmaydi
            count2 += 2;
        }
        System.out.println(count2);  // 10
        
	//Q 6
 int X =10;  // 10 + 0 = 10+1 =11+2+3+4+5 =25
        
        for(int j=0 ; j <= 5; j++) {  // j: 0 1 2 3 4 5
            X += j;
        }
	System.out.println(X);  // javobi 25
	}

}
