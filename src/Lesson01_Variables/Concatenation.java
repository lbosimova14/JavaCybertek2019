package Lesson01_Variables;

public class Concatenation {
/*String represents the sequences of characters, used for
 * 
 * 
 */
	public static void main(String[] args) {
int a =30;
int b =(byte)a; //30
//int b =(long) a; //compile error. long>int
    System.out.println(b);
    System.out.print("Result A"+0+1); //"Result A0"+1
                                        //"Result A01"
    System.out.print("; Result B"+(1)+(2));//;ResultB12     java ignore paranthesis
    System.out.println();
    float FloatNumber = 100.9833546f;
    //short ShortNumber= (int)FloatNumber; //error
    //short ShortNumber= (long)FloatNumber;//error
     short ShortNumber= (byte)FloatNumber; //only byte or short
    System.out.println(ShortNumber); //100
    System.out.println();
    double res =9/5;
    System.out.println(res);
    System.out.println();
    System.out.println( (3+2) * 2/3 % 2);
                         //5*2/3%2 // all same left to write
                          //10/3%2   //whole number gives whole number result 10/3=3, not 3.3333
                          //3%2
   // int n1=9,n2=0,n3=n1/n2;
    //System.out.println(n3);// error zero undividable, denominator cannot be zero
    System.out.println();
    //Ques9
    long l=3_000L;
    double d=(float)l; //narrowing
    int i=(short)d;//int, short,byte=yes,
    System.out.println(d%1000);//0
    System.out.println();
    //ques10
    double result=10/3; //compile return me whole number
                        //3===>3.0
    System.out.println(result);
    
    double result1=10.0/3;//one of the number is decimal number
    System.out.println(result1); //3.3333333335
    //ques 13
    int I1=10, I2=20, I3=30;
    I1=I1%5; //10%5=0   I1=0
    I2=I2%5; //20 %5=0 I2=0
    
    I3=I1*I2; //I3=0
    System.out.println(I1+"\t"+I2+"\t"+I3);
    System.out.println(10.0/3l);// as long as decimal, decimal compile
    System.out.println(10.5%3); //1.5
    
    


	}

}
