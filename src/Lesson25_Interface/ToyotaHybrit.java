package Lesson25_Interface;

public class ToyotaHybrit implements Cars, ElectricVehicles,GasVehicles{

	@Override
	public void PumpGas() {
		System.out.println("pumpin gas");
		
	}

	@Override
	public void Charge() {
		System.out.println("Charging");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("self driving");
		
	}

	@Override
	public void start() {
		System.out.println("push the button");
		
	}

	@Override
	public void fly() {
	   System.out.println("toyota is flying");
		
	}

	@Override
	public void selfParking() {
		System.out.println("toyota is self Parking");
		
	}

}
