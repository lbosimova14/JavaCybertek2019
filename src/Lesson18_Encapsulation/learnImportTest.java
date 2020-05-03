package Lesson18_Encapsulation;
import static Lesson18_Encapsulation.learnImport.Name;
import static Lesson18_Encapsulation.learnImport.*;//astrik sign used for importing  class' all members

//import static Lesson18_Encapsulation.learnImport.Name;
             //  packagename           classname.staticName

public class learnImportTest {

	public static void main(String[] args) {
		
//public static String Name="Muhtar";
	
	System.out.println(Name);
	System.out.println(learnImport.Name);
	System.out.println(ID);
	System.out.println(SchoolName);
	
	//calling hello static method without using import
	hello();//Hello word
	System.out.println(age);//calling default access modifier variable from learnImport class.it is same package
	//System.out.println(number);calling protected,error,bc it is access by class or subclasses in the same packade
	
	
	
	
	}

}
