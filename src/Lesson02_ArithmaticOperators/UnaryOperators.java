package Lesson02_ArithmaticOperators;

public class UnaryOperators {
	/*+:positive
	 * -:negative
	 * ++:increment is  increase  the value by 1.
	 * post increment: 
	 * pre increment:
	 * --decrement  is decrease the value by 1.
	 */

	public static void main(String[] args) {
		//pre increment:operator is placed before the variable; ++value,increase value immediately
		int numb1=100;
		++numb1;
		
    System.out.println(numb1); //101   100+1=101
    System.out.println(++numb1);// 102 incremeted twice

//post increment:operator is placed after the varibale,it will pass the current value
    //increamt first current value than increament
    int x =100;
    int y=x-1;
    System.out.println(y); //99
    System.out.println("----------------");
    
    //Decrement: decrease value by 1
     //pre-decrement : operator is places befor 
    int z=100;
    --z;
    System.out.println(z);//99
    
    int a=50;
    a= --a +  a++  + a-- + a++;
      //pre   post  post   post
     // 49   + 49 +   50  + 49   =(49*3)+50=197
    
    System.out.println(a);//197
    
    
    short Snum=4;
    int R=Snum*4 - Snum--; //use current value and decremet, now value is 3
    System.out.println(R);//12
    System.out.println(Snum);//3
    
    
    
    int W=1;
    W= -W-- +   W++ / - W-- *  --W;
    //  post    post   post    pre
    // -  -1  +  0+1=1 /  1-1=0 *  -1
    //-1 +0*-1
    //-1 + 0
    //-1
    System.out.println(W);  //-1
    System.out.println("-------------------------------");
    int n=77;
    n= --n + n++ - ++n - n--;
    
    System.out.println("n is " + n);
    int v=10;
    int q=++v + ++v + ++v;
    System.out.printf("%d",q);
    System.out.println("------------------");
    
    int f=5;
    int c=f++ + ++f +f++;
    System.out.println(f);
    System.out.println();
    
    int s=2;
    int Inc=++s + ++s  + s++ + ++s + s++;
    System.out.println(s);
    System.out.println("-----------------------");
   
    
    //SHORTHAND OPERATORS
   /*+= addition --------x+=y  7+=8>>>>>>
    * 
    * 
    *     
    */
    int b=9, o=12;
    b+=3;
    int e= o+=b;
    System.out.println(e);
    //d=85,
    
	}

}
