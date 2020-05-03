package Lesson03_Scanner_Class;

public class WarmUp {

	public static void main(String[] args) {
	
		String day="Monday";
		switch(day) {
		case "Monday":	
		case "Tuesday":
			System.out.println("Java day");
			break;
		case "Wednesday":
		case "Saturday":
			System.out.println("SQL");
			break;
			
		case "Thursday":
		case "Friday":
			System.out.println("Selenium");
			break;
		default:
				System.out.println("Day off");
				
			 
		}
		
		
	}

}
