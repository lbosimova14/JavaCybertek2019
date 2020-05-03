package Lesson23_Abstraction;

public abstract class Animal {
	public static void main(String[] args) {
		
	}
	public abstract void eat();
	
	public abstract void sleep();
	
}
//concrete
class Cat extends Animal{
	//sub           super
	@Override
	public void eat() {
		System.out.println("cat eating fish");
	}
	@Override
	public void sleep() {
		System.out.println("cat sleeps 14 hours");
	}
}

class  Tiger extends Animal{
	public void eat() {
		System.out.println("tiger eates deer");
	}
	public void sleep() {
		System.out.println("tiger sleeps 5 hours");
	}
	
}

//create test class for excute it
class Test{
	public static void main(String[] args) {
		Tiger obj =new Tiger();
		obj.eat();
		obj.sleep();
		
	}
}
