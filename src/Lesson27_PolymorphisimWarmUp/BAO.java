package Lesson27_PolymorphisimWarmUp;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * WarmUp:         
    1. create an abstract class called ScrumTeam
            Data: Name
                  JobTitile
                  Salary
            Actions: DailyStandUp();
                     Demo();
    2. Create the following sub classes of ScrumTeam:
                1. Testers:
                        Actions: FindBug
                2. Developers:
                        Actions: FixBug
    3. Create a class called BOF
            create Array of Testers named sdets, at leats store two objects
            create array of Developers named dev, at least store three objects
            create ArrayList of ScrumTeam:
                    store all the developer' and testers' objects
 */
public class BAO {
     
	public static void main(String[] args) {
//		Testers Laylo = new Testers("Laylo","Tester",55.0);
//		Testers Max= new Testers("Max","SDET",65.5);
//		Testers Erhan= new Testers("Erhan", "ManualTester", 45.0);
		
		//polymotphism
		ScrumTeam Laylo = new Testers("Laylo","Tester",55.0);
		ScrumTeam Max= new Testers("Max","SDET",65.5);
		ScrumTeam Erhan= new Testers("Erhan", "ManualTester", 45.0);
		
		Laylo.DailyStandUp();
		Laylo.getEmployeeInfo();
	
		//create of Array of testers
//	Testers [] testers = {Laylo,Max,Erhan};
//	for(Testers each: testers) {
//		each.getEmployeeInfo();
//	}
		
		ScrumTeam [] testers = {Laylo,Max,Erhan};
		for(ScrumTeam each: testers) {
			each.getEmployeeInfo();
		}
	
	Developers Nodira=new Developers("Nodira","Senior",22.5);
	Developers Mohir=new Developers("Mohir","Junior",88.0);
	Developers Parsa=new Developers("Parsa","Devaloper",44.0);
	
	//create of Array of devolopers
	Developers[] developers= {Nodira,Mohir,Parsa};
	for(Developers each:developers) {
		each.getEmployeeInfo();
	}
	
	
	 //create ArrayList of ScrumTeam:
        // store all the developer' and testers' objects
	
	ArrayList<ScrumTeam> scrum =new ArrayList<>();
	scrum.addAll(Arrays.asList(testers));
	scrum.addAll(Arrays.asList(developers));
	for(ScrumTeam each:scrum) {
		each.getEmployeeInfo();
	}
	}
	
	
}
//super class
abstract class ScrumTeam{
	public String Name, JobTitle;
    public double Salary;
    public abstract void DailyStandUp();
    public abstract void Demo();
     //getInfo method
    public void getEmployeeInfo() {
    	System.out.println("Employee Name "+ Name);
    	System.out.println("Job Title: "+ JobTitle);
    	System.out.println("Salary: $"+ Salary+ " per hour");
    	System.out.println("==========================================================");
    }

}


//sub class
class Testers extends ScrumTeam{

	public Testers(String Name,String JobTitle,double Salary) {
		this.Name=Name;
		this.JobTitle=JobTitle;
		this.Salary=Salary;
	}
	
	@Override
	public void DailyStandUp() {
		System.out.println("Tester "+ Name +" is talking");
		
	}

	@Override
	public void Demo() {
		System.out.println("Tester "+ Name +" is doing demo");
		
	}
	//regular method
	public void FindBug() {
		System.out.println();
	}
}

class Developers extends ScrumTeam{
	
	//Contractor
	public Developers (String Name, String JobTitle, double Salary) {
		this.JobTitle=JobTitle;
		this.Name=Name;
		this.Salary=Salary;
	}

	@Override
	public void DailyStandUp() {
		System.out.println("Developer "+ Name+ " is talking");
		
	}

	@Override
	public void Demo() {
		System.out.println("Developer "+ Name +" is doing demo");
		
	}
	
}
        

