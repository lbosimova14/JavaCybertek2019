
public class Automobile {
	
	private String manufacturer;
	private int numberOfCylinder;
	String model;
	
	private  int speed;
	
	
	//default  constructor
	public Automobile() {
		
	}
	
	//parameterized constructor
	public Automobile(String manufacturer, int numberOfCylinder, String model, int speed) {
		super();
		this.manufacturer = manufacturer;
		this.numberOfCylinder = numberOfCylinder;
		this.model = model;
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//public methods
	public void accelerate() {
		System.out.println("accelerate method");
		
	}
  private void addGas() {
		System.out.println("gaz");
	}
	
	
	
}
