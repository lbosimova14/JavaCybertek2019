package Lesson14_InstanceVariable;

import java.util.Arrays;

/*
        Assignment:
        Create a custom class for Employees
        attributes: EmployeeName
                    EmployeeID
                    JobTitle
                    SSN
                    Gender
                    Salary
        actions:
                getInfo
     */
public class Employees {
        String [] employeeName;
        int [] employeeId;
        String [] jobTitle;
        String [] SSN;
        char [] Gender;
        double [] Salary;
       
        public void getInfo() {
       System.out.println("Employee Name:"+ Arrays.toString(employeeName)+"\nEmployee ID: "
                       +Arrays.toString(employeeId)+"\nSSN:"+Arrays.toString(SSN)+"\nGender:"
                       +Arrays.toString(Gender)+"\nSalary:"+Arrays.toString(Salary)
                       +"\nJob Title"+Arrays.toString(jobTitle));
        }
}
