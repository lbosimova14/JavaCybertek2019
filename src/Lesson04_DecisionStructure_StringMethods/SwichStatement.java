package Lesson04_DecisionStructure_StringMethods;

public class SwichStatement {
	/*switch statement similar thing like else if /multi-branch statement
	 * switch(expression){
	 * case CaseValue:
	 *           statement1
	 *           statement2
	 *           break;
	 * 
	 * expression should not be boolean, should be data type
	 */

	public static void main(String[] args) {
		int score=5;
		switch(score) {
		case 1://value must match data type if int give number, if double give 2.3
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		// switch statement dont have else, instead default has
		default:
				System.out.println("Invalid");
		    break;
		//break is exiting the switch statement, like exiting class
		//if you remove break, 
		//without break code continue run until exit the switch statement
		    // after break statement you cannot give another printline, case is close
		}

	}

}
