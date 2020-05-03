package Lesson09_OverloadingMethod;

public class OverloadingMethodSum {
//it is a feature that allows us to have more than one method with same name,the method Must have different parameters
//it is reusable,readable
	//return-type of the method doesnt need to be same
	public static void main(String[] args) {
		
		int result=Sum(6,3,3);       
		System.out.println(result);//12   3 parameteri bor  methodni chaqirayapti
		System.out.println(Sum(2.0, 7.0));//9.0 boshqa date type quyib same name method+same parameter qilib chaqirayapti

	}

	public static int Sum(int a, int b) { //1.method with 2 parameter
		return a+b;
	}
	public static int Sum(int a, int b,int c) {//2.method with 3 parameter
		return a+b+c;
	}
	public static double Sum(double a,double b) {//3.method with different datatype
		return a+b;
		
	}
}
