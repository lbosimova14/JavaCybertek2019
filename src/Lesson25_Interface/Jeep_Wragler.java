package Lesson25_Interface;

public class Jeep_Wragler implements Cars, GasVehicles{

	@Override
	public void start() {
		System.out.println("Call Mechanic");
		System.out.println("turn the machine");
		System.out.println("drive");
		
	}

	@Override
	public void PumpGas() {
		System.out.println("Pumping gas");
		
	}

	@Override
	public void selfParking() {
		System.out.println("Jeep is self parking");
		
	}

}
