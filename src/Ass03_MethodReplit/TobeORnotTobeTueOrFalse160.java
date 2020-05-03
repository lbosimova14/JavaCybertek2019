package Ass03_MethodReplit;

public class TobeORnotTobeTueOrFalse160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          boolean b=hamletQuote(false,false);
            System.out.println(b);
	}
	  public static boolean hamletQuote(boolean toBe,boolean notToBe) {
		  if(toBe ==notToBe || toBe !=notToBe || (!toBe !=notToBe) ){
			  return true;
		  }else {
			  return false;
		  }
	  }
}
/*The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.
the hamletQuote method only returns true if one of  or both of the boolean parameters is true.
example:
hamletQuote(true, false)
returns true
hamletQuote(false,true)
returns true
hamletQuote(true,true)
returns true
hamletQuote(false,false)
returns false
hint: use the truth table for this one, this can be done with one if and a logical operator.*/