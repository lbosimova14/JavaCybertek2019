package Lesson14_InstanceVariable;

public class EmployeeObjects {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee("Rawa", "9999", 20, "78-89", "CEO", 20000);
		Employee obj2=new Employee("Madina","2222",25,"22-33","SDET",85000);
		
		obj1.getInfo();
		obj2.getInfo();

	}

}
