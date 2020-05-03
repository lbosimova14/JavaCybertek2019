package Ass01_CybertekAssighments;

public class Task03_biggerNumber {

	public static void main(String[] args) {
		
/*	
int n1=100,n2=500,n3=700;
int max=0;
		
		if(n1>n2 && n1>n3) {
			max=n1;
			//System.out.println("In "+n1+" "+n2+" "+n3+" numbers: "
		                       // +n1+" number is bigger. ");
		}
		
		if(n2>n1 && n2>n3) {
			max=n2;            //max way is flaxsable and reusable, eg: max + 12*35 to do some math
			//System.out.println( "In "+n1+" "+n2+" "+n3+" numbers: "//only limated to print out statement
		                        // + n2+" number is bigger ");
		}
		if(n3>n1 && n3>n2) {
			max=n3;
			//System.out.println( "In "+n1+" "+n2+" "+n3+" numbers: "
		                         // + n3+" number is bigger ");
		}
		//write conclusion

		System.out.println( "In "+n1+" "+n2+" "+n3+" numbers: "
	                          + n3+" number is bigger ");*/
	int n1,n2,n3;	
		
           n1=4;n2=4;n3=8;
		
		if(n1>n2 && n1>n3) {
			System.out.println("1 In "+n1+" "+n2+" "+n3+" numbers: "
		                        +n1+" number is bigger. ");
		}
		
		else if(n2>n1 && n2>n3) {
			System.out.println( "2 In "+n1+" "+n2+ " "+n3+" numbers: "
		                         + n2+" number is bigger ");}
		 else if (n3==n2 && n3>n1){
		 System.out.println("3 "+n3+ " and "+n2 +"are bigger number");                        
		}
		 else if (n3==n1 && n3>n2) {
			 System.out.println("4 "+n3 + "and"+n1 + " are bigger number");
		 }
		 else if (n2==n1 && n2>n3) {
			 System.out.println( "5 "+n2+ " and "+ n1 +"are bigger number");
		 }
		else if(n3>n1 && n3>n2) {
			System.out.println( "6 In "+n1+" "+n2+" "+n3+" numbers: "
		                          + n3+" number is bigger ");}
			else {
				System.out.println("7 All of them equal");
			}
		}
	
	}
	
	
	
	



