package Lesson11_WrapperClasses;

public class BooleanWrapperClass {

	public static void main(String[] args) {
		
		Boolean b =new Boolean("true");//true string trueni convert qilayayganda true buladi
		Boolean b1=new Boolean(true); //true
		System.out.println(b.equals(b1));//true
		
		Boolean b2 =new Boolean("True");//true casesensitive
		Boolean b3=new Boolean("tRue");// true case sensitive
		System.out.println(b2.equals(b3)); //true
		
		Boolean b4 =new Boolean("hey");//false
		Boolean b5=new Boolean("bye");//false
		System.out.println(b4.equals(b5));//false false is true
		
		Boolean b6 =new Boolean("hello");//false
		Boolean b7=new Boolean(false);//false
		System.out.println(b6.equals(b7)); //true
		
		String s="True";
		Boolean bl=Boolean.parseBoolean(s);
		String st="tRUE";
		Boolean blo=Boolean.parseBoolean(st);
		System.out.println(bl.equals(blo));//true //ignores case sensetive
		
		
        
// parseBoolean("StrValue"): takes string value and converts to boolean primitive
     
        boolean A = Boolean.parseBoolean("CybertekBatch12");
                        // any string values other than true will return false
        
        System.out.println(A);  
        
        boolean B = Boolean.parseBoolean("TrUe");  // method ignores the case sensitivity
        System.out.println(B);
        
        
        boolean C = Boolean.parseBoolean("10 > 9");  // "10 > 9 "  != "true"
        System.out.println(C);
        
        
        Boolean D = Boolean.parseBoolean("TrUe"); // Auto-boxing
        System.out.println(D);
		
		

	}

}
