package Lesson02_ArithmaticOperators;

public class PrimitivesCasting {
	/*casting converting larger primitive to smaller size datatype variablename=(datatype)value
	 * casting:Explicit and implicit
	 * explicit: is when we are converting from large type to smaller type.
	 * primitives:byte, short, int,long , float, double
	 * implicit casting: Automatic casting from smaller primitive into larger into larger primitive Type
	 * ex:byte a=10;
	 *     int b=a; automatically casts
	 *     (int) will also work
	 *     int b=(int)a;
	 * 
	 */

	public static void main(String[] args) {
		int a=10;
		byte b =(byte)a; //explicit=aniq,clear,ravshan casting
		System.out.println(b);
		double DecimalNumber=10.5; //double>float you cannot assign.convert first
		float FloatNumber=(int)DecimalNumber;
		System.out.println(FloatNumber);
		long LongNumber =300L;
		int IntNumber=(int)LongNumber; //300
		//int IntNumber=(short)LongNumber; //300
		//int IntNumber=(byte)LongNumber; //44 should not use byte, because smaller
		System.out.println(IntNumber);
		
		//implicit casting:convert automatically by default, assighning small data to large data
		byte ByteNum=100;
		int IntNum2=ByteNum;
		int IntNum3=(int)ByteNum;
		//the same with:
		System.out.println(IntNum2);
		short SHortNum=100;
		//explicit casting practices:
		double LargeNumber=101.8765;
		byte ByteValue=(byte) LargeNumber;
		System.out.println(ByteValue); //101 whole number prints out
		
		float FloatValue =(float)LargeNumber;//101.8765
		float FloatValue1 =(int)LargeNumber;//101.0
		float FloatValue2 =(byte)LargeNumber;//101.0
		float FloatValue3 =(short)LargeNumber;//101.0
		float FloatValue4=(long)LargeNumber;//101.0
		System.out.println(FloatValue);
		//another ex:
		float FloatNumber2=500.67F;
		int myNumber1=(int) FloatNumber2;//500 
		System.out.println(myNumber1);
		
		//local variables:within main method
		//must be defined/initialize befor use
		boolean result=true;
		System.out.println(result);
		char Char='A';
		System.out.println(Char);
		boolean result1=true, result2=false, result3;//result3 doest not print out , because didnt initialized,
		System.out.println(result1);
		
		
	
		
		

	}

}
