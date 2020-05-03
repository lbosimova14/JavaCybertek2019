package Lesson14_InstanceVariable;

public class Employee {
    String Name;
    String ID;
    int age;
    String SSN;
    String JobTitile;
    double salary;
    
    //create constructor, takes 6 argument
    public Employee(String Name,String ID,int age,String SSN,String JobTitile,double salary) {
    
    this.Name=Name;
    this.ID=ID;
    this.age=age;
    this.SSN=SSN;
    this.JobTitile=JobTitile;
    this.salary=salary;
    }
    
    
    public void getInfo() {
    System.out.println("Employee name is: "+Name);
    System.out.println("SSN: "+SSN);
    System.out.println("Age is: "+ age);
    System.out.println("Job title is: "+ JobTitile);
    System.out.println("ID: "+ID);
    System.out.println("Salary $"+salary);
    System.out.println("-------------------------------------------");
    }
}
//ass:ad some functionaliti, salary chage job title gonna be change, promotion
