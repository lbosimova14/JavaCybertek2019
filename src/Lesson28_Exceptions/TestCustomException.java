package Lesson28_Exceptions;

public class TestCustomException {
	public static void main(String[] args) throws LunchTimeException {
		//throw new NoBreakTimeException();
		//throw new RuntimeException("sssss");
		//if(StudentAsked)
		
		throw new LunchTimeException();
	}

}
