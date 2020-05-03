
public class sportsCar extends Automobile{
	
	double price;
	
	
	
	public sportsCar() {
		this("Red");
		
	}


	public sportsCar(String manufacturer, int numberOfCylinder, String model, int speed,double price) {
		//this();
		super(manufacturer, numberOfCylinder, model, speed);
		
		this.price=price;
	}
    public sportsCar(String color) {
    	
    }

	@Override
	public void accelerate() {
		System.out.println("accelerate methdo added");
		
	}
	
	
	private void addGas() {
		System.out.println("gaz method");
	}

}
