package Lesson02_ArithmaticOperators;

public class ArithmaticOperators {
	/*+:addition, adds two numbers
	 * _:subsraction,*:multiplication,/division,%modulus
	 */

	public static void main(String[] args) {
		int a=100;
		int b=a-400; //-300
		System.out.println(b);
		int c=a+b; //100+ -300=-200
		System.out.println(c);
		int length=100,width=5,area=length/width;
		System.out.println(area); //20
	
		//double resultNum=9/0;//denominator cannot be zero
		//System.out.println(resultNum);
		
        double Number1=10/3F;//3.333335386736
        double Number2=10/3;//3.0
        int Number3=10/3;// 3
        double Number4=10.0/3;//3.3333333333335
        System.out.println(Number1 + "\t"+ Number2 + "\t"+Number3+ "\t"+Number4);
        
        //tasks
        System.out.println(5+2*4);//13
        System.out.println(10/2-3);//2
        System.out.println(8+12*2);//32
        System.out.println();
        //% remainders
        //10/3====> 3 with remainder of 1
        //12/5====>2 with remainder (12-(5*2))=2
        int result1=10%3; //1 odd
        int Number10=20%2;// 0 even  number
        int Number65 =65%2;//1 odd, how to find:(65-32 *2)=1
        
        System.out.println("modulus " + (4+17%2-1));//4 + 4-1=4
        
        //highest: (),% /* 
       // in order to find persentage 25/100. % sign reserved by java
       
        System.out.println(result1);
        System.out.println(Number10);
        System.out.println(Number65);
        
        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";
        
        System.out.println(yes == no || grade>amount);
        //System.out.println(amount == 40.0 || 50.0) ;//error
        System.out.println(hiVal !=loVal || loVal<0); //both side true, output true
       //System.out.println(True || hello.length() > 0);//error True is not declared
        System.out.println(hello.isEmpty()&& yes);//false
        System.out.println(grade<=100 && !false);//true. both side true
        System.out.println(!yes || no);//false
        //System.out.println(grade > 75 > amount);///error
        System.out.println(amount <= hiVal && amount >=loVal);//true
        System.out.println(no && !no || yes && !yes);//false
        

int x = 25;
if (x / 2 == 12){
  System.out.print("BUFFY");
  System.out.print("LOVES");
}else{
  System.out.print("ZACK");
  System.out.print("ISA");
}
System.out.print("DIPPY");
System.out.println();


int AppleCount =20;
int OrangeCount = 30;
int PearsCount =30;
boolean comp = AppleCount < OrangeCount || OrangeCount >= PearsCount;
       //         true                         true                   = true
System.out.println(comp);

String OutsideWeather;
int Degree;
OutsideWeather ="Shine";
Degree=70;
boolean comp2 = (!(OutsideWeather=="Rainy"|| Degree ==70));
                   //false                    true
System.out.println(comp2);
System.out.println(".............................");

int b0=2;
boolean res = ++b0 == 2 || --b0 == 2 && --b0 == 2;
System.out.println(res);
System.out.println(",,,,,,,,,,,,,,,,,,,");

boolean x1=true, z1= true;
int y1 =20;
x1 =(y1!=10)||(z1=false);
System.out.println(x1);//true
//boolean  a=!false != ("Batch12 " != "Beats   ");
//      true   !=not equal //true
  
System.out.println(a);// false
int x6 = 100;
double y = x +=100/20;
//x=x+(100/20)=105
		System.out.println(x6);
boolean A=128>'9'|| 128 ==127;
     //true          false
//har z='9';
System.out.println(A);//true
boolean StupidOp = 10>=20 && 'a' > 'b';
                 //false       false
System.out.println(StupidOp);//false

int Z=100;
boolean H =Z>100;
System.out.println("Z 100 is:" + H);
//boolean H =Z>100; //compile error

System.out.println(!(false !=true));//false
                        //true
                     //!true >>>>>> false
    
  }

        
	}   


