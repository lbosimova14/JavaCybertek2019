package Lesson03_Scanner_Class;

public class Ternary {
	//if (condition)===> (condition)? 
	//else=====> : 
	//else if(condition)=====> : (condition)?
// In ternary's body we can only give a single value
	//Ternary MUST be initialize must return value
	public static void main(String[] args) {
		/*int num=0;
		if(true) {
			num=100;
			
		}else {
			num=50;
		}
System.out.println(num);*/

int num=0;
num=(true) ? 100: 50;
System.out.println(num);

String name="";
boolean Batch12=true;

    System.out.println(Batch12 ? "Cybertek" : "Invalid");
     String BestSchool=Batch12 ? "Cybertek" : "Invalid";
     System.out.println(BestSchool);
     
     
     double interestRate=0;
     boolean GoodCredit=true;
     interestRate=(GoodCredit==true) ? 0.5 : 0.9;
     System.out.println(interestRate);
     //else if statetment
 char FinalGrade='D';
 /*
 if(FinalGrade == 'A') {
     Group="Early bird";           
 }else if(FinalGrade =='B') {
     Group ="Group 1"; 
 } else if(FinalGrade == 'C') {
     Group = "Group 2";
 } else {
   Group ="After Group 2";
 }
*/    
 
    String Group=( FinalGrade=='A')? "Early Bird"
    		:(FinalGrade=='B')?"Group 1" 
    		   :(FinalGrade=='C')?"Group 2"
    		      : "AfterGroup 2";
       
                    System.out.println(Group);

//another example,else if condition converting to conditional operator

  int score=90;
  char Finals=' ';
  
  if(score >= 90 && score <=100) Finals ='A';
else if(score >= 80 && score <= 89)  Finals = 'B';
else if(score >=70 && score <= 79) Finals = 'C';
else if(score>= 60 && score <= 69) Finals ='D';
else if(score>=0 && score <= 59)Finals = 'F';
else Finals = ' ';
  // convert into ternary
  
		                Finals=(score>=90 && score<=100)?'A'
    		            :(score>=80 && score<=89)? 'B'
    		            :(score>=70 && score<=79)? 'C'
    		            :(score>=60 && score<=69)? 'D'
    		            :(score>=0 && score<=59)? 'F'
    		            : ' ';

System.out.println("Your grade is "+Finals);


int n1 =10000, n2= 3000, n3 = 400;      
int max = (n1 > n2 && n1 > n3) ? n1
: (n2 > n1 && n2 > n3 )? n2
: n3;

System.out.println(max);

//kahoot task8
int x=5,y=19;
long numbe=y-x>x-y ? y-x : x-y;
//        14>-14  ? 14  : -14
//        true         true           ( first true statement will get excutes)
System.out.println(numbe);  //output 14
//kahoot task9
int sum=2,price=100;
	//tugallamagan
//q6:
float f1=(12_245.1>123_45.0) ? 12_456 : 124_56.02f;
//        12345.1>123456.0 ? 12456 : 12456
 //        true
//in accounting: 1,000,000,000
// in java has underscore, allows us read comma,java: 1_000_000_000


//Q9
int i=10;
int j=20;
int k=j+=i/5;
//  k=j+=2===> j=j+2=22
// k=22
System.out.println(i+" "+j+" "+k);//10 22 22
	
	}

}
