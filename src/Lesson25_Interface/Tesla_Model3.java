package Lesson25_Interface;


public class Tesla_Model3 implements Cars, ElectricVehicles{
	
	//override Cars interface methods,delete abstract keyword, bc we need implement
	public  void start() {
		System.out.println("Voice Control \"Testla \"");
		
	}
	//overriding ElectricVehicles interface methods and implementing
	public  void Charge() {
		System.out.println("Charging");
	}
	 public  void SelfDrive() {
		   System.out.println("Self driving");
		   
	   }
	@Override
	public void fly() {
		System.out.println("Tesla is fluying");
		
	}

}
