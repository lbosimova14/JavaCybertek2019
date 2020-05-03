package Ass03_MethodReplit;
import java.util.ArrayList;
import java.util.Arrays;
public class RepeatAll {
//eclipse working fine but not replit
	//not accepting some how,but working fine
	public static void main(String[] args) {
	    ArrayList<Boolean> list=new ArrayList<Boolean>(Arrays.asList(true,false,false));
	    repeatAl(list);
	}
  
	 public static  void repeatAl(ArrayList<Boolean> Abool) {
		 
	        Abool.addAll(3, Abool);    
	        System.out.println(Abool);
	 }
}
/*Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its ArrayList values.  
For example, if the parameter is 
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)*/