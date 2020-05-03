
public class Demo {

	public static void main(String[] args) {
		sportsCar car=new sportsCar();
		//car.speed;
		System.out.println(car.model);
		car.setSpeed(34);
		System.out.println(car.getSpeed());
        car.accelerate();
        //car.addGas();
	}

}
