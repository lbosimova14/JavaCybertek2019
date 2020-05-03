package Lesson28_Exceptions;

public class LunchTimeException  extends Exception {
	
	public LunchTimeException() {
		super("It is time lunch, stop the class,Time run away");
		System.err.println("Time to Stop class,Lets go home");
	}

}
