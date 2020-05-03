package Lesson12_MethodLayeredFasion;

public class MethodCalls {
//methods can call each other, and java executes top to bottom
	//method cannot call itself,uzini uzi chaqira olmaydi
	public static void main(String[] args) {
		method3();
        
		int max2=max(10,20);
        System.out.println(max2);////20
        
       int max3= max(100,200,50);
       System.out.println(max3);//200
       
       maximum(400,5000,99999);//99999
       
       String str=print(10,20,30);
       System.out.println(str);//30
	}//main method ending
public static void method1() {
	//method2(); error method cannot call itself
	System.out.println("A");
}
public static void method2() {
	method1();//A
	System.out.println("B");//B
}
public static void method3() {
	method2();//A B
	System.out.println("C");//C
	
}

//now call return method call another method
//find maximum value in this method
public static int max(int a,int b) {                             //2 parameter method
	return (a>b)? a : b;
}
public static int max(int a,int b, int c) {                       //3 parameter method
	//int largestNum= max(a,b);
	//return (largestNum>c)? largestNum: c;
	//qisqartirib yozish mumkin by calling method ichida method
	return (max(a,b)>c) ? max(a,b): c;
	
}

public static int max(int a,int b, int c,int d) {                     //4 parameter method               
	int result =max(a,b,c);
	if(result>d) {
		return result;
	}//else ni yozmasa ham buladi,
	return d;
	//return(result>d)? result :d;
	/*another way: birinchi 2 tasini  keyin 2 tasiga compare qilsa ham buladi, so we have compered 2 value bor max method
	 * return max( max(a,b), max(c,d) ); 
	 * 
	 */
}



public static void maximum(int a, int b, int c) {
	System.out.println(max(a,b,c));//calling max method yuqoridagi alredy max value topilgan,it is not returning only printing,
	//only give another value, then find out which one is max value
}
//find max number with 5 value:
public static int maximum(int a, int b, int c,int d,int e) {
	return max(  max(a,b,c,d), e);
	        
}


//call void method in this String method
public static String print(int a, int b, int c) {
	maximum(a,b,c);
	return "900";
}
}//class ending
