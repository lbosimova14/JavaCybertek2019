package Ass04_OOP;

public class lameCalc193 {
	
	public int plus(int n1, int n2) {
		return n1+n2;
	}
    public int minus(int n1,int n2) {
    	return n1-n2;
    }
    public int multiply(int n1,int n2) {
    	return n1*n2;
    }
    public int divide(int n1,int n2) {
    	return n1/n2;
    }
}
/*The LameCalculator class has instance methods that can do simple math operations on two numbers.
the methods are: plus, minus, multiply and divide .
all the methods get two ints then the method does the required math operation and returns the result as an int.
for example:
LameCalculator lc = new LameCalculator();
lc.plus(1,1)
returns:2
lc.minus(1,1)
returns:0
lc.multiply(2,1)
returns:2
lc.divide(10,2)
returns:5*/