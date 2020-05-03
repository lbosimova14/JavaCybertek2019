package Lesson04_DecisionStructure_StringMethods;

public class SwitchStatment {

	public static void main(String[] args) {
	int num=2;
	switch(num) {
	case 7:
	case 5:	
		System.out.println(" 7 and 5");
		break;
	}
    String month;
	String days="Tuesday";
	String year;
	String kun;
	switch (days) {
	case "Monday":
		System.out.println("Monday is fau day");
		//break;
	case "Tuesday":
		month="June";
		
		System.out.println("Tuesday");
		break;
	case "Wendesday":
		System.out.println("Wndaday break day");
		break;
	case "Friday":
		System.out.println(" Friday work day");
		break;
	default:
	System.out.println("error");
	
	}
	int State=4;
	double City=State;
	switch(State) {
	case 1 :
		System.out.println("Pitsburgh");
	case  2 :
		System.out.println("New York");
		break;
	case 3:
		System.out.println("USA America");
		break;
	case 4:
		System.out.println("Florida rating is"+ City);
		break;
		default:
			System.out.println("Error");
	}
	
	//kahoot task compile error
	int Batch=12;
	switch(Batch) {
//	case 014:// it can not start from zero, multple digit not shoul be, math purpose doesnot compile
		//System.out.println("Cybertek");
	//break;
	case 12:
		System.out.println("Batch");
	default:
		System.out.println("Best");
	
	}
	
	
	}

}
