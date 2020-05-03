package Lesson18_Encapsulation;
/*encapsulation: 1.hiding instance variable,hiding data by private access modifier
 *               2. grants the data by giving privte access to the private instance variable through public getter/setter
 *               
 * private: data only visiable or accessable within the class
 * 
 */
public class EmployeeInfo {
/*
 * Name
 * SSN
 * Age
 * Salary
 */
	//sensitive data make change secure private
	private String Name;
	 private long SSN;
	private byte Age;
	private double Salary;
	
	//getter and setter for: Name
	//setter,if I want change name create setter
	public void setName(String Name) {
		this.Name=Name;
	}//this method modify  ins variable
	
	//getter 
	public String getName() {
		return Name;
	}
	 //getter and setter for: SSN
	public long getSSN() {
		return SSN;
	}
	public void setSSN(long SSN) {
		this.SSN=SSN;
	}
	 //getter and setter for: Age
	public byte getAge() {
		return Age;
	}
	
	public void setAge(byte Age) {
		this.Age=Age;
	}
	
	//getter and setter for: Salary
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double  wage) {
		wage=Salary;
	}
	
	//setInfo
	public void setInfo(String Name,long SSN,byte Age,double Salary) {
		this.Name=Name;
		this.Age=Age;
		this.Salary=Salary;
	}
	
}
