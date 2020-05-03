package Lesson14_InstanceVariable;

public class EmployeeObject {

	public static void main(String[] args) {
	//create object
		Employees employees =new Employees();
		employees.employeeName= new String[] {"Boba","John","Max","Alexa","Muaz","Tarkan"};
		employees.employeeId=new int [] {2345,3456,7654,7896,4322,5555};
		employees.jobTitle= new String [] {"IT", "Accounter","Product Owner","Intsructor","Devoloper","Tester"};
		employees.Salary =new double [] {12.0, 20.0,45.5,30.5,18.0,10.0};
		employees.Gender = new char [] {'F','M','M','F','M','M'};
		employees.SSN=new String[] {"29-90","34-58","33-33","11-11","00-00"};
		
		
		System.out.println("Employee Name:");
		for(int i=0;i<employees.employeeName.length;i++) {
			System.out.print("\t"+employees.employeeName[i]+"\t");
		}
		System.out.println("\nEmployee ID:");
		for(int i=0;i<employees.employeeName.length;i++) {
			System.out.print("\t"+employees.employeeId[i]+"\t");
		}
		
		System.out.println("\nSalary:");
		for(int i=0;i<employees.Salary.length;i++) {
			System.out.print("\t$"+employees.Salary[i]+"\t");
		}
		System.out.println("\nGender:");
		for(int i=0;i<employees.Gender.length;i++) {
			System.out.print("\t"+employees.Gender[i]+"\t");
		}
		System.out.println("\nJob Title:");
		for(int i=0;i<employees.jobTitle.length;i++) {
			System.out.print("\t"+employees.jobTitle[i]+" ");
		}
		System.out.println("\n");
		//calling method
		employees.getInfo();
	}

}
