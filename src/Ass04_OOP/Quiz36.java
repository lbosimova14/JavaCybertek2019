package Ass04_OOP;

import java.util.Arrays;

public class Quiz36 {
	public static void main(String[] args) {
		System.out.println("lalala"+(2+2));
		String str=" ";
		str.trim();
		System.out.println(str.equals("")+" "+str.isEmpty());
		
		int arr[][] ={{1,2},{3,4}};
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+" ");
			}
		}
		//Q12
		System.out.println("Q12");
		int wd=0;
		String[]days= {"sun","mon","wed","sat"};
		for(int i=0;i<days.length;i++) {
			switch(days[i]) {
			case"sat":
			case "sun":
				     wd-=1;//wd=0-1
				     break;
			case "mon":
				wd++;
			case "wed":
				wd+=2;//wd=1+2
			}
		}
		System.out.println(wd);
		
		//Q13
		System.out.println("Q13");
		String [][]arr1= {{"A","B","C",},{"D","C"}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//if(arr[i][j].equals("B")) {     //Compile error
				//	break;
				//}
				System.out.println(arr[i][j]);
			}
		}
		//Q14
		System.out.println("Q14");
		int []num1=new int[3];
		int[]num2= {1,2,3,4,5};
		num1=num2;
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);//1,2,3,4,5
		}
		
		//Q15
		System.out.println("Q15");
		int []arr2= {1,2,3,4,5};
		for(int e=0;e<5;e+=2) {
			System.out.println(arr2[e]);
		}
		//Q17
		System.out.println("Q17");
		int x=100;
		int a=x++;
		int b=++x;
		int c=x++;
		System.out.println(x+" "+a+" "+b+" "+c);
	//	int d=(a<b)?(a<c) ? a:(b<c) ? b : c;
		//System.out.println(d);
	
	//Q19
		System.out.println("Q19");
		int num=10;
		//add10(num);
		//System.out.println(add10(num));
		System.out.println(num);
		
		//20
		System.out.println("Q20");
		String ta="A";
		ta=ta.concat("B");
		String tb="C";
		ta=ta+tb;
		ta.replace("C", "D");//   ABCC bc not assining to new ta     String newString = originalString.replace('o', 'O');
		//ta=ta.replace("C", "D");//ta=ta... would be   ABDC
		ta=ta+tb;
		System.out.println(ta);
	
	//Q21
		System.out.println("Q21");
		String str1="Java";
		String []str2= {"J","a","v","a"};
		String str3="";
		for(int i=0;i<str2.length;i++) {
			str3+=str2[i];
		}
		boolean b1=str1==str3;//false different location
		boolean b2=str1.equals(str3);//true same visiable
		System.out.println(str3.length());//4
		System.out.println(str1.length());//4
		System.out.println(b1+", "+b2);
		
		//Q21
		System.out.println("Q21");
//		int numbers[] ={3,5,7};
//		numbers[2]=10;//reinnisilasing 0 index is itself 3, 1 index is 20 not 5, 2 index is 10 not 7
//		numbers[1]=20;
//		System.out.println(Arrays.toString(numbers));
	int numbers[];
	numbers=new int[2];
       numbers[0]=10;
       numbers[1]=20;
		numbers =new int [4];
		numbers[2]=30;
		numbers[3]=40;
		System.out.println(Arrays.toString(numbers));
		
	//Q24
		String Str="Hello Word";
		Str.trim();
		int z=Str.indexOf(" ");
		System.out.println(Str);
		System.out.println(z);
		
		//Q28
		System.out.println("Q28");
		String shirt [] []=new String [2][2];
		shirt [0][0]="red";
		shirt [0][1]="blue";
		shirt [1] [0]="small";
		shirt[1][1]="medium";
		for(int i=1;i<2;i++) {
			for(int j=1;j<2;j++) {
				System.out.println(shirt[i][j]);
			}
			}
		
	////Q29
		System.out.println("Q29");
				 String s="Batch 11 ";
				 System.out.println(s.length());
				 int zi=s.trim().length();
				 System.out.println(zi);
				 
		//Q30
				 System.out.println("Q30");
				 int [] intArr= {15,30,45,60,75};
				 intArr[2]=intArr[4];
				 intArr[4]=90;
				 System.out.println(Arrays.toString(intArr));
		//Q31
				 System.out.println("Q31");
				 boolean zet=true;
				// switch(zet) {
				 
				// }
				 
		//Q33
				 System.out.println("Q33");
				 	String Str1 ="Java";
				 	String Str2[]= {"J","a","v","a"};
				 	String Str3="";
				 	for(int i=0;i<Str1.length();i++) {
				 		Str3=Str3+Str2[i];
				 		
				 	}
				 System.out.println(Str3.length());
				 System.out.println(Str1==Str3);
				System.out.println(Str1.equals(Str3));
				
	//Q34
				System.out.println("Q34");
				int [] ar= {10,20,30};
				int size=ar.length;
				int idx=0;
				
//				while(idx<=size) {
//					++idx;
//				}
//				
				do {
					idx++;
				}while(idx<size-1);
//				while(idx<size) {
//					idx++;
//					
//				}
				
				System.out.println(ar[idx]);
				//Q36
				System.out.println("Q36");
				
				//String X="1";
				byte X=1;
				switch(X) {
				case 1 : System.out.println("One");
				break;
				case 2: System.out.println("TWo");
				break;
				}
				
				
				
				
				
				
				
				
				
				
				
				
	}		
				
				
}
