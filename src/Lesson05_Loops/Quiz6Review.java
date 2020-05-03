package Lesson05_Loops;

public class Quiz6Review {

	public static void main(String[] args) {
		//Q4
		int a=0;
		while(a<=6) {
			a+=2;
		}
   System.out.println(a);//8
   //Q6
   int i;
   int j=7;
   for(i=0;i<j-1;i+=2) {
	   System.out.print(i+" "); //0 2 4
   }
   System.out.println();
 //Q7
   String str ="abc";
   String str1 ="abc";
   System.out.println("S1 == S2"+ str==str1);// not comparing, concating with text string
                                         // thats why false
// "S1 == S2: ABC"     ==     "ABC"                    ==?     false
   //this is one string       this is one string      and comparing,and doest look like each other and false
   
   //Q8
   
   //Q10
   
   
	}

}
