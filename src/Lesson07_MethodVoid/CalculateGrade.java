package Lesson07_MethodVoid;
/* write a method that can calculate grade
            if score is 100 ~ 90 ==> A
            if score is 89 ~ 80 ==> B
            if score is 79 ~ 70 ==> C
            if score is 69 ~ 60 ==> D
            if score is 0 ~ 59 ==> F
            otherwise ==> Invalid Score
     */
public class CalculateGrade {

	public static void main(String[] args) {
		
		CalculateGrade(85);
	}

	public static void CalculateGrade(int score) {
		char Grade=(score>=90 && score<=100) ? 'A'
				  : (score<=89 && score<=80) ? 'B'
				:(score>=70 && score<=69) ? 'C'
				:(score>=60 && score <=68) ?'D'
				:(score >=0 && score<=59) ?'F'
				: 'I';
		if(Grade=='I') {
			System.out.println("Invalid");
		}else {
				System.out.println(Grade);
			}
		
	}
	
}//class ending
