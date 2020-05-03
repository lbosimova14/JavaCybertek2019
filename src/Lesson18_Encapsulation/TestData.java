package Lesson18_Encapsulation;
//class:
//Actions===> getter:  instance method that returns the private data for reader only,method must match with the
//data-type of the instance variable,does not pass any parameter, only return value,in order to read it
     //       setter:Setter(modify)
public class TestData {
	//instance variable:belongs to object,each object has own copy instance variable,100 of new data
	private String Name="Beka";//able to access outside class, all any kind of class in eclipse
	private int ID=897;
    //getter read
	public String getName() {
		return Name;
	}
	
	public int getID() {
		return ID;
	}

	//setter: to read change the value,why void bc just want change value,and take argument and argument assign to Name
	public void setName(String Name) {
		this.Name = Name;
	}
	public void setID(int ID) {
	this.ID=ID;
	}
	
	
	
	
	
	
	
	

}//class ending
