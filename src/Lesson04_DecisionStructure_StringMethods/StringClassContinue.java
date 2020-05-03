package Lesson04_DecisionStructure_StringMethods;

public class StringClassContinue {

	public static void main(String[] args) {
		/*
		 indexOf(str): returns the index number of the first 
		  occurred character in the given String as an int value
		 
		 */
		String A1 ="Batch 12 is a great bacth";
		//						  
			  int num = A1.indexOf("g"); //index is 14
			  System.out.println(num);
			  
			  int num2 = A1.indexOf("eat"+2); // eat2
	// negative number means the str is not exist in the STring
			  
			  System.out.println(num2);//-1
		
		
String B1= "today is tuesday, today we have class in the afternoon";
		
		int n1 = B1.indexOf("ter");
		System.out.println(n1);//47
		

	String Address ="7925 Jones Branch Dr, Mclean, VA 22003";
	int begin = Address.indexOf(",")+ 2;
	int end = Address.indexOf(", V");
	
	String cityName =  Address.substring(begin, end  );//Mclean
	System.out.println(cityName);
	
	String email = "Random.Emails@gmail.com";
	int begin2 = email.indexOf("@")+1;
	int end2 = email.indexOf(".com");
			
	String emailType =  email.substring(begin2 , end2 );
	System.out.println(emailType);//gmail

	
	/*
	 lastIndexOf(): returns the last occured character' 
	 	index number as and Int Value
	 
	 */
	
		String str ="ABCDABCD";
		
		int n2 = str.indexOf("B");//1
		int n3 = str.lastIndexOf("B"); //5
		System.out.println(n2);
		System.out.println(n3);
		
		String myEmail ="Myemail.school@coldmail.edu";
		int Begin = myEmail.indexOf("@");
		int End = myEmail.lastIndexOf(".");
		
		String EmailType= myEmail.substring(Begin , End);
		System.out.println( EmailType ); //@coldmail

	}

}
