package Lesson18_Encapsulation;

public class AmericanAirlineTest {//company name/ object classs
  public static void main(String[] args) {
	 EmployeeInfo employee1= new EmployeeInfo();
	 //employee1.Name="Emroh";
	 //after create setter, now I am able to change name
	 employee1.setName("Emrah");
	// System.out.println(employee1.Name);
	 //if you want read name you cannot read like that (employee1.Name),first create getter,read,then print out
	 System.out.println("Name is: "+employee1.getName());//Emrah
	 
	 //set up SSN first
	 employee1.setSSN(364646); 
	 System.out.println("Social number is: "+employee1.getSSN());
	 
	 //call set method and give value
	 employee1.setAge((byte)25);
	 System.out.println("Age is: "+employee1.getAge());
	 
	 //2nd object
	  System.out.println("second objectttttttttttttttttttt");
	  EmployeeInfo employee2= new EmployeeInfo();
	  employee2.setName("Latlo");
	  employee2.setAge((byte)20);
	  employee2.setSalary(20.44);
	  employee2.setSSN(220303);
	  System.out.println(employee2.getName());
	  System.out.println(employee2.getSalary());
	  System.out.println(employee2.getSSN());
	  System.out.println(employee2.getAge());
	  
	  //3 object
	  System.out.println("employe33333333333333");
	  EmployeeInfo employee3= new EmployeeInfo();
	  
	  employee3.setInfo("Rohan", 222222, (byte)35, 350000);
	  System.out.println(employee3.getName());
	  System.out.println(employee3.getSSN());
	  System.out.println(employee3.getSalary());
}
}
