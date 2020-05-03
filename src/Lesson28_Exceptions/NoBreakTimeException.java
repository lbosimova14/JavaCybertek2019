package Lesson28_Exceptions;

public class NoBreakTimeException extends RuntimeException {
	
	//constractor
	public NoBreakTimeException() {
		super("Too much break have occured in java course");
		System.err.println("There is no break till we get job done");
	}

}
