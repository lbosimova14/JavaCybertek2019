package Lesson07_MethodVoid;
/*  write a method that accepts 3 parameters: 2 numbers and one operator, 
        and prints out the calculation 
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, "*") ==> 20;*/
public class OperetorsCalculate {

	public static void main(String[] args) {
		calculate(20,5,"+");

	}

	public static void calculate(int a,int b, String Ope) {
		String result="";
		if(Ope.equals("-")) {
		result+=(a-b);
		}else if(Ope.equals("+")) {
			result+=(a+b);
		}else if(Ope.equals("*")) {
			result+=(a*b);
		}else if(Ope.equals("/")) {
			result+=(a/b);
		}else if(Ope.equals("%")) {
			result+=(a%b);
			}else
				System.out.println("Invalid");
		System.out.println(result);//25
	// ternary way
		String Result2="";
        Result2 +=  (Ope.equals("-")) ? (a-b) :(Ope.equals("+")) ? (a+b)
                    :(Ope.equals("*"))? (a*b) : (Ope.equals("/"))? (a/b)
                     : ( Ope.equals("%"))? (a%b) : "Invalid Operator" ;
       
       System.out.println(Result2);
	
	}

}//class ending
